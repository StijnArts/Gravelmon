package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Formillant extends drai.dev.data.pokemon.Pokemon {
    public Formillant() {
        super("Formillant",
                Type.FIRE, Type.BUG,
                new Stats(74,
                        85,
                        85,
                        125,
                        60,
                        101),
                List.of(Ability.BLAZE), Ability.COMPOUND_EYES,
                19, 0,
                new Stats(0,0,0,3,0,0), 0,
                0.875,
                265, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Formillant");

    }


}
