package drai.dev.data.pokemon.avoris.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AvorianCetitan extends drai.dev.data.pokemon.Pokemon {
    public AvorianCetitan() {
        super("Cetitan",
                Type.GROUND, Type.STEEL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.THICK_FAT,Ability.STRONG_JAW,Ability.SHEER_FORCE), Ability.SHEER_FORCE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("With their powerful jaws, they can easily crush hard steel. Cetitan are used in junkyards to eat and reduce trash and also to crush larger junk. They are a natural enemy to Trubbish and Garbodor."),
                List.of(),
                List.of(),
                List.of(Label.AVORIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Cetitan");

    }


}
