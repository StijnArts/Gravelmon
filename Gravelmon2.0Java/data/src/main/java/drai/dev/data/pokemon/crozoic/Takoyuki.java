package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Takoyuki extends drai.dev.data.pokemon.Pokemon {
    public Takoyuki() {
        super("Takoyuki",
                Type.ICE,Type.WATER,
                new Stats(40,
                        30,
                        70,
                        30,
                        80,
                        60),
                List.of(Ability.ICE_BODY), Ability.SNOW_CLOAK,
                7, 120,
                new Stats(0,0,0,0,1,0), 180,
                0.5,
                62, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(new EvolutionEntry("squicecone", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:ice_stone"),
                        new EvolutionEntry("dangoceras", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:shiny_stone")),
                List.of(),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_COLD_OCEAN, Biome.IS_FROZEN_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Takoyuki");

    }


}
