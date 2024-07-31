package drai.dev.data.jsonwriters;

import drai.dev.data.pokemon.*;
import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.*;
import org.apache.commons.lang3.*;
import org.jetbrains.annotations.*;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SpeciesAdditionsWriter {
    public static void writeAdditions(String resourcesDir) {
        Pokemon.ADDITIONAL_FORMS.entrySet().forEach(set -> {
            try {
                var dir = resourcesDir + "\\data\\gravelmon\\species_additions\\";
                Files.createDirectories(new File(dir).toPath());
                writePokemon(set, dir, resourcesDir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        Pokemon.ADDITIONAL_EVOLUTIONS.entrySet().stream().filter(stringListEntry -> !Pokemon.ADDITIONAL_FORMS.containsKey(stringListEntry.getKey())).forEach(stringListEntry -> {
            try {
                var dir = resourcesDir + "\\data\\gravelmon\\species_additions\\";
                Files.createDirectories(new File(dir).toPath());
                writeAlternateEvolutions(stringListEntry, dir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        Pokemon.ADDITIONAL_DROPS.entrySet().stream()
                .filter(stringListEntry -> !Pokemon.ADDITIONAL_FORMS.containsKey(stringListEntry.getKey()) && !Pokemon.ADDITIONAL_EVOLUTIONS.containsKey(stringListEntry.getKey()))
                .forEach(stringListEntry -> {
                    try {
                        var dir = resourcesDir + "\\data\\gravelmon\\species_additions\\";
                        Files.createDirectories(new File(dir).toPath());
                        writeAlternateDrops(stringListEntry, dir);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
        Pokemon.ADDITIONAL_PRE_EVOLUTIONS.entrySet().stream()
                .filter(stringListEntry -> !Pokemon.ADDITIONAL_FORMS.containsKey(stringListEntry.getKey()) && !Pokemon.ADDITIONAL_EVOLUTIONS.containsKey(stringListEntry.getKey())
                        && !Pokemon.ADDITIONAL_DROPS.containsKey(stringListEntry.getKey()))
                .forEach(stringListEntry -> {
                    try {
                        var dir = resourcesDir + "\\data\\gravelmon\\species_additions\\";
                        Files.createDirectories(new File(dir).toPath());
                        writeAdditionalPreEvolutions(stringListEntry, dir);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
    }

    private static void writeAdditionalPreEvolutions(Map.Entry<String, String> set, String dir) throws IOException {
        String fileContents =
                "{\n" +
                        "   \"target\": \"cobblemon:" + GravelmonUtils.getCleanName(set.getKey()) + "\",\n";
        fileContents += "  \"preEvolution\": \"" + set.getValue() + "\"\n}";
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + GravelmonUtils.getCleanName(set.getKey()).replaceAll("=false", "") + ".json"));
        writer.write(fileContents);
        writer.close();
    }

    private synchronized static void writeAlternateDrops(Map.Entry<String, List<ItemDrop>> set, String dir) throws IOException {
        String fileContents =
                "{\n" +
                        "   \"target\": \"cobblemon:" + GravelmonUtils.getCleanName(set.getKey()) + "\",\n";
        if (Pokemon.ADDITIONAL_PRE_EVOLUTIONS.containsKey(set.getKey())) {
            fileContents += "  \"preEvolution\": \"" + Pokemon.ADDITIONAL_PRE_EVOLUTIONS.get(set.getKey()) + "\",\n";
        }
        fileContents = getDrops(1, set.getValue(), fileContents) + "\n}";
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + GravelmonUtils.getCleanName(set.getKey()).replaceAll("=false", "") + ".json"));
        writer.write(fileContents);
        writer.close();
    }

    private synchronized static void writeAlternateEvolutions(Map.Entry<String, List<EvolutionEntry>> set, String dir) throws IOException {
        String fileContents =
                "{\n" +
                        "   \"target\": \"cobblemon:" + GravelmonUtils.getCleanName(set.getKey()) + "\",\n";
        if (Pokemon.ADDITIONAL_DROPS.containsKey(set.getKey())) {
            fileContents = getDrops(1, Pokemon.ADDITIONAL_DROPS.get(set.getKey()), fileContents);
        }
        if (Pokemon.ADDITIONAL_PRE_EVOLUTIONS.containsKey(set.getKey())) {
            fileContents += "  \"preEvolution\": \"" + Pokemon.ADDITIONAL_PRE_EVOLUTIONS.get(set.getKey()) + "\",\n";
        }
        fileContents = getEvolutions(GravelmonUtils.getCleanName(set.getKey()), set.getValue(), fileContents).replaceAll("\n  ],\n", "\n  ]\n") + "\n}";
        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + GravelmonUtils.getCleanName(set.getKey()).replaceAll("=false", "") + ".json"));
        writer.write(fileContents);
        writer.close();
    }

    private synchronized static void writePokemon(Map.Entry<String, List<Pokemon>> set, String dir, String resourcesDir) throws IOException {
        String fileContents =
                "{\n" +
                        "   \"target\": \"cobblemon:" + GravelmonUtils.getCleanName(set.getKey()) + "\",\n";
        if (Pokemon.ADDITIONAL_EVOLUTIONS.containsKey(set.getKey())) {
            fileContents = getEvolutions(GravelmonUtils.getCleanName(set.getKey()), Pokemon.ADDITIONAL_EVOLUTIONS.get(set.getKey()), fileContents);
        }
        if (Pokemon.ADDITIONAL_DROPS.containsKey(set.getKey())) {
            fileContents = getDrops(1, Pokemon.ADDITIONAL_DROPS.get(set.getKey()), fileContents);
        }
        if (Pokemon.ADDITIONAL_PRE_EVOLUTIONS.containsKey(set.getKey())) {
            fileContents += "  \"preEvolution\": \"" + Pokemon.ADDITIONAL_PRE_EVOLUTIONS.get(set.getKey()) + "\",\n";
        }
        var features = new ArrayList<String>();
        if (!set.getValue().isEmpty()) {
            fileContents += "   \"forms\": [";
            var isFirstForm = true;
            for (Pokemon pokemon : set.getValue()) {
                if (pokemon.getPrimaryType() == null) {
                    System.out.println(pokemon.getName());
                    throw new InvalidPropertiesFormatException("");
                }
                if (isFirstForm) {
                    isFirstForm = false;
                } else {
                    fileContents += ",\n";
                }
                var aspect = getAccurateAspect(resourcesDir, pokemon);
                fileContents += "{\n" + "  \"name\": \"" + StringUtils.capitalize(aspect) + "\",\n";
                fileContents += "  \"primaryType\": \"" + pokemon.getPrimaryType().getName() + "\",\n";
                if (pokemon.getSecondaryType() != null) {
                    fileContents += "  \"secondaryType\": \"" + pokemon.getSecondaryType().getName() + "\",\n";
                }
                fileContents += "  \"abilities\": [\n";
                int abilities = 0;
                boolean isFirstAbility = true;
                for (Ability ability : pokemon.getAbilities()) {
                    if (ability.isImplemented()) {
                        if (isFirstAbility) {
                            isFirstAbility = false;
                        } else {
                            fileContents += ",\n";
                        }
                        fileContents += "    \"" + ability.getName() + "\"";
                        abilities++;
                    }
                }
                if (abilities == 0) {
                    fileContents += "    \"" + Ability.KEEN_EYE.getName() + "\"";
                }
                if (pokemon.getHiddenAbility() !=null && pokemon.getHiddenAbility().isImplemented()) {
                    fileContents += ",\n    \"h:" + pokemon.getHiddenAbility().getName() + "\"\n";
                }

                fileContents += "  ],\n" +
                        "  \"baseStats\": {\n" +
                        "    \"hp\": " + pokemon.getStats().getHP() + ",\n" +
                        "    \"attack\": " + pokemon.getStats().getAttack() + ",\n" +
                        "    \"defence\": " + pokemon.getStats().getDefence() + ",\n" +
                        "    \"special_attack\": " + pokemon.getStats().getSpecialAttack() + ",\n" +
                        "    \"special_defence\": " + pokemon.getStats().getSpecialDefence() + ",\n" +
                        "    \"speed\": " + pokemon.getStats().getSpeed() + "\n" +
                        "  },\n" +
                        "  \"behaviour\": {\n" +
                        "    \"resting\": {\n" +
                        "        \"canSleep\": " + pokemon.canSleep() + ",\n" +
                        "        \"willSleepOnBed\": " + pokemon.willSleepOnBed() + "," +
                        "        \"depth\": \"normal\",\n" +
                        "        \"light\": \"" + pokemon.getLightLevelMinSleep() + "-" + pokemon.getLightLevelMaxSleep() + "\"\n" +
                        "    },\n" +
                        "    \"moving\": {\n" +
                        "        \"fly\": {\n" +
                        "            \"canFly\": " + pokemon.canFly() + "\n" +
                        "        },\n" +
                        "        \"canLook\": " + pokemon.canLookAround() + ",\n" +
                        "        \"walk\": {\n" +
                        "            \"canWalk\": " + pokemon.canWalk() + ",\n" +
                        "            \"avoidsLand\": " + pokemon.avoidsLand() + "\n" +
                        "        },\n" +
                        "        \"swim\": {\n" +
                        "            \"swimSpeed\": " + pokemon.getSwimSpeed() + ",\n" +
                        "            \"canSwimInWater\": " + pokemon.canSwim() + ",\n";
                if(pokemon.getSpawnContext() == SpawnContext.SURFACE) fileContents += "            \"canWalkOnWater\": true,\n";
                fileContents +=
                        "            \"canBreatheUnderwater\": " + pokemon.canBreathUnderwater() + "\n" +
                        "        }\n" +
                        "    }\n" +
                        "  },\n" +
                        "  \"catchRate\": " + pokemon.getCatchRate() + ",\n" +
                        "  \"maleRatio\": " + pokemon.getMaleRatio() + ",\n" +
                        "  \"shoulderMountable\": " + pokemon.isShoulderMountable() + ",\n";
                if (pokemon.getShoulderMountEffect() != null) {
                    fileContents += "\"shoulderEffects\": [\n" +
                            "    \"" + pokemon.getShoulderMountEffect() + "\"\n" +
                            "  ],";
                }

                if (!pokemon.getForms().isEmpty()) {
                    boolean isFirstFormForm = true;
                    fileContents += "\"forms\": [";
                    for (PokemonForm form : pokemon.getForms()) {
                        if (isFirstFormForm) {
                            isFirstFormForm = false;
                        } else {
                            fileContents += ",\n";
                        }
                        fileContents += generateForm(form, pokemon);
                    }
                    fileContents += "\n],\n";
                }
                fileContents += "  \"baseExperienceYield\": " + pokemon.getBaseExperienceYield() + ",\n" +
                        "  \"experienceGroup\": \"" + pokemon.getExperienceGroup().getName() + "\",\n" +
                        "  \"eggCycles\": " + pokemon.getEggCycles() + ",\n" +
                        "  \"eggGroups\": [\n";
                boolean isFirstEggGroupEntry = true;
                for (EggGroup eggGroup : pokemon.getEggGroups()) {
                    if (isFirstEggGroupEntry) {
                        isFirstEggGroupEntry = false;
                    } else {
                        fileContents += ",\n";
                    }
                    if (eggGroup.isImplemented()) {
                        fileContents += "    \"" + eggGroup.name().toLowerCase() + "\"";
                    } else {
                        fileContents += "    \"" + EggGroup.UNDISCOVERED.name().toLowerCase() + "\"";
                    }
                }
                fileContents += "\n  ],";
                if (!pokemon.getDrops().isEmpty()) {
                    fileContents +=
                            "\n  \"drops\": {\n" +
                                    "    \"amount\": \"" + pokemon.getDropAmount() + "\",\n" +
                                    "    \"entries\": [\n";
                    boolean isFirstDropEntry = true;
                    for (ItemDrop itemDrop : pokemon.getDrops()) {
                        if (isFirstDropEntry) {
                            isFirstDropEntry = false;
                        } else {
                            fileContents += ",\n";
                        }
                        fileContents += "      {\n" +
                                "        \"item\": \"" + itemDrop.getItemId() + "\",\n" +
                                "        \"quantityRange\": \"" + itemDrop.getQuantityMin() + "-" + itemDrop.getQuantityMax() + "\",\n" +
                                "        \"percentage\": " + itemDrop.getChance() + "\n" +
                                "      }";
                    }
                    fileContents += "\n    ]\n" +
                            "  },";
                }
                fileContents += getMoves(pokemon.getLearnSet());
                fileContents += "  \"labels\": [\n";
                boolean isFirstLabelEntry = true;
                for (Label label : pokemon.getLabels()) {
                    if (isFirstLabelEntry) {
                        isFirstLabelEntry = false;
                    } else {
                        fileContents += ",\n";
                    }
                    fileContents += "    \"" + label.getName() + "\"";
                }
                fileContents += "\n  ],\n" +
                        "  \"pokedex\": [\n";

                if (pokemon.isNew()) {
                    fileContents += "    \"cobblemon.species." + pokemon.getCleanName() + ".desc\"\n";
                } else {
                    int dexEntryCounter = 1;
                    for (String entry : pokemon.getDexEntries()) {
                        fileContents += "    \"cobblemon.species." + pokemon.getCleanName() + ".desc" + dexEntryCounter + "\"\n";
                        dexEntryCounter++;
                    }
                }

                fileContents += "  ],\n";
                if (pokemon.getPreEvolution() != null) {
                    fileContents += "  \"preEvolution\": \"" + pokemon.getPreEvolution() + "\",\n";
                }
                var evolutions =
                fileContents = getEvolutions(GravelmonUtils.getCleanName(set.getKey()), pokemon.getEvolutions(), fileContents);

                fileContents +=
                        "  \"baseScale\": " + pokemon.getBaseScale() + ",\n" +
                                "  \"hitbox\": {\n" +
                                "    \"width\": " + pokemon.getHitboxWidth() + ",\n" +
                                "    \"height\": " + pokemon.getHitboxHeight() + ",\n" +
                                "    \"fixed\": false\n" +
                                "  },\n" +
                                "  \"baseFriendship\": " + pokemon.getBaseFriendship() + ",\n" +
                                "  \"evYield\": {\n" +
                                "    \"hp\": " + pokemon.getEvYield().getHP() + ",\n" +
                                "    \"attack\": " + pokemon.getEvYield().getAttack() + ",\n" +
                                "    \"defence\": " + pokemon.getEvYield().getDefence() + ",\n" +
                                "    \"special_attack\": " + pokemon.getEvYield().getSpecialAttack() + ",\n" +
                                "    \"special_defence\": " + pokemon.getEvYield().getSpecialDefence() + ",\n" +
                                "    \"speed\": " + pokemon.getEvYield().getSpeed() + "\n" +
                                "  },\n" +
                                "  \"height\": " + pokemon.getHeight() + ",\n" +
                                "  \"weight\": " + pokemon.getWeight() + ",\n" +
                                "  \"aspects\": [" +
                                "\"" + aspect.toLowerCase() + "\"" +
                                "],\n";
                fileContents += "  \"cannotDynamax\": " + pokemon.cannotDynamax() + "\n" +
                        "}";
                features.add(aspect);
            }
            fileContents += "\n], " +
                    "\"features\": [\n";

            var isFirstFeature = true;
            for (var feature : features) {
                if (isFirstFeature) {
                    isFirstFeature = false;
                } else {
                    fileContents += ",\n";
                }
                fileContents += "\"" + feature.toLowerCase() + "\"";
            }
            fileContents += "\n  ]";

            fileContents += "\n}";
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter(dir + GravelmonUtils.getCleanName(set.getKey()).replaceAll("=false", "") + ".json"));
        writer.write(fileContents);
        writer.close();
    }

    private static String getAccurateAspect(String resourcesDir, Pokemon pokemon) throws IOException {
        var aspect = pokemon.getAdditionalAspect().getName();
        var pokemonName = pokemon.getName();
        for (int i = 0; i < 20; i++) {
            String numberAsWord = EnglishNumberToWords.convert(i);
            if(pokemonName.endsWith(StringUtils.capitalize(numberAsWord.toLowerCase()))){
                aspect += EnglishNumberToWords.convert(i+1);
                SpeciesFeaturesJSONWriter.writeFeature(aspect, resourcesDir);
                return aspect;
            }
        }
        return aspect;
    }

    @NotNull
    private static String getMoves(List<MoveLearnSetEntry> learnSetEntries) {
        var fileContents = "\n  \"moves\": [\n";
        boolean isFirstLearnSetEntry = true;
        var allowedTypes = new ArrayList<>(List.of("sound", "crystal", "nuclear", "cosmic"));
        for (MoveLearnSetEntry moveLearnsetEntry : learnSetEntries) {
            var move = moveLearnsetEntry.getMove();
            var moveName = move.getName();
            if (move.isImplemented()) {
                if (isFirstLearnSetEntry) {
                    isFirstLearnSetEntry = false;
                } else {
                    fileContents += ",\n";
                }
                fileContents += "    \"" + moveLearnsetEntry.getCondition() + ":" + moveName + "\"";
            }
        }
        fileContents += "  ],\n";
        return fileContents;
    }

    private static String getEvolutions(String pokemon, List<EvolutionEntry> evolutions, String fileContents) {
        if (!evolutions.isEmpty()) {
            fileContents += "  \"evolutions\": [\n";
            boolean isFirstEvolution = true;
            for (EvolutionEntry evolution : evolutions) {
                if (isFirstEvolution) {
                    isFirstEvolution = false;
                } else {
                    fileContents += ",\n";
                }
                fileContents += "    {\n" +
                        "      \"id\": \"" + pokemon + "_" + evolution.getResult().replaceAll(" ", "_").replaceAll("\\W", "") + "\",\n" +
                        "      \"variant\": \"" + evolution.getKind().getName() + "\",\n" +
                        "      \"result\": \"" + evolution.getResult();
                if (!evolution.getAspects().isEmpty()) {
                    for (Aspect aspect : evolution.getAspects()) {
                        fileContents += " " + aspect;
                    }
                }
                fileContents += "\",\n" +
                        "      \"consumeHeldItem\": " + evolution.consumesHeldItem() + ",\n";
                if (evolution.hasMoves()) {
                    fileContents += "      \"learnableMoves\": [";
                    boolean isFirstLearnSetEntry = true;
                    for (MoveLearnSetEntry moveLearnsetEntry : evolution.getMoves()) {
                        if (moveLearnsetEntry.getMove().isImplemented()) {
                            if (isFirstLearnSetEntry) {
                                isFirstLearnSetEntry = false;
                            } else {
                                fileContents += ",\n";
                            }
                            fileContents += "    \"" + moveLearnsetEntry.getMove().getName() + "\"";
                        }
                    }
                    fileContents += "],\n";
                } else {
                    fileContents += "      \"learnableMoves\": [],\n";
                }
                fileContents += "      \"requirements\": [\n";
                boolean isFirstRequirement = true;
                for (EvolutionRequirementEntry entry : evolution.getRequirements()) {
                    if (isFirstRequirement) {
                        isFirstRequirement = false;
                    } else {
                        fileContents += ",\n";
                    }
                    if (entry.getCondition().equals(EvolutionRequirementCondition.PARTY_MEMBER.getCondition())) {
                        fileContents += "        {\n" +
                                "          \"variant\": \"" + entry.getRequirementKind() + "\",\n" +
                                "          \"" + entry.getCondition() + "\": " + entry.getConditionParameter() + ",\n" +
                                "          \"contains\": true\n" +
                                "        }";
                    } else {
                        fileContents += "        {\n" +
                                "          \"variant\": \"" + entry.getRequirementKind() + "\",\n" +
                                "          \"" + entry.getCondition() + "\": " + entry.getConditionParameter() + "\n" +
                                "        }";
                    }
                }
                fileContents += "\n      ]";
                if (evolution.getRequiredContext() != null) {
                    fileContents += ",\n" +
                            "      \"requiredContext\": \"" + evolution.getRequiredContext() + "\"";
                }
                fileContents += ",\n" +
                        "      \"permanent\": true";

                fileContents += "   \n }";

            }
            fileContents += "\n  ],\n";
        }
        return fileContents;
    }

    private static String generateForm(PokemonForm form, Pokemon pokemon) {

        String formString =
                "    {\n" +
                        "      \"name\": \"" + form.getFormName() + "\",\n";
        if (!form.getDexEntries().isEmpty()) {
            formString += "      \"pokedex\": [\n";
            int dexEntryCounter = 1;
            for (String entry : form.getDexEntries()) {
                formString += "    \"cobblemon.species." + pokemon.getCleanName() + ".desc" + dexEntryCounter + "\"\n";
                dexEntryCounter++;
            }
            formString += "  ],\n";
        }
        formString += "      \"primaryType\": \"" + form.getPrimaryType().getName() + "\",\n";

        if (form.getSecondaryType() != null) {
            formString += "      \"secondaryType\": \"" + form.getSecondaryType().getName() + "\",\n";
        }
        formString += "      \"abilities\": [\n";
        int abilities = 0;
        boolean isFirstAbility = true;
        for (Ability ability : form.getAbilities()) {
            if (ability.isImplemented()) {
                if (isFirstAbility) {
                    isFirstAbility = false;
                } else {
                    formString += ",\n";
                }
                formString += "    \"" + ability.getName() + "\",\n";
                abilities++;
            }
        }
        if (abilities == 0) {
            formString += "    \"" + Ability.KEEN_EYE.getName() + "\",\n";
        }

        if (pokemon.getHiddenAbility() !=null && pokemon.getHiddenAbility().isImplemented()) {
            formString += "    \"h:" + pokemon.getHiddenAbility().getName() + "\"\n";
        }

        formString +=

                "      ],\n" +
                        "      \"baseScale\": " + form.getBaseScale() + ",\n" +
                        "        \"hitbox\": {\n" +
                        "          \"width\": " + pokemon.getHitboxWidth() + ",\n" +
                        "          \"height\": " + pokemon.getHitboxHeight() + ",\n" +
                        "          \"fixed\": false\n" +
                        "      },\n" +
                        "      \"baseStats\": {\n" +
                        "        \"hp\": " + form.getStats().getHP() + ",\n" +
                        "        \"attack\": " + form.getStats().getAttack() + ",\n" +
                        "        \"defence\": " + form.getStats().getDefence() + ",\n" +
                        "        \"special_attack\": " + form.getStats().getSpecialAttack() + ",\n" +
                        "        \"special_defence\": " + form.getStats().getSpecialDefence() + ",\n" +
                        "        \"speed\": " + form.getStats().getSpeed() + "\n" +
                        "      },\n" +
                        "      \"catchRate\": " + form.getCatchRate() + ",\n" +
                        "      \"maleRatio\": " + form.getMaleRatio() + ",\n" +
                        "      \"baseExperienceYield\": " + form.getBaseExperienceYield() + ",\n" +
                        "      \"baseFriendship\": " + form.getBaseFriendship() + ",\n" +
                        "      \"evYield\": {\n" +
                        "        \"hp\": " + form.getEvYield().getHP() + ",\n" +
                        "        \"attack\": " + form.getEvYield().getAttack() + ",\n" +
                        "        \"defence\": " + form.getEvYield().getDefence() + ",\n" +
                        "        \"special_attack\": " + form.getEvYield().getSpecialAttack() + ",\n" +
                        "        \"special_defence\": " + form.getEvYield().getSpecialDefence() + ",\n" +
                        "        \"speed\": " + form.getEvYield().getSpeed() + "\n" +
                        "      },\n" +
                        "      \"experienceGroup\": \"" + form.getExperienceGroup().getName() + "\",\n" +
                        "      \"eggCycles\": " + form.getEggCycles() + ",\n" +
                        "      \"eggGroups\": [\n";
        boolean isFirstEggGroupEntry = true;
        for (EggGroup eggGroup : pokemon.getEggGroups()) {
            if (isFirstEggGroupEntry) {
                isFirstEggGroupEntry = false;
            } else {
                formString += ",\n";
            }
            if (eggGroup.isImplemented()) {
                formString += "    \"" + eggGroup.name().toLowerCase() + "\"";
            } else {
                formString += "    \"" + EggGroup.UNDISCOVERED.name().toLowerCase() + "\"";
            }
        }

        formString += "\n  ],";
        if (form.getPreEvolution() != null) {
            formString += "  \"preEvolution\": \"" + form.getPreEvolution() + "\",\n";
        }
        if (!form.getLearnSet().isEmpty()) {
            formString += getMoves(form.getLearnSet());
        }
        formString = getDrops(form.getDropAmount(), form.getDrops(), formString);
        formString += "      \"labels\": [\n";
        boolean isFirstLabelEntry = true;
        for (Label label : form.getLabels()) {
            if (isFirstLabelEntry) {
                isFirstLabelEntry = false;
            } else {
                formString += ",\n";
            }
            formString += "    \"" + label.getName() + "\"";
        }
        formString += "\n      ],\n" +
                "      \"aspects\": [\n";
        boolean isFirstAspect = true;
        for (Aspect aspect : form.getAspects()) {
            if (isFirstAspect) {
                isFirstAspect = false;
            } else {
                formString += ",\n";
            }
            formString += "        \"" + aspect.name().toLowerCase() + "\"";
        }
        formString += "\n      ],\n" +
                "      \"height\": " + form.getHeight() / 10 + ",\n" +
                "      \"weight\": " + form.getWeight() * 10 + ",\n";
        if (!form.getEvolutions().isEmpty()) {
            formString += "  \"evolutions\": [\n";
            boolean isFirstEvolutionEntry = true;
            for (EvolutionEntry evolution : form.getEvolutions()) {
                if (isFirstEvolutionEntry) {
                    isFirstEvolutionEntry = false;
                } else {
                    formString += ",\n";
                }
                formString += "    {\n" +
                        "      \"id\": \"" + form.getCleanName() + "_" + pokemon.getCleanName() + "_" + evolution.getResult().split(" ")[0] + "\",\n" +
                        "      \"variant\": \"" + evolution.getKind().getName() + "\",\n" +
                        "      \"result\": \"" + evolution.getResult();
                for (Aspect aspect : evolution.getAspects()) {
                    formString += " " + aspect.getName();
                }
                formString += "\",\n" +
                        "      \"consumeHeldItem\": " + evolution.consumesHeldItem() + ",\n";
                if (evolution.hasMoves()) {
                    formString += "\"learnableMoves\": [";
                    boolean isFirstLearnSetEntryForm = true;
                    for (MoveLearnSetEntry moveLearnsetEntry : evolution.getMoves()) {
                        if (moveLearnsetEntry.getMove().isImplemented()) {
                            if (isFirstLearnSetEntryForm) {
                                isFirstLearnSetEntryForm = false;
                            } else {
                                formString += ",\n";
                            }
                            formString += "    \"" + moveLearnsetEntry.getCondition() + ":" + moveLearnsetEntry.getMove().getName() + "\"";
                        }
                    }
                    formString += "],";
                } else {
                    formString += "      \"learnableMoves\": [],\n";
                }
                formString += "      \"requirements\": [\n";
                boolean isFirstRequirement = true;
                for (EvolutionRequirementEntry entry : evolution.getRequirements()) {
                    if (isFirstRequirement) {
                        isFirstRequirement = false;
                    } else {
                        formString += ",\n";
                    }

                    formString += "        {\n" +
                            "          \"variant\": \"" + entry.getRequirementKind() + "\",\n" +
                            "          \"" + entry.getCondition() + "\": " + entry.getConditionParameter() + "\n" +
                            "        }";
                }
                formString += "\n      ]";
                if (evolution.getRequiredContext() != null) {
                    formString += ",\n" +
                            "      \"requiredContext\": \"" + evolution.getRequiredContext() + "\"";
                }
                formString += ",\n" +
                        "      \"permanent\": true";

                formString += "\n    }";
            }
            formString += "\n  ],\n";
        }
        formString += "      \"cannotDynamax\": " + form.cannotDynamax() + ",\n" +
                "      \"battleOnly\": " + form.isBattleOnly() + "\n" +
                "    }";
        return formString;
    }

    private static @NotNull String getDrops(int dropAmount, List<ItemDrop> drops, String formString) {
        formString += "  \"drops\": {\n" +
                "    \"amount\": \"" + dropAmount + "\",\n" +
                "    \"entries\": [\n";
        boolean isFirstDropEntry = true;
        for (ItemDrop itemDrop : drops) {
            if (isFirstDropEntry) {
                isFirstDropEntry = false;
            } else {
                formString += ",\n";
            }
            formString += "      {\n" +
                    "        \"item\": \"" + itemDrop.getItemId() + "\",\n" +
                    "        \"quantityRange\": \"" + itemDrop.getQuantityMin() + "-" + itemDrop.getQuantityMax() + "\",\n" +
                    "        \"percentage\": " + itemDrop.getChance() + "\n" +
                    "      }";
        }
        formString += "\n    ]\n" +
                "      },\n";
        return formString;
    }
}
