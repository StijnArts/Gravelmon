package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Mafreozee extends drai.dev.data.pokemon.Pokemon {
    public Mafreozee() {
        super("Mafreozee",
                Type.ICE, Type.PSYCHIC,
                new Stats(71,
                        61,
                        80,
                        106,
                        132,
                        85),
                List.of(Ability.FOREWARN,Ability.SNOW_WARNING,Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(0,0,0,0,2,0), 40,
                0.0,
                187, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.HUMAN_LIKE),
                List.of("Mafreozee can bend even the thickest ice with their mind, creating intricate and beautiful statues from them. They often accompany sculptors and love to express their thoughts through their art rather than their 'words.'"),
                List.of(),
                List.of(),
                List.of(Label.ISIAH),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Mafreozee");

    }


}
