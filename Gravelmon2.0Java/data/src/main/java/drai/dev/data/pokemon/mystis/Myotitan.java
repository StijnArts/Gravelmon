package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Myotitan extends drai.dev.data.pokemon.Pokemon {
    public Myotitan() {
        super("Myotitan",
                Type.POISON, Type.FIGHTING,
                new Stats(140,
                        125,
                        90,
                        90,
                        80,
                        55),
                List.of(Ability.SHEER_FORCE), Ability.SHEER_FORCE,
                43, 0,
                new Stats(0,0,0,0,0,0), 6,
                0.0,
                293, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A great plague befell this Mon. It now festers within this Mon's thorny roots, violently lashing out at trespassers to the Terrimis Forest."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .subLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Myotitan");

    }


}
