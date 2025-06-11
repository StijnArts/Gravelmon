package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Garblgoyle extends Pokemon {
    public Garblgoyle() {
        super("Garblgoyle",
                Type.ROCK, Type.WATER,
                new Stats(75,
                        80,
                        135,
                        80,
                        75,
                        60),
                List.of(Ability.STORM_DRAIN), Ability.RAIN_DISH,
                14, 2450,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                54, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL, EggGroup.DRAGON),
                List.of("Legend says it started crying when its Draconian creators disappeared. However, modern science reveals this is simply its biology."),
                List.of(),
                List.of(
                ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
    }
}
