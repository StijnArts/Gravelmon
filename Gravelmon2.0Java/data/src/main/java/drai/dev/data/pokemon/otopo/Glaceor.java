package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glaceor extends drai.dev.data.pokemon.Pokemon {
    public Glaceor() {
        super("Glaceor",
                Type.ICE, Type.ROCK,
                new Stats(30,
                        60,
                        100,
                        20,
                        20,
                        40),
                List.of(Ability.SHELL_ARMOR,Ability.ANGER_POINT), Ability.PURE_POWER,
                3, 400,
                new Stats(0,1,0,1,0,0), 30,
                0.0,
                54, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Glaceor was discovered at the impact site of an asteroid. It was originally thought to be inanimate, but after burning up as it hurtled through the sky, it took on a life of its own."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glaceor");

    }


}
