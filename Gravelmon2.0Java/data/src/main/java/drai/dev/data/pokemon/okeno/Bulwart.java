package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bulwart extends drai.dev.data.pokemon.Pokemon {
    public Bulwart() {
        super("Bulwart",
                Type.GROUND, Type.POISON,
                new Stats(121,
                        113,
                        52,
                        76,
                        90,
                        40),
                List.of(Ability.POISON_TOUCH,Ability.ANGER_POINT,Ability.HYDRATION), Ability.HYDRATION,
                15, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Although slow-moving, this Pokemon is a formidable foe. Its low-frequency croaking destabilizes the ground, creating a sinkhole, then it lassos its prey with a tongue that can extend almost 3 meters!"),
                List.of(),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER, SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Bulwart");

    }


}
