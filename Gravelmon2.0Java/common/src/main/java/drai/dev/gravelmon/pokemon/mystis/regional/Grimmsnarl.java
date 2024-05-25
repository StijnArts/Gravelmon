package drai.dev.gravelmon.pokemon.mystis.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Grimmsnarl extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grimmsnarl(int dex) {
        super(dex, "Grimmsnarl",
                Type.FIRE, Type.STEEL,
                new Stats(95,
                        120,
                        110,
                        80,
                        85,
                        20),
                List.of(Ability.BATTLE_ARMOR), Ability.GOLDRUSH,
                15, 5466,
                new Stats(0,0,0,0,0,0), 45,
                0.75,
                255, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("- Gold BreakerSTAB Steel - Spirit Break Fairy"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIRIT_BREAK,1),
                        new MoveLearnSetEntry(Move.GOLD_BREAKER,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grimmsnarl");

    }


}
