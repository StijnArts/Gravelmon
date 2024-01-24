package drai.dev.gravelmon.pokemon.rica;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Taranturem extends drai.dev.gravelmon.pokemon.Pokemon {
    public Taranturem() {
        super("Taranturem",
                Type.GHOST,Type.BUG,
                new Stats(130,
                        150,
                        110,
                        90,
                        110,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,3,0,0,0,0), 3,
                0.0,
                306, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("rarspider"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIDER_WEB,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,7),
                        new MoveLearnSetEntry(Move.TOXIC_THREAD,15),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,40),
                        new MoveLearnSetEntry(Move.GUILLOTINE,70)                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Taranturem");

    }


}
