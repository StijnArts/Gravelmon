package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TorkoalPlaceholder extends drai.dev.data.pokemon.Pokemon {
    public TorkoalPlaceholder() {
        super("TorkoalPlaceholder",
                Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.WHITE_SMOKE,Ability.DROUGHT), Ability.SHELL_ARMOR,
                5, 804,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                165, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its robust shell conceals a fiery furnace within, which burns at a temperature capable of melting rocks. Torkoal vents smoke from its nostrils as it moves, leaving a trail of ash in its wake. Despite its slow pace, this Fire-type Pokémon is revered for its ability to generate intense heat, a trait that has earned it respect among trainers in search of warmth during cold nights in the wild."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Torkoal (Placeholder)");

    }


}
