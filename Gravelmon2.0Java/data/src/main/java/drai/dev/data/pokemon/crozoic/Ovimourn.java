package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ovimourn extends drai.dev.data.pokemon.Pokemon {
    public Ovimourn() {
        super("Ovimourn",
                Type.GHOST, Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.MAGIC_GUARD), Ability.FLAME_BODY,
                10, 150,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FLYING),
                List.of("Based on: Oviraptor"),
                List.of(new EvolutionEntry("funeraptor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"cobblemon:oval_stone")))),
                List.of(
                        new MoveLearnSetEntry(Move.MEMENTO,1),
                        new MoveLearnSetEntry(Move.SAFEGUARD,1),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,1),
                        new MoveLearnSetEntry(Move.LAST_RESPECTS,1),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,1),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,1),
                        new MoveLearnSetEntry(Move.SPITE,1),
                        new MoveLearnSetEntry(Move.SHADOWDANCE,1),
                        new MoveLearnSetEntry(Move.GRUDGE,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.WISH,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 12, 43, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY, Biome.IS_LUSH)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ovimourn");

    }


}
