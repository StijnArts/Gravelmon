package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianWeepinbell extends drai.dev.data.pokemon.Pokemon {
    public TheossianWeepinbell(String name, Aspect aspect) {
        super(name, aspect, "Weepinbell",
                Type.GRASS, Type.DARK,
                new Stats(70,
                        95,
                        60,
                        70,
                        45,
                        50),
                List.of(Ability.INTIMIDATE), Ability.GLUTTONY,
                10, 64,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("theossianvictreebel", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Weepinbell");

    }


}
