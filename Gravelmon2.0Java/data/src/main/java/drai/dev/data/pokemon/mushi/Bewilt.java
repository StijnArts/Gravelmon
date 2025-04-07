package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bewilt extends drai.dev.data.pokemon.Pokemon {
    public Bewilt() {
        super("Bewilt",
                Type.GRASS,
                new Stats(55,
                        47,
                        75,
                        47,
                        55,
                        31),
                List.of(Ability.OVERGROW), Ability.RIPEN,
                5, 0,
                new Stats(0,0,1,0,0,0), 45,
                0.875,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("- Harden Normal - AbsorbSTAB Grass - Scratch Normal 7 Sludge Poison 12 Protect Normal 15 Mega DrainSTAB Grass 17 Leech Seed Grass 21 Toxic Poison 25 Venoshock Poison 28 Seed BombSTAB Grass 32 Sludge Bomb Poison 36 Leaf StormSTAB Grass"),
                List.of(new EvolutionEntry("twirleef", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.SLUDGE,7),
                        new MoveLearnSetEntry(Move.PROTECT,12),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,15),
                        new MoveLearnSetEntry(Move.LEECH_SEED,17),
                        new MoveLearnSetEntry(Move.TOXIC,21),
                        new MoveLearnSetEntry(Move.VENOSHOCK,25),
                        new MoveLearnSetEntry(Move.SEED_BOMB,28),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,32),
                        new MoveLearnSetEntry(Move.LEAF_STORM,36)                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bewilt");

    }


}
