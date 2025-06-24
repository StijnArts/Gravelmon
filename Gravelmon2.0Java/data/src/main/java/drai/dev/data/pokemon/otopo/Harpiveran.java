package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Harpiveran extends drai.dev.data.pokemon.Pokemon {
    public Harpiveran() {
        super("Harpiveran",
                Type.GHOST, Type.DRAGON,
                new Stats(120,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                28, 0,
                new Stats(3,0,0,0,0,0), 3,
                0.5,
                279, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("The emissary of alignment; Harpiveran takes those who challenge balance to either Orderion or Anarchaic. It is not known who its true master is."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .subLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_END)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Harpiveran");

    }


}
