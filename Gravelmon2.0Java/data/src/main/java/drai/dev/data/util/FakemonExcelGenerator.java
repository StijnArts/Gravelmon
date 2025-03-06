//package drai.dev.data.util;
//
//import drai.dev.data.attributes.*;
//import drai.dev.data.games.registry.*;
//import drai.dev.data.pokemon.*;
//import drai.dev.gravelmon.pokemon.attributes.*;
//import org.apache.poi.common.usermodel.*;
//import org.apache.poi.ss.usermodel.*;
//import org.apache.poi.ss.usermodel.Hyperlink;
//import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.net.*;
//import java.nio.file.*;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.*;
//
//public class FakemonExcelGenerator {
//    public static void generateExcel(String resourcesDir) {
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        CreationHelper createHelper = workbook.getCreationHelper();
//        Sheet gameSheet = workbook.createSheet("Games");
//
//        // Create header row for the Games sheet
//        Row headerRow = gameSheet.createRow(0);
//        headerRow.createCell(0).setCellValue("Game");
//        headerRow.createCell(1).setCellValue("Sheet Link");
//        headerRow.createCell(2).setCellValue("Label");
//
//        int rowIndex = 1;
//        for (var game :  GameRegistry.games) {
//            // Add game to the first sheet
//            Row row = gameSheet.createRow(rowIndex++);
//            row.createCell(0).setCellValue(game.getName());
//
//            // Create hyperlink to the corresponding sheet
//            Cell linkCell = row.createCell(1);
//            Hyperlink link = createHelper.createHyperlink(HyperlinkType.DOCUMENT);
//            link.setAddress("'" + game + "'!A1");
//            linkCell.setHyperlink(link);
//            linkCell.setCellValue("Go to " + game);
//
//            row.createCell(2).setCellValue(game.getCleanName()); // Label
//
//            for (var pokemon : game.getNewPokemon()) {
//                Sheet gameSheetData = workbook.createSheet(game.getName());
//
//                // Create header row
//                Row header = gameSheetData.createRow(0);
//                String[] headers = {"Dex #", "Name", "Type", "Abilities", "Moves", "Spawn Locations",  "Evolution"};
//                for (int i = 0; i < headers.length; i++) {
//                    header.createCell(i).setCellValue(headers[i]);
//                }
//
//                int rowNum = 1;
//                    Row gameSheetDataRow = gameSheetData.createRow(rowNum++);
//                    gameSheetDataRow.createCell(0).setCellValue(pokemon.getPokedexNumber());
//                    gameSheetDataRow.createCell(1).setCellValue(pokemon.getName());
//                    gameSheetDataRow.createCell(2).setCellValue(String.join(", ", pokemon.getTypes().stream().map(Type::toString).toList()));
//                    gameSheetDataRow.createCell(3).setCellValue(String.join(", ", pokemon.getAbilities().stream().map(Ability::toString).toList()));
//                    gameSheetDataRow.createCell(4).setCellValue(String.join(",\n", pokemon.getLearnSet().stream().map(moveLearnSetEntry -> moveLearnSetEntry.getMove().toString() + ": " + moveLearnSetEntry.getCondition()).toList()));
//                    gameSheetDataRow.createCell(5).setCellValue(String.join(",\n", pokemon.getSpawnData().stream().map(PokemonSpawnData::toString).toList()));
//                    gameSheetDataRow.createCell(6).setCellValue(String.join(",\n", pokemon.getEvolutions().stream().map(EvolutionEntry::toString).toList()));
//
//        }
//
//        // Generate sheets for each game
//
//        }
//
//        // Write to file
//        var filepath = findProjectRoot(resourcesDir).toAbsolutePath().toString();
//        try (FileOutputStream fileOut = new FileOutputStream(filepath)) {
//            workbook.write(fileOut);
//            workbook.close();
//            System.out.println("Excel file created: " + filepath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//    public String evolutionEntryToString(EvolutionEntry evolutionEntry) {
//        return "EvolutionEntry{" +
//                "result='" + evolutionEntry.getResult() + '\'' +
//                ", kind=" + evolutionEntry.getKind() +
//                ", consumesHeldItem=" + evolutionEntry.consumesHeldItem() +
//                ", moves=" + listToString(evolutionEntry.getMoves()) +
//                ", requirements=" + listToString(evolutionEntry.getRequirements()) +
//                ", requiredContext='" + evolutionEntry.getRequiredContext() + '\'' +
//                '}';
//    }
//
//    private <T> String listToString(List<T> list) {
//        return list == null || list.isEmpty() ? "[]" : "[" + list.stream().map(Object::toString).collect(Collectors.joining(", ")) + "]";
//    }
//
//    public static Path findProjectRoot(String resourcesDir) {
//        Path currentDir = Path.of(resourcesDir);
//        return currentDir.getParent().getParent().getParent().getParent();
//    }
//}
