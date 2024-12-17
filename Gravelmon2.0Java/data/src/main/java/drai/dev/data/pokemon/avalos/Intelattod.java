package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Intelattod extends drai.dev.data.pokemon.Pokemon {
    public Intelattod() {
        super("Intelattod",
                Type.PSYCHIC, Type.BUG,
                new Stats(65,
                        40,
                        90,
                        120,
                        95,
                        60),
                List.of(Ability.ANALYTIC,Ability.SYNCHRONIZE), Ability.TELEPATHY,
                7, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Intelattod are said to have dated back since the Stone Age. Then, they were as big as a fully grown trainer. Even if they're not nearly as large as their ancestors, they're still equally, if not more powerful."),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.SAFEGUARD,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,10),
                        new MoveLearnSetEntry(Move.BATON_PASS,20),
                        new MoveLearnSetEntry(Move.SILVER_WIND,30),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,40),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,50),
                        new MoveLearnSetEntry(Move.RECOVER,60)             ),
                List.of(Label.AVALOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 33, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Intelattod");

    }


}
