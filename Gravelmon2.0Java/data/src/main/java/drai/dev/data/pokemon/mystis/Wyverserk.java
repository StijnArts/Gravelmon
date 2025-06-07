package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wyverserk extends drai.dev.data.pokemon.Pokemon {
    public Wyverserk() {
        super("Wyverserk",
                Type.DRAGON, Type.STEEL,
                new Stats(105,
                        170,
                        90,
                        120,
                        90,
                        125),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                218, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It once went on a rampage that destroyed half of the region, causing unforetold amounts of damage. It is said if you see Wyverserk, a battle will soon unfold."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_NETHER)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Wyverserk");

    }


}
