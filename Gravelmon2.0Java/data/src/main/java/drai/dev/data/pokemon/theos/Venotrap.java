package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Venotrap extends drai.dev.data.pokemon.Pokemon {
    public Venotrap() {
        super("Snaptrap",
                Type.GRASS,
                new Stats(50,
                        85,
                        40,
                        85,
                        40,
                        35),
                List.of(Ability.TANGLING_HAIR), Ability.ARENA_TRAP,
                5, 104,
                new Stats(0,1,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Snaptrap hang from trees to disguise themselves as hanging plants. When it's prey passes by, it quickly snaps them up and tangles them in it's vines."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Snaptrap");

    }


}
