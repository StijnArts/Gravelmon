package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cosmanos extends drai.dev.data.pokemon.Pokemon {
    public Cosmanos() {
        super("Cosmanos",
                Type.FAIRY,Type.BUG,
                new Stats(132,
                        86,
                        83,
                        149,
                        83,
                        147),
                List.of(Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                58, 2517,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Said to fly among the outskirts of the sky, watching over the world from destructive forces and will use his dormant power in the future to stop a calamity. Because of this, he's seen as a symbol of diligence and dedication."),
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
           setLangFileName("Cosmanos");

    }


}
