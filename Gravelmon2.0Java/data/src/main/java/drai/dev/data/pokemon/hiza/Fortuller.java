package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Fortuller extends drai.dev.data.pokemon.Pokemon {
    public Fortuller() {
        super("Fortuller",
                Type.BUG, Type.PSYCHIC,
                new Stats(44,
                        28,
                        46,
                        67,
                        100,
                        15),
                List.of(Ability.INFILTRATOR), Ability.FOREWARN,
                8, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They gather all sorts of rare minerals to roll up and fuse into a crystal ball, those who look into the ball will see their future."),
                List.of(new EvolutionEntry("mysteele", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))
                ),
                List.of(       new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,4),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,7),
                        new MoveLearnSetEntry(Move.ROLLOUT,11),
                        new MoveLearnSetEntry(Move.PSYBEAM,15),
                        new MoveLearnSetEntry(Move.BUG_BITE,20),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,24),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,29),
                        new MoveLearnSetEntry(Move.LUNGE,35),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,40),
                        new MoveLearnSetEntry(Move.POWER_SWAP,40),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,40),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,45),
                        new MoveLearnSetEntry(Move.PSYCHIC,50)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 6, 27, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fortuller");

    }


}
