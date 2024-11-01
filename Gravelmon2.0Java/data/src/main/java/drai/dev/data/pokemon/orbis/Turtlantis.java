package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Turtlantis extends drai.dev.data.pokemon.Pokemon {
    public Turtlantis() {
        super("Turtlantis",
                Type.WATER, Type.ROCK,
                new Stats(78,
                        83,
                        118,
                        83,
                        68,
                        63),
                List.of(Ability.SHELL_ARMOR), Ability.SWIFT_SWIM,
                12, 270,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                152, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of("Once a common sight in the oceans surrounding Orbopolis; Turtlantis have dwindled in numbers due to the presence of plastic bags in the ocean. They are unable to differentiate between their main prey and Plastic bags due to human interference."),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Turtlantis");

    }


}
