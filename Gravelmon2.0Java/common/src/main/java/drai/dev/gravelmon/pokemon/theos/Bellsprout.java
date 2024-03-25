package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Bellsprout extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bellsprout() {
        super("Bellsprout",
                Type.GRASS,Type.DARK,
                new Stats(50,
                        75,
                        45,
                        60,
                        30,
                        40),
                List.of(Ability.INTIMIDATE), Ability.GLUTTONY,
                7, 40,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Bellsprout are much more vicious than other Bellsprout. Due to their darker nature, people try and avoid them as they're quick to lash out against anything that get close."),
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
           setLangFileName("Bellsprout");

    }


}
