package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Dinomond extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dinomond() {
        super("Dinomond",
                Type.ROCK,Type.DRAGON,
                new Stats(70,
                        120,
                        100,
                        50,
                        100,
                        70),
                List.of(Ability.STURDY,Ability.ROUGH_SKIN), Ability.SHEER_FORCE,
                0, 0,
                new Stats(0,3,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Though sought-after by poachers for the gemstones pretruding from it's body, Dinomond have more than enough strength to defend themselves."),
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
           setLangFileName("Dinomond");

    }


}
