package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chchitin extends drai.dev.data.pokemon.Pokemon {
    public Chchitin(Stats stats) {
        super("Chchitin",
                Type.FIRE,Type.STEEL,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                28, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .pseudoLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Chōchitin");

    }


}
