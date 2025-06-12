package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Jakort extends drai.dev.data.pokemon.Pokemon {
    public Jakort() {
        super("Jakort",
                Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(), null,
                9, 0,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Jaicicle", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:ice_stone"),
                        new EvolutionEntry("Jaklaze", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Jakort");

    }


}
