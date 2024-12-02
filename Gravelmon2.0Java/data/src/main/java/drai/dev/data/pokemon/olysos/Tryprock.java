package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tryprock extends drai.dev.data.pokemon.Pokemon {
    public Tryprock() {
        super("Tryprock",
                Type.ROCK,
                new Stats(45,
                        55,
                        85,
                        30,
                        60,
                        25),
                List.of(Ability.STURDY,Ability.LEVITATE), Ability.MAGNET_PULL,
                5, 218,
                new Stats(0,0,1,0,0,0), 255,
                0.0,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Tryprock rarely venture into the open. Preferring the safety of underground environments, they feel most at ease amidst magnetic fields. Tryprock's glowing eye possesses a unique scanning ability, allowing it to detect and track magnetic fields, crucial for navigating the underground. These Pokémon sustain themselves by feeding on minerals found deep within the earth."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tryprock");

    }


}
