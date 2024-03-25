package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Victreebel extends drai.dev.gravelmon.pokemon.Pokemon {
    public Victreebel() {
        super("Victreebel",
                Type.GRASS,Type.DARK,
                new Stats(90,
                        115,
                        75,
                        80,
                        70,
                        60),
                List.of(Ability.INTIMIDATE), Ability.GLUTTONY,
                17, 155,
                new Stats(0,3,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Victreebel");

    }


}
