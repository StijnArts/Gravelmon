package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Woomask extends drai.dev.data.pokemon.Pokemon {
    public Woomask() {
        super("Woomask",
                Type.GHOST,
                new Stats(40,
                        30,
                        75,
                        75,
                        75,
                        39),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Whenever a child gets lost in the wilderness, never to return, a Woomask may be found. If found, the finder must bring this mask Pokémon to the closest village. Then, the story has to be told to all children around so that they can bring this Pokémon through the land in the future to come."),
                List.of(new EvolutionEntry("madogo", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Woomask");

    }


}
