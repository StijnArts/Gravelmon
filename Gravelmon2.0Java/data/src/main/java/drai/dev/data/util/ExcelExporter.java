package drai.dev.data.util;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.mega.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import org.apache.commons.lang3.*;
import org.apache.commons.lang3.mutable.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ExcelExporter {
    public static void exportPokemonData(List<Game> games, String documentName, boolean disallowPasswordMon) {
        var modeledPokemon = new ArrayList<WorldRepresentablePokemon>();
        String userHome = System.getProperty("user.home");

        // Construct the path to the Desktop folder
        String desktopPath = Paths.get(userHome, "Desktop").toString();
        try (FileOutputStream fileOut = new FileOutputStream(desktopPath + "\\Google Drive\\"+documentName+".xlsx")) {
            Workbook workbook = new XSSFWorkbook();
            var mutableInt = new MutableInt(0);
            String modeledPokemonSheetName = "Modeled Pokemon";
            Sheet modeledPokemonSheet = workbook.createSheet(modeledPokemonSheetName);
            var sortedGames = new ArrayList<>(games).stream().sorted(Comparator.comparing(Game::getCleanName)).toList();
            for (int i = 0; i < sortedGames.size(); i++) {
                var game = sortedGames.get(i);
                List<Pokemon> pokemonList = new ArrayList<>(game.getNewPokemon()); // Get Pokémon from the game
                if(disallowPasswordMon){
                    var passwordProtectedLabels = Label.getPasswordProtectedLabels();
                    pokemonList = game.getNewPokemon().stream()
                            .filter(pokemon -> Collections.disjoint(pokemon.getLabels(), passwordProtectedLabels.keySet())).toList();
                }
                if (pokemonList.isEmpty()) continue; // Skip empty games
                pokemonList = pokemonList.stream().sorted(Comparator.comparingInt(Pokemon::getPokedexNumber)).toList();
                List<WorldRepresentablePokemon> pokemonAndMegas = new ArrayList<>();
                pokemonList.forEach(pokemon -> {
                    pokemonAndMegas.add(pokemon);
                    var key = pokemon.getCleanName();
                    if (pokemon.getAdditionalAspect() != null) {
                        key = pokemon.getAdditionalFormKey();
                    }
                    if (GravelmonMegas.MEGA_EVOLUTIONS.containsKey(key)) {
                        List<MegaEvolution> megas = GravelmonMegas.MEGA_EVOLUTIONS.get(key).stream().filter(mega -> mega.getAspect().replaceAll("_", "").equalsIgnoreCase(pokemon.getAdditionalAspect().getName())).toList();
                        pokemonAndMegas.addAll(megas);
                    }
                });
                var sheetName = StringUtils.capitalize(game.getName());
                // Create a new sheet for the game
                Sheet sheet = workbook.createSheet(sheetName);
                createSheet(sheet, workbook, sheetName, pokemonAndMegas, mutableInt);

                pokemonAndMegas.forEach(pokemon->{
                    if(pokemon.isModeled()) modeledPokemon.add(pokemon);
                });
            }

            createSheet(modeledPokemonSheet, workbook, modeledPokemonSheetName, modeledPokemon, mutableInt);

            // Save the Excel file
            workbook.write(fileOut);
            workbook.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Excel file created: "+documentName+".xlsx");
    }

    private static void createSheet(Sheet sheet, Workbook workbook, String sheetName, List<WorldRepresentablePokemon> pokemonList, MutableInt mutableInt) {
        // Create header row
        Row header = sheet.createRow(0);
        String[] headers = {"Name", "Form", "Image      ", "Stats", "Type(s)", "Level Up Moves", "TM Moves", "Tutor Moves",
                "Egg Moves", "Evolutions", "Spawn Conditions"};
        CellStyle headerStyle = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setBold(true);
        headerStyle.setFont(font);

        for (int i = 0; i < headers.length; i++) {
            Cell cell = header.createCell(i);
            cell.setCellValue(headers[i]);
            cell.setCellStyle(headerStyle);
        }

        var wrapTextStyle = workbook.createCellStyle();
        wrapTextStyle.setWrapText(true);
        // Fill in Pokémon data
        int rowNum = 1;

        for (int i = 0; i < pokemonList.size(); i++) {
            var worldRepresentablePokemon = pokemonList.get(i);
            var cellCount = new MutableInt(0);
            Row row = sheet.createRow(rowNum++);
            row.setHeightInPoints(64);
            var isMega = false;
            MegaEvolution asMega =null;
            Pokemon asPokemon =null;
            if(worldRepresentablePokemon instanceof MegaEvolution megaEvolution){
                isMega = true;
                asMega = megaEvolution;
            } else {
                asPokemon = (Pokemon) worldRepresentablePokemon;
            }
            createNextCell(row, cellCount).setCellValue(isMega? asMega.getNonMegaCleanName() : worldRepresentablePokemon.getCleanName());
            createNextCell(row, cellCount).setCellValue(isMega?
                    (asMega.getAspect() == null ? asMega.getMegaName() :  asMega.getAspect().toLowerCase().replaceAll("_", "") + " " + asMega.getMegaName()) :                    (asPokemon.getAdditionalAspect() == null ? "" : asPokemon.getAdditionalAspect().getName()));

            //Image
            var imageCell = createNextCell(row, cellCount);
            imageCell.setCellFormula("Image(\"https://raw.githubusercontent.com/StijnArts/Gravelmon/refs/heads/main/Gravelmon2.0Java/common/src/main/resources/assets/cobblemon/textures/pokemon/" +
                    "/" + GravelmonUtils.getCleanName(worldRepresentablePokemon.getGameName()) + "/" + worldRepresentablePokemon.getCleanName() + ".png\")");

            // Format stats into a single string
            String stats = String.format("HP: %d,\n ATK: %d,\n DEF: %d,\n SPA: %d,\n SPDEF: %d,\n SPD: %d",
                    worldRepresentablePokemon.getStats().getHP(),
                    worldRepresentablePokemon.getStats().getAttack(),
                    worldRepresentablePokemon.getStats().getDefence(),
                    worldRepresentablePokemon.getStats().getSpecialAttack(),
                    worldRepresentablePokemon.getStats().getSpecialAttack(),
                    worldRepresentablePokemon.getStats().getSpeed());
            Cell statsCell = createNextCell(row, cellCount);
            statsCell.setCellValue(stats);
            statsCell.setCellStyle(wrapTextStyle);

            // Type(s) and Moves as comma-separated values

            createNextCell(row, cellCount).setCellValue(String.join(",\n", worldRepresentablePokemon.getTypes().stream().map(Type::getName).toList()));
            if(!isMega){
                createNextCell(row, cellCount).setCellValue(String.join(",\n", asPokemon.getLevelUpMoves().stream().map(moveLearnSetEntry ->
                        moveLearnSetEntry.getCondition() + " - " + StringUtils.capitalize(moveLearnSetEntry.getMove().name().toLowerCase().replaceAll("_", ""))).toList()));
                createNextCell(row, cellCount).setCellValue(String.join(",\n", asPokemon.getTMMoves().stream().map(moveLearnSetEntry ->
                        StringUtils.capitalize(moveLearnSetEntry.getMove().name().toLowerCase().replaceAll("_", ""))).toList()));
                createNextCell(row, cellCount).setCellValue(String.join(",\n", asPokemon.getTutorMoves().stream().map(moveLearnSetEntry ->
                        StringUtils.capitalize(moveLearnSetEntry.getMove().name().toLowerCase().replaceAll("_", ""))).toList()));
                createNextCell(row, cellCount).setCellValue(String.join(",\n", asPokemon.getEggMoves().stream().map(moveLearnSetEntry ->
                        StringUtils.capitalize(moveLearnSetEntry.getMove().name().toLowerCase().replaceAll("_", ""))).toList()));
                // Evolution (handling null values)
                List<String> evolutionsForPrint = asPokemon.getEvolutionsForPrint();
                createNextCell(row, cellCount).setCellValue(evolutionsForPrint.isEmpty() ? "" :
                        String.join(",\n",  evolutionsForPrint));

                // Spawn Conditions (handling null values)
                createNextCell(row, cellCount).setCellValue(asPokemon.getSpawnData().isEmpty() ? "" :
                        String.join(",\n", asPokemon.getSpawnData().stream().map(PokemonSpawnData::toString).toList()));
            }


            if(!sheetName.equals("Modeled Pokemon")){
                mutableInt.increment();
            }
        }
        // Create table based on filled data
        if(sheetName.equals("Modeled Pokemon")){
            Row row = sheet.createRow(++rowNum);
            createNextCell(row, new MutableInt()).setCellValue("Total Number of Pokemon:");
            createNextCell(row, new MutableInt()).setCellValue(mutableInt.getValue());
        }
        int lastRowNum = sheet.getLastRowNum(); // Get the last row
        AreaReference areaRef = new AreaReference("A1:K" + (lastRowNum + 1), workbook.getSpreadsheetVersion()); // Table range
        XSSFSheet xssfSheet = (XSSFSheet) sheet;
        XSSFTable table = xssfSheet.createTable(areaRef); // Create the table
        table.setName(sheetName + " Table"); // Give the table a name
        // Auto-size columns for readability
        for (int i = 0; i < headers.length; i++) {
//            if(i == 2) {
//                sheet.setColumnWidth(2, 64);
//                continue;
//            }
            sheet.autoSizeColumn(i);
        }
        sheet.setColumnHidden(2, false);
    }

    private static Cell createNextCell(Row row, MutableInt cellCount) {
        var cell = row.createCell(cellCount.intValue());
        cellCount.increment();
        return cell;
    }
}
