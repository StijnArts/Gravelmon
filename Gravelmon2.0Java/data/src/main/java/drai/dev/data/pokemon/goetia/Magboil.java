package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Magboil extends drai.dev.data.pokemon.Pokemon {
    public Magboil(Stats stats) {
        super("Magboil",
                Type.PSYCHIC, Type.BUG,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Looking into its eye-like organs as they pulsate causes its thoughts to be transmitted telepathically. However, its mind is so alien that whatever it communicates ranges from cryptic to incomprehensible. It makes consistent reference to “headfriends”, presumed to be the mysterious larvae-like beings visible inside its sacs."),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Magboil");

    }


}
