package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pumfin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pumfin() {
        super("Pumfin",
                Type.DARK, Type.GRASS,
                new Stats(66,
                        77,
                        76,
                        90,
                        86,
                        66),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROAR,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,6),
                        new MoveLearnSetEntry(Move.PAYBACK,16),
                        new MoveLearnSetEntry(Move.GLARE,26),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,36),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,46),
                        new MoveLearnSetEntry(Move.HORN_LEECH,56),
                        new MoveLearnSetEntry(Move.CRUNCH,66),
                        new MoveLearnSetEntry(Move.TOXIC,76),
                        new MoveLearnSetEntry(Move.BELCH,86)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 13, 33, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pumfin");

    }


}
