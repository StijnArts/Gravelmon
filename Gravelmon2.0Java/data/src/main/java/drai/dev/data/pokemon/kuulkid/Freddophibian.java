package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Freddophibian extends drai.dev.data.pokemon.Pokemon {
    public Freddophibian() {
        super("Freddophibian",
                Type.WATER,Type.FAIRY,
                new Stats(110,
                        102,
                        64,
                        72,
                        58,
                        100),
                List.of(Ability.MELTY), Ability.MELTY,
                12, 0,
                new Stats(2,1,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("The lumps on Freddophibian's back can be detached from their bodies rather easily. The liquid produced inside them is used to make most commercially made chocolate delicacies in the Kuulkid region."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(39)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Freddophibian");

    }


}
