package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shellicopter extends drai.dev.data.pokemon.Pokemon {
    public Shellicopter(Stats stats) {
        super("Shellicopter",
                Type.FLYING, Type.BUG,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 0,
                new Stats(0,0,0,0,0,0), 0,
                0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It takes so much pride in its newfound flight that it ignores how uncontrollable it is. When it crashes, its rapidly-spinning blades cause collateral damage."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FOLIAGE, SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Shellicopter");

    }


}
