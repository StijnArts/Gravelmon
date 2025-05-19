package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Boulrot extends drai.dev.data.pokemon.Pokemon {
    public Boulrot() {
        super("Boulrot",
                Type.ROCK,Type.POISON,
                new Stats(64,
                        52,
                        176,
                        84,
                        76,
                        33),
                List.of(Ability.WHITE_SMOKE,Ability.OVERCOAT), Ability.STURDY,
                11, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The fumes coming from inside Boulrot's shell are so strong that it chokes out the nearby plants if it stays in one place for too long. Because of this, they are nomadic in nature."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.BIDE,4),
                        new MoveLearnSetEntry(Move.ROLLOUT,10),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,16),
                        new MoveLearnSetEntry(Move.POISON_GAS,21),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,25),
                        new MoveLearnSetEntry(Move.INCINERATE,30),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,34),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,39),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,43),
                        new MoveLearnSetEntry(Move.POISONBURST,47),
                        new MoveLearnSetEntry(Move.HAZE,52),
                        new MoveLearnSetEntry(Move.STONE_EDGE,56),
                        new MoveLearnSetEntry(Move.EXPLOSION,60),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,67)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Boulrot");

    }


}
