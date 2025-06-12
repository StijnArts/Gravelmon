package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Abyssmulk extends drai.dev.data.pokemon.Pokemon {
    public Abyssmulk() {
        super("Abyssmulk",
                Type.DARK, Type.ELECTRIC,
                new Stats(145,
                        98,
                        77,
                        66,
                        92,
                        77),
                List.of(Ability.WONDER_SKIN,Ability.PRESSURE), Ability.SLOW_START,
                21, 0,
                new Stats(0,0,0,0,0,0), 40,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(43)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .belowY(50)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Abyssmulk");

    }


}
