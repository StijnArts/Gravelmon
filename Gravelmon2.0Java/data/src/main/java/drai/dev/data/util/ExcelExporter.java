package drai.dev.data.util;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.*;
import drai.dev.gravelmon.mega.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import org.apache.commons.lang3.*;
import org.apache.commons.lang3.mutable.*;
import org.apache.poi.common.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.util.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ExcelExporter {
    public static void exportPokemonAssetData(List<Game> games) {
        var modeledPokemon = new ArrayList<WorldRepresentablePokemon>();
        String userHome = System.getProperty("user.home");
        var documentName = "Gravelmon x Cobblemania Assets";

        String desktopPath = Paths.get(userHome, "Desktop").toString();
        try (FileOutputStream fileOut = new FileOutputStream(desktopPath + "\\Google Drive\\" + documentName + ".xlsx")) {

            Workbook workbook = new XSSFWorkbook();
            CreationHelper createHelper = workbook.getCreationHelper();

            var sortedGames = games.stream()
                    .sorted(Comparator.comparingInt((Game g) -> g.priority)
                            .thenComparing(Game::getCleanName))
                    .toList();

            Sheet indexSheet = workbook.createSheet("Index");
            int idxRow = 0;

            Row indexHeader = indexSheet.createRow(idxRow++);
            indexHeader.createCell(0).setCellValue("Game");
            indexHeader.createCell(1).setCellValue("Priority");
            indexHeader.createCell(3).setCellValue("Wiki");

            CellStyle linkStyle = workbook.createCellStyle();
            Font linkFont = workbook.createFont();
            linkFont.setUnderline(Font.U_SINGLE);
            linkFont.setColor(IndexedColors.BLUE.getIndex());
            linkStyle.setFont(linkFont);

            Map<Game, String> gameSheetNames = new HashMap<>();

            for (Game game : sortedGames) {
                List<Pokemon> pokemonList = new ArrayList<>(game.getNewPokemon());
                var passwordProtectedLabels = Label.getPasswordProtectedLabels();
                pokemonList = pokemonList.stream()
                        .filter(pokemon -> Collections.disjoint(pokemon.getLabels(), passwordProtectedLabels.keySet()))
                        .toList();
                if (pokemonList.isEmpty()) continue;
                pokemonList = pokemonList.stream().sorted(Comparator.comparingInt(Pokemon::getPokedexNumber)).toList();

                List<WorldRepresentablePokemon> pokemonAndMegas = new ArrayList<>();
                pokemonList.forEach(pokemon -> {
                    pokemonAndMegas.add(pokemon);
                    var key = pokemon.getCleanName();
                    if (pokemon.getAdditionalAspect() != null) {
                        key = pokemon.getAdditionalFormKey();
                    }
                    if (GravelmonMegas.MEGA_EVOLUTIONS.containsKey(key)) {
                        List<MegaEvolution> megas = GravelmonMegas.MEGA_EVOLUTIONS.get(key)
                                .stream()
                                .filter(mega -> {
                                    if (mega.getAspect() == null) {
                                        return mega.getAspect() == null && pokemon.getAdditionalAspect() == null;
                                    }
                                    if (pokemon.getAdditionalAspect() != null)
                                        return mega.getAspect().replaceAll("_", "").equalsIgnoreCase(pokemon.getAdditionalAspect().getName());
                                    return false;
                                }).toList();
                        pokemonAndMegas.addAll(megas);
                    }
                });

                var sheetName = StringUtils.capitalize(game.getName());
                Sheet sheet = workbook.createSheet(sheetName);
                createAssetSheet(sheet, workbook, sheetName, pokemonAndMegas);

                gameSheetNames.put(game, sheetName);

                Row row = indexSheet.createRow(idxRow++);

                Cell assetCell = row.createCell(0);
                assetCell.setCellValue("Open");
                Hyperlink sheetLink = createHelper.createHyperlink(HyperlinkType.DOCUMENT);
                sheetLink.setAddress("'" + sheetName + "'!A1");
                assetCell.setHyperlink(sheetLink);
                sheetLink.setLabel(sheetName);
                assetCell.setCellStyle(linkStyle);
                row.createCell(1).setCellValue(game.priority);

                Cell wikiCell = row.createCell(2);
                wikiCell.setCellValue("Wiki");
                if (game.wikiUrl != null && !game.wikiUrl.isBlank()) {
                    Hyperlink wikiLink = createHelper.createHyperlink(HyperlinkType.URL);
                    wikiLink.setAddress(game.wikiUrl);
                    wikiLink.setLabel("Wiki");
                    wikiCell.setHyperlink(wikiLink);
                    wikiCell.setCellStyle(linkStyle);
                }
            }

            int lastRowNum = indexSheet.getLastRowNum();
            AreaReference indexArea = new AreaReference(
                    "A1:D" + (lastRowNum + 1),
                    workbook.getSpreadsheetVersion()
            );

            XSSFSheet xssfIndex = (XSSFSheet) indexSheet;
            XSSFTable indexTable = xssfIndex.createTable(indexArea);
            indexTable.setName("IndexTable");
            indexTable.setDisplayName("IndexTable");

            for (int c = 0; c < 4; c++) indexSheet.autoSizeColumn(c);

            String modeledPokemonSheetName = "Modeled Pokemon";
            Sheet modeledPokemonSheet = workbook.createSheet(modeledPokemonSheetName);
            createAssetSheet(modeledPokemonSheet, workbook, modeledPokemonSheetName, modeledPokemon);

            workbook.write(fileOut);
            workbook.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Excel file created: " + documentName + ".xlsx");
    }

    public static void exportPokemonData(List<Game> games, String documentName, boolean disallowPasswordMon) {
        var modeledPokemon = new ArrayList<WorldRepresentablePokemon>();
        String userHome = System.getProperty("user.home");

        // Construct the path to the Desktop folder
        String desktopPath = Paths.get(userHome, "Desktop").toString();
        try (FileOutputStream fileOut = new FileOutputStream(desktopPath + "\\Google Drive\\" + documentName + ".xlsx")) {
            Workbook workbook = new XSSFWorkbook();
            var mutableInt = new MutableInt(0);
            String modeledPokemonSheetName = "Modeled Pokemon";
            Sheet modeledPokemonSheet = workbook.createSheet(modeledPokemonSheetName);
            var sortedGames = new ArrayList<>(games).stream().sorted(Comparator.comparing(Game::getCleanName)).toList();
            for (int i = 0; i < sortedGames.size(); i++) {
                var game = sortedGames.get(i);
                List<Pokemon> pokemonList = new ArrayList<>(game.getNewPokemon()); // Get Pokémon from the game
                if (disallowPasswordMon) {
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
                        List<MegaEvolution> megas = GravelmonMegas.MEGA_EVOLUTIONS.get(key)
                                .stream()
                                .filter(mega -> {
                                    if (mega.getAspect() == null) {
                                        return mega.getAspect() == null && pokemon.getAdditionalAspect() == null;
                                    }
                                    if (pokemon.getAdditionalAspect() != null)
                                        return mega.getAspect().replaceAll("_", "").equalsIgnoreCase(pokemon.getAdditionalAspect().getName());
                                    return false;
                                }).toList();
                        pokemonAndMegas.addAll(megas);
                    }
                });
                var sheetName = StringUtils.capitalize(game.getName());
                // Create a new sheet for the game
                Sheet sheet = workbook.createSheet(sheetName);

                createSheet(sheet, workbook, sheetName, pokemonAndMegas, mutableInt);

                pokemonAndMegas.forEach(pokemon -> {
                    if (pokemon.isModeled()) modeledPokemon.add(pokemon);
                });
            }

            createSheet(modeledPokemonSheet, workbook, modeledPokemonSheetName, modeledPokemon, mutableInt);

            // Save the Excel file
            workbook.write(fileOut);
            workbook.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Excel file created: " + documentName + ".xlsx");
    }

    private static void createSheet(Sheet sheet, Workbook workbook, String sheetName, List<WorldRepresentablePokemon> pokemonList, MutableInt mutableInt) {
        // Create header row
        Row header = sheet.createRow(0);
        String[] headers = {"Name", "Form", "Image", "Stats", "Type(s)", "Abilities", "Level Up Moves", "TM Moves", "Tutor Moves",
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
            MegaEvolution asMega = null;
            Pokemon asPokemon = null;
            if (worldRepresentablePokemon instanceof MegaEvolution megaEvolution) {
                isMega = true;
                asMega = megaEvolution;
            } else {
                asPokemon = (Pokemon) worldRepresentablePokemon;
            }
            createNextCell(row, cellCount).setCellValue(isMega ? asMega.getNonMegaCleanName() : worldRepresentablePokemon.getCleanName());
            createNextCell(row, cellCount).setCellValue(isMega ?
                    (asMega.getAspect() == null ? asMega.getMegaName() : asMega.getAspect().toLowerCase().replaceAll("_", "") + " " + asMega.getMegaName()) : (asPokemon.getAdditionalAspect() == null ? "" : asPokemon.getAdditionalAspect().getName()));

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
            createNextCell(row, cellCount).setCellValue(String.join(",\n", worldRepresentablePokemon.getPrintableAbilities()));
            if (!isMega) {
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
                        String.join(",\n", evolutionsForPrint));

                // Spawn Conditions (handling null values)
                createNextCell(row, cellCount).setCellValue(asPokemon.getSpawnData().isEmpty() ? "" :
                        String.join(",\n", asPokemon.getSpawnData().stream().map(PokemonSpawnData::toString).toList()));
            }


            if (!sheetName.equals("Modeled Pokemon")) {
                mutableInt.increment();
            }
        }
        // Create table based on filled data
        if (sheetName.equals("Modeled Pokemon")) {
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
            sheet.autoSizeColumn(i);
        }
        sheet.setColumnHidden(2, false);
    }

    private static Cell createNextCell(Row row, MutableInt cellCount) {
        var cell = row.createCell(cellCount.intValue());
        cellCount.increment();
        return cell;
    }

    private static void createAssetSheet(
            Sheet sheet,
            Workbook workbook,
            String sheetName,
            List<WorldRepresentablePokemon> pokemonList
    ) {
        // Animation names must be written in a consistent order
        List<String> allAnimationKeys = List.of(
                "battle_idle", "sleep", "faint", "cry", "recoil",

                "ground_idle", "ground_walk", "ground_run",

                "air_idle", "air_fly",

                "water_idle", "water_swim",
                "surface_idle", "surface_swim"
        );

        // Create header row
        Row header = sheet.createRow(0);
        List<String> headers = new ArrayList<>(List.of(
                "Name",
                "Form",
                "Image",
                "Modeled",
                "Can be Modeled?",
                "Approved Texture",
                "Modeller(s)"
        ));
        headers.addAll(allAnimationKeys);

        // Checkmark styles
        CellStyle greenStyle = workbook.createCellStyle();
        greenStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        greenStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle redStyle = workbook.createCellStyle();
        redStyle.setFillForegroundColor(IndexedColors.ROSE.getIndex());
        redStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle headerStyle = workbook.createCellStyle();
        var boldFont = workbook.createFont();
        boldFont.setBold(true);
        headerStyle.setFont(boldFont);

        for (int i = 0; i < headers.size(); i++) {
            Cell c = header.createCell(i);
            c.setCellValue(headers.get(i));
            c.setCellStyle(headerStyle);
        }

        int rowNum = 1;

        for (WorldRepresentablePokemon worldRepresentablePokemon : pokemonList) {
            Row row = sheet.createRow(rowNum++);
            row.setHeightInPoints(64);
            int col = 0;

            boolean isMega = worldRepresentablePokemon instanceof MegaEvolution;
            MegaEvolution mega = isMega ? (MegaEvolution) worldRepresentablePokemon : null;
            Pokemon base = isMega ? null : (Pokemon) worldRepresentablePokemon;

            String name = isMega ? mega.getNonMegaCleanName() : worldRepresentablePokemon.getCleanName();
            String form = isMega
                    ? (mega.getAspect() == null
                    ? mega.getMegaName()
                    : mega.getAspect().toLowerCase().replaceAll("_", "") + " " + mega.getMegaName())
                    : (base.getAdditionalAspect() == null ? "" : base.getAdditionalAspect().getName());

            row.createCell(col++).setCellValue(name);
            row.createCell(col++).setCellValue(form);

            // Image
            String imageFormula =
                    "IMAGE(\"https://raw.githubusercontent.com/StijnArts/Gravelmon/refs/heads/main/Gravelmon2.0Java/common/src/main/resources/assets/cobblemon/textures/pokemon/"
                            + "/" + GravelmonUtils.getCleanName(worldRepresentablePokemon.getGameName()) + "/" + worldRepresentablePokemon.getCleanName() + ".png\")";
            Cell imgCell = row.createCell(col++);
            imgCell.setCellFormula(imageFormula);

            var meta = worldRepresentablePokemon.getModelMetaData();

            row.createCell(col++).setCellValue(worldRepresentablePokemon.isModeled());
            row.createCell(col++).setCellValue(worldRepresentablePokemon.getBasePokemon() == null || !basedOnUnmodeledPokemon(worldRepresentablePokemon.getBasePokemon()));
            row.createCell(col++).setCellValue(meta.getTextureArtists().isEmpty() ? "no" : String.join(", ", meta.getTextureArtists()));
            row.createCell(col++).setCellValue(String.join(", ", meta.getModelers()));

            // Determine expected animations directly from metadata
            Set<String> requiredAnimations = new LinkedHashSet<>(meta.getAnimatorsPerAnimation().keySet());
            Set<String> optionalAnimations = new LinkedHashSet<>(meta.getAnimatorsPerOptionalAnimation().keySet());

            // Remove "look" (ignored everywhere in your logic)
            requiredAnimations.remove("look");
            optionalAnimations.remove("look");

            for (String key : allAnimationKeys) {

                Cell cell = row.createCell(col++);

                // Not expected at all
                if (!requiredAnimations.contains(key) && !optionalAnimations.contains(key)) {
                    cell.setCellValue("-");
                    continue;
                }

                boolean hasAnimators = false;

                if (meta.getAnimatorsPerAnimation().containsKey(key)) {
                    var list = meta.getAnimatorsPerAnimation().get(key).getAnimators();
                    hasAnimators = list != null && !list.isEmpty();
                } else if (meta.getAnimatorsPerOptionalAnimation().containsKey(key)) {
                    var list = meta.getAnimatorsPerOptionalAnimation().get(key).getAnimators();
                    hasAnimators = list != null && !list.isEmpty();
                }

                if (hasAnimators) {
                    cell.setCellValue("✔");
                    cell.setCellStyle(greenStyle);
                } else {
                    cell.setCellValue("✘");
                    cell.setCellStyle(redStyle);
                }
            }
        }

        int lastRowNum = sheet.getLastRowNum();
        AreaReference area = new AreaReference(
                "A1:" +
                        CellReference.convertNumToColString(headers.size() - 1)
                        + (lastRowNum + 1),
                workbook.getSpreadsheetVersion()
        );

        XSSFSheet xssfSheet = (XSSFSheet) sheet;
        XSSFTable table = xssfSheet.createTable(area);
        table.setName(sheetName + "Table");

        for (int i = 0; i < headers.size(); i++) {
            sheet.autoSizeColumn(i);
        }
    }

    private static boolean basedOnUnmodeledPokemon(String basePokemon) {
        return UnmodeledCobblemon.isUnmodeled(basePokemon);
    }

    private static class ExpectedAnimations {
        public final Set<String> required = new LinkedHashSet<>();
        public final Set<String> optional = new LinkedHashSet<>();
    }

    private static ExpectedAnimations collectExpectedAnimations(WorldRepresentablePokemon p) {

        ExpectedAnimations result = new ExpectedAnimations();

        if (!(p instanceof AbstractPokemon ap)) {
            return result;
        }

        result.required.add("battle_idle");
        result.required.add("sleep");
        result.required.add("faint");
        result.required.add("cry");
        result.required.add("recoil");

        if (ap.canFly()) {
            result.required.add("air_idle");
            result.required.add("air_fly");
            result.optional.add("ground_idle");
            result.optional.add("ground_walk");
            return result;
        }

        if (ap.isCanSwimInLava() || ap.canSwim()) {

            result.required.add("water_idle");
            result.required.add("water_swim");

            if (ap.getCanWalkOnWater() || ap.isCanWalkOnLava()) {
                result.required.add("surface_idle");
                result.required.add("surface_swim");
            }

            result.optional.add("ground_idle");
            result.optional.add("ground_walk");

            return result;
        }

        result.required.add("ground_idle");
        result.required.add("ground_walk");
        result.optional.add("ground_run");

        return result;
    }

}
