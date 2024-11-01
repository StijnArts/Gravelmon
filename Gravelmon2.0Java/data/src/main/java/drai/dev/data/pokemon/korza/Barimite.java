package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Barimite extends drai.dev.data.pokemon.Pokemon {
    public Barimite() {
        super("Barimite",
                Type.ROCK,
                new Stats(60,
                        75,
                        130,
                        55,
                        55,
                        25),
                List.of(Ability.STURDY), Ability.STRONG_JAW,
                7, 399,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                140, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("When sleeping, Barimite sleep in clusters so large that they appear to be a normal part of the caverns they live in. It leisurely carves into cave walls as it travels."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Barimite");

    }


}
