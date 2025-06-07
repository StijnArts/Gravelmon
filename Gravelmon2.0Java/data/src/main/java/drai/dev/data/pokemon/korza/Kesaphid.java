package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kesaphid extends drai.dev.data.pokemon.Pokemon {
    public Kesaphid() {
        super("Kesaphid",
                Type.BUG,Type.FAIRY,
                new Stats(30,
                        30,
                        80,
                        50,
                        70,
                        40),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                60, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Kesaphid subsist on tree fluids, drinking them dry before moving on to the next. Though cuddly-looking, disappearances have been linked to some who have tried to remove the mon from their host trees forcefully."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Kesaphid");

    }


}
