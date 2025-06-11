package drai.dev.data.pokemon.bago;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Deployster extends drai.dev.data.pokemon.Pokemon {
    public Deployster() {
        super("Deployster",
                Type.WATER,Type.ROCK,
                new Stats(96,
                        51,
                        110,
                        96,
                        66,
                        19),
                List.of(Ability.MEGA_LAUNCHER, Ability.SHELL_ARMOR), Ability.SNIPER,
                UnitConverter.feetToMeters(5, 1), 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.BAGO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
           setLangFileName("Deployster");

    }


}
