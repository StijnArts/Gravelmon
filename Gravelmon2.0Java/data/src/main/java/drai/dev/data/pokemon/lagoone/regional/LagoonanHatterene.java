package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanHatterene extends drai.dev.data.pokemon.Pokemon {
    public LagoonanHatterene(String name, Aspect aspect) {
        super(name, aspect, "Hatterene",
                Type.FAIRY,Type.WATER,
                new Stats(57,
                        59,
                        95,
                        134,
                        95,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                21, 278,
                new Stats(0,0,0,3,0,0), 45,
                0.0,
                255, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.REEF)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Hatterene");

    }


}
