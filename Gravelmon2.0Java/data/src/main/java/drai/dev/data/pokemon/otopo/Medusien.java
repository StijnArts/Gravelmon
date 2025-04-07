package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Medusien extends drai.dev.data.pokemon.Pokemon {
    public Medusien() {
        super("Medusien",
                Type.PSYCHIC, Type.STEEL,
                new Stats(40,
                        20,
                        130,
                        80,
                        100,
                        130),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,1,0,0,1), 0,
                0.5,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Due of the ship-like carapace it resides in, Medusien are exceedingly well protected. Due to its thick armour, it relies on its psychic powers to keep afloat."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Medusien");

    }


}
