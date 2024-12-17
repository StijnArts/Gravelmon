package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hemwee extends drai.dev.data.pokemon.Pokemon {
    public Hemwee() {
        super("Hemwee",
                Type.GHOST,Type.FAIRY,
                new Stats(45,
                        30,
                        40,
                        45,
                        25,
                        30),
                List.of(Ability.INFILTRATOR), Ability.SUPER_LUCK,
                2, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.25,
                43, ExperienceGroup.FAST,
                70,
                50, List.of(),
                List.of("Hemwee are known for their ability to mimic sounds, particularly crying babies and children. Though they can mimic, they don't use real words, so it's just incoherent babbling."),
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
           setLangFileName("Hemwee");

    }


}
