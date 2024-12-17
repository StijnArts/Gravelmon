package drai.dev.data.pokemon.realidea;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ninfae extends Pokemon {
    public Ninfae() {
        super("Ninfae",
                Type.GRASS,
                new Stats(65,70,60,80,70,75),
                List.of(Ability.OVERGROW), Ability.CHLOROPHYLL,
                14, 330,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                163, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.GRASS),
                List.of(""),
                List.of(new EvolutionEntry("faeuna", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"34")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.GROWL, 3),
                        new MoveLearnSetEntry(Move.VINE_WHIP, 5),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, 7),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF, 10),
                        new MoveLearnSetEntry(Move.COTTON_SPORE, 13),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN, 16),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO, 19),
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 22),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, 25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN, 27),
                        new MoveLearnSetEntry(Move.LEAF_BLADE, 31),
                        new MoveLearnSetEntry(Move.SYNTHESIS, 33),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD, 40),
                        new MoveLearnSetEntry(Move.LEAF_STORM, 43),
                        new MoveLearnSetEntry(Move.PETAL_DANCE, 46),
                        new MoveLearnSetEntry(Move.MOONBLAST, 49),

                        new MoveLearnSetEntry(Move.AMNESIA, "egg"),
                        new MoveLearnSetEntry(Move.CHARM, "egg"),
                        new MoveLearnSetEntry(Move.CURSE, "egg"),
                        new MoveLearnSetEntry(Move.ENDURE, "egg"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN, "egg"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE, "egg"),
                        new MoveLearnSetEntry(Move.INGRAIN, "egg"),
                        new MoveLearnSetEntry(Move.LEAF_STORM, "egg"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF, "egg"),
                        new MoveLearnSetEntry(Move.NATURE_POWER, "egg"),
                        new MoveLearnSetEntry(Move.PETAL_DANCE, "egg"),
                        new MoveLearnSetEntry(Move.POWER_WHIP, "egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH, "egg"),
                        new MoveLearnSetEntry(Move.SLUDGE, "egg")
                ),
                List.of(Label.REALIDEA_SYSTEM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 29, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
