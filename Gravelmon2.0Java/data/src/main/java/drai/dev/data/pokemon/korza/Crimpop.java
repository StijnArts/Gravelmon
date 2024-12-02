package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crimpop extends drai.dev.data.pokemon.Pokemon {
    public Crimpop() {
        super("Crimpop",
                Type.FIRE,Type.FAIRY,
                new Stats(90,
                        100,
                        30,
                        125,
                        60,
                        95),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 42,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Hot air blows out of the tail, keeping Crimpop afloat. Being very light, its trainers like to tie strings around them to keep from floating away."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crimpop");

    }


}
