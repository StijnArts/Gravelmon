package drai.dev.data.pokemon.mastenia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MastenianGolduck extends drai.dev.data.pokemon.Pokemon {
    public MastenianGolduck(String name, Aspect aspect) {
        super(name, aspect, "Golduck",
                Type.POISON,Type.PSYCHIC,
                new Stats(80,
                        92,
                        82,
                        81,
                        90,
                        75),
                List.of(Ability.POISON_TOUCH,Ability.TELEPATHY), Ability.CONTAMINATE,
                17, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Golduck");

    }


}
