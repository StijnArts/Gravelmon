package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Stalacpace extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stalacpace() {
        super("Stalacpace",
                Type.ROCK, Type.DARK,
                new Stats(60,
                        100,
                        100,
                        70,
                        50,
                        40),
                List.of(Ability.ROCK_HEAD), Ability.SHELL_ARMOR,
                11, 165,
                new Stats(0,1,1,0,0,0), 75,
                0.5,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("It utilizes its sharp rock shell as horn by ramming into its foes in combat. Its eyes are adapted to see in the dark, allowing it to live in the deepest caves."),
                List.of(new EvolutionEntry("stalagoliath", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.ROCK_THROW,8),
                        new MoveLearnSetEntry(Move.SHARPEN,12),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,16),
                        new MoveLearnSetEntry(Move.ASSURANCE,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,29),
                        new MoveLearnSetEntry(Move.JAW_LOCK,31),
                        new MoveLearnSetEntry(Move.DRILL_RUN,34),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,49),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,53),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,59)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 31, 48, 1.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DRIPSTONE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stalacpace");

    }


}
