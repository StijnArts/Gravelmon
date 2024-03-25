package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Biscaneer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Biscaneer() {
        super("Biscaneer",
                Type.FAIRY,Type.DARK,
                new Stats(45,
                        60,
                        55,
                        45,
                        75,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 7,
                new Stats(0,1,0,0,0,0), 200,
                0.0,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Biscaneer");

    }


}
