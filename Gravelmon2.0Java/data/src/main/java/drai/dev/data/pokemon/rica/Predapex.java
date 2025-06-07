package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Predapex extends drai.dev.data.pokemon.Pokemon {
    public Predapex() {
        super("Predapex",
                Type.GHOST,
                new Stats(90,
                        110,
                        75,
                        70,
                        75,
                        105),
                List.of(Ability.NIGHTSTALKER), Ability.STAKEOUT,
                8, 165,
                new Stats(0,0,0,0,0,0), 35,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Anyone who wanders the jungle at night is prey for this ferocious Pokemon. Predapex uses its glowing pattern as a lure, then uses its powerful claws to rip apart the target."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,7),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,14),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,18),
                        new MoveLearnSetEntry(Move.POISON_FANG,22),
                        new MoveLearnSetEntry(Move.SLASH,26),
                        new MoveLearnSetEntry(Move.HYPNOSIS,30),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,35),
                        new MoveLearnSetEntry(Move.NIGHTMARE,39),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,42),
                        new MoveLearnSetEntry(Move.PUNISHMENT,48),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,53),
                        new MoveLearnSetEntry(Move.MEMENTO,57),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,62)                        ),
                List.of(Label.RICA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Predapex");

    }


}
