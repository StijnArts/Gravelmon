package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Salvagma extends drai.dev.data.pokemon.Pokemon {
    public Salvagma() {
        super("Salvagma",
                Type.POISON,Type.FIRE,
                new Stats(80,
                        110,
                        70,
                        70,
                        60,
                        85),
                List.of(Ability.MAGMA_ARMOR), Ability.MOLD_BREAKER,
                22, 495,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MONSTER),
                List.of("Considered volcanic parasites, burrowing deep into the earth in search of magma. The caldera that now houses the Korza League was created by an unusually large group of Salvagma."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ERUPTION,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.POISON_TAIL,7),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,13),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,20),
                        new MoveLearnSetEntry(Move.TOXIC,24),
                        new MoveLearnSetEntry(Move.FIRE_LASH,31),
                        new MoveLearnSetEntry(Move.POISONBURST,36),
                        new MoveLearnSetEntry(Move.CROSS_POISON,42),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,47),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,53),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,58),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,62)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Salvagma");

    }


}
