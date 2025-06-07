package drai.dev.data.util;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.*;

public class SpawnDefinitionConverter {
    public static void updateSpawnDefinitionInFile(Pokemon pokemon) {
        String className = pokemon.getClass().getName(); // e.g. "com.example.pokemon.MyPokemon"
        Path filePath = Path.of("C:\\Users\\Stijn\\Desktop\\Gravelmon\\packaging\\Gravelmon2.0Java\\data\\src\\main\\java", className.replace('.', '/') + ".java");
        try {
            String content = Files.readString(filePath);
            StringBuilder updatedContent = new StringBuilder();

            int currentIndex = 0;

            while (true) {
                int start = content.indexOf("SpawnContext.", currentIndex);
                if (start == -1) break;

                // Find the matching closing "List.of());"
                int listOfEnd = findListOfEnd(content, start);
                if (listOfEnd == -1) break;

                // Extract old block
                String oldBlock = content.substring(start, listOfEnd + "List.of());".length());

                // Replace with new block
                String newBlock = convertOldBlockToBuilder(pokemon.getSpawnData().getFirst(), pokemon.getLabels(), pokemon.evolutionStage, pokemon.preEvolutionSpawnPool, pokemon.preEvolutionSpawnWeight);
                updatedContent.append(content, currentIndex, start);
                updatedContent.append(newBlock);

                currentIndex = listOfEnd + "List.of());".length();
            }

            // Append the remaining content
            updatedContent.append(content.substring(currentIndex));

            // Write back to file
            Files.writeString(filePath, updatedContent.toString());

            System.out.println("Updated spawn definitions in: " + filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int findListOfEnd(String content, int fromIndex) {
        int index = fromIndex;
        int listCount = 0;
        while (index < content.length() - 6) {
            if (content.startsWith("List.of(", index)) {
                listCount++;
                index += 8;
            } else if (content.startsWith(")", index)) {
                listCount--;
                if (listCount == 0) {
                    int semicolon = content.indexOf(";", index);
                    if (semicolon != -1) return semicolon;
                }
                index++;
            } else {
                index++;
            }
        }
        return -1;
    }

    public static String convertOldBlockToBuilder(PokemonSpawnData old, List<Label> labels, int stage, SpawnPool preEvolutionSpawnPool, double preEvolutionSpawnWeight) {
        StringBuilder sb = new StringBuilder("new PokemonSpawnDataBuilder("+stage+")\n");

        if (labels == null) labels = new ArrayList<>();
        if (labels.stream().anyMatch(l -> l == Label.STARTER)) {
            sb.append("    .starter()\n");
        } else if (labels.stream().anyMatch(l -> l == Label.PSEUDO_LEGENDARY)) {
            sb.append("    .pseudoLegend()\n");
        } else if (labels.stream().anyMatch(l -> l == Label.SUB_LEGENDARY)) {
            sb.append("    .subLegend()\n");
        } else if (labels.stream().anyMatch(l -> l == Label.LEGENDARY)) {
            sb.append("    .legend()\n");
        } else if (labels.stream().anyMatch(l -> l == Label.EEVEELUTION)) {
            sb.append("    .eeveelution()\n");
        } else if (labels.stream().anyMatch(l -> l == Label.FOSSIL)) {
            sb.append("    .fossil()\n");
        } else if (labels.stream().anyMatch(l -> l == Label.ULTRA_BEAST || l == Label.PARADOX)) {
            sb.append("    .abnormality()\n");
        } else if (labels.stream().anyMatch(l -> l == Label.MYTHICAL)) {
            sb.append("    .mythical()\n");
        } else {
            // Context, Pool, Weight
            var spawnPool = old.getSpawnPool();
            if(preEvolutionSpawnPool!=null) spawnPool = preEvolutionSpawnPool;
            sb.append("    .setPool(SpawnPool.").append(spawnPool).append(")\n");
            sb.append("    .setMinLevel(").append(old.getMinSpawnLevel()).append(")\n");
            var weight = old.getSpawnWeight();
            var accurateStage = stage;
            if(preEvolutionSpawnWeight != 0) weight = preEvolutionSpawnWeight;
            if(preEvolutionSpawnWeight != 0) accurateStage = stage-1;
            var approxWeightEnum = resolveWeightEnum(weight, accurateStage); // use stage = 1 or calculate
            sb.append(approxWeightEnum);
        }


        sb.append("    .setContext(SpawnContext.").append(old.getSpawnContext()).append(")\n");

        // Biomes
        var biomeCondition = old.getBiomeSpawnCondition();
        if (!biomeCondition.getBiomes().isEmpty()) {
            sb.append("    .setBiomes(")
                    .append(biomeCondition.getBiomes().stream().map(e->"Biome."+e.toString()).collect(Collectors.joining(", ")))
                    .append(")\n");
        }

        // Anti-biomes
        var antiBiomeCondition = old.getAntiBiomeSpawnCondition();
        if (!antiBiomeCondition.getBiomes().isEmpty()) {
            sb.append("    .setAntiBiomes(")
                    .append(antiBiomeCondition.getBiomes().stream().map(e->"Biome."+e.toString()).collect(Collectors.joining(", ")))
                    .append(")\n");
        }

        // Conditions
        for (SpawnCondition condition : old.getSpawnConditions()) {
            switch (condition.getConditionKind()) {
                case CANSEESKY -> sb.append("    .canSeeSky()\n");
                case TIMERANGE -> {
                    if (condition.getCondition().equalsIgnoreCase("night")) {
                        sb.append("    .atNight()\n");
                    } else if (condition.getCondition().equalsIgnoreCase("day")) {
                        sb.append("    .duringDaytime()\n");
                    }
                }
                case IS_RAINING -> {
                    if ("true".equalsIgnoreCase(condition.getCondition()))
                        sb.append("    .isRaining()\n");
                    else
                        sb.append("    .isNotRaining()\n");
                }
                case IS_THUNDERING -> sb.append("    .isThundering()\n");
                case MINY -> sb.append("    .aboveY(").append(condition.getCondition()).append(")\n");
                case MAXY -> sb.append("    .belowY(").append(condition.getCondition()).append(")\n");
                case BIOMES -> sb.append(""); // Handled above
                default -> sb.append("    /*unhandled condition: ").append(condition).append("*/\n");
            }
        }

        // Anti-conditions
        for (SpawnCondition condition : old.getSpawnAntiConditions()) {
            if (condition.getConditionKind() != SpawnConditionType.BIOMES) {
                sb.append("    // unhandled anti-condition: ").append(condition).append("\n");
            }
        }
        if (!old.getRequiredBlocks().isEmpty()) {
            sb.append("    .setRequiredBlock(")
                    .append(old.getRequiredBlocks().stream()
                            .map(s -> "\"" + s + "\"")
                            .collect(Collectors.joining(", ")))
                    .append(")\n");
        }

        // Spawn presets
        if (!old.getSpawnPresets().isEmpty()) {
            sb.append("    .setSpawnPreset(")
                    .append(old.getSpawnPresets().stream().map(e->"SpawnPreset."+e.toString()).collect(Collectors.joining(", ")))
                    .append(")\n");
        }

        // Required blocks (not covered by SpawnConditionType)
        if (!old.getRequiredBlocks().isEmpty()) {
            sb.append("    .setRequiredBlock(")
                    .append(old.getRequiredBlocks().stream().map(b -> "\"" + b + "\"").collect(Collectors.joining(", ")))
                    .append(")\n");
        }

        sb.append("    .build(), List.of());\n\t");
        return sb.toString();
    }

    private static String resolveWeightEnum(double actualWeight, int stage) {
        SpawnWeight closest = null;
        double smallestDiff = Double.MAX_VALUE;

        for (SpawnWeight sw : SpawnWeight.values()) {
            double adjustedWeight = sw.getWeight(stage);
            double diff = Math.abs(actualWeight - adjustedWeight);
            if (diff < smallestDiff) {
                smallestDiff = diff;
                closest = sw;
            }
        }

        // Always returns a SpawnWeight enum name, never raw double
        return "    .setWeight(SpawnWeight." + closest.name() + ")\n";
    }
}
