package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tapiruin extends drai.dev.data.pokemon.Pokemon {
    public Tapiruin() {
        super("Tapiruin",
                Type.ROCK,
                new Stats(73,
                        90,
                        115,
                        80,
                        42,
                        82),
                List.of(Ability.SAP_SIPPER), Ability.ANALYTIC,
                13, 850,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                144, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Mysterious Pokémon with rock hard skin, that used to be very common but became a rarer sight over the years. It seems like they are quickly adapting to live in subterrain areas."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,7),
                        new MoveLearnSetEntry(Move.BLOCK,12),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,15),
                        new MoveLearnSetEntry(Move.BULLDOZE,20),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,33),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44),
                        new MoveLearnSetEntry(Move.COUNTER,47),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,55)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 35, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tapiruin");

    }


}
