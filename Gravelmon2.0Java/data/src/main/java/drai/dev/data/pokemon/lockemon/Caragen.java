package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Caragen extends Pokemon {
    public Caragen() {
        super("Caragen",
                Type.BUG,
                new Stats(75,
                        110,
                        115,
                        70,
                        90,
                        65),
                List.of(Ability.OVERCOAT, Ability.SHIELD_DUST), Ability.SECRETION,
                15, 365,
                new Stats(0,0,2,0,0,0), 45,
                0.875,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("Caragen are terrifying Pokémon that hide in dark places with their tails pointing out as if they were heads looking around. Any unsuspecting victim who looks at the head is cut."),
                List.of(),
                List.of(
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
