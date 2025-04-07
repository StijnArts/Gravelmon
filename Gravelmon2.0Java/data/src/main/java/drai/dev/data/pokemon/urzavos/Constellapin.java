package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Constellapin extends drai.dev.data.pokemon.Pokemon {
    public Constellapin(Stats stats) {
        super("Constellapin",
                Type.FAIRY, Type.PSYCHIC,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 113,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("Curious 'Mons that enjoy chasing games. They are often out at night during full moons, in which their ears glow and the starry pattern on their tails seem to swirl with color."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Constellapin");

    }


}
