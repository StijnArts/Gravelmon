package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianYanmega extends drai.dev.data.pokemon.Pokemon {
    public TheossianYanmega(String name, Aspect aspect) {
        super(name, aspect, "Yanmega",
                Type.BUG, Type.DRAGON,
                new Stats(86,
                        76,
                        86,
                        116,
                        56,
                        95),
                List.of(Ability.PRESSURE,Ability.TINTED_LENS), Ability.ADAPTABILITY,
                19, 515,
                new Stats(0,0,0,2,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The beat of its wings is so powerful that it accidentally dislodges full-grown trees when it takes off in flight."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanWalkOnWater(true);
        setCanFly(true);
           setLangFileName("Yanmega");

    }


}
