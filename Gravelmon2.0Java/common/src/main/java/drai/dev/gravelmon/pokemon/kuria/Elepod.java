package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Elepod extends drai.dev.gravelmon.pokemon.Pokemon {
    public Elepod() {
        super("Elepod",
                Type.ELECTRIC,Type.COSMIC,
                new Stats(60,
                        40,
                        50,
                        75,
                        71,
                        55),
                List.of(Ability.STATIC,Ability.STORM_DRAIN), Ability.LIQUIDCONDUCTION,
                3, 58,
                new Stats(0,0,0,1,0,0), 190,
                0.75,
                77, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Elepod conducts electricty inside its protective bubble, but gets distracted by all the pretty sparks. This often leads to it bumping into a comet. They fight often with Mojicle."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Elepod");

    }


}
