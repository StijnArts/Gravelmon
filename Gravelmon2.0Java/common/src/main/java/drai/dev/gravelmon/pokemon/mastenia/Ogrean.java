package drai.dev.gravelmon.pokemon.mastenia;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Ogrean extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ogrean() {
        super("Ogrean",
                Type.DARK, Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.RELENTLESS,Ability.MAGIC_BOUNCE), Ability.WIND_POWER,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ogrean can fly as high as the exosphere where they also shed their exoskeleton. They also gather space-like, electrical energy from certain rays at this altitude. Their buzzing roars appears sinister and harsh."),
                List.of(),
                List.of(                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ogrean");

    }


}
