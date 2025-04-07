package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hollotite extends drai.dev.data.pokemon.Pokemon {
    public Hollotite() {
        super("Hollotite",
                Type.ROCK,
                new Stats(50,
                        70,
                        80,
                        40,
                        40,
                        20),
                List.of(Ability.ROCK_HEAD), Ability.SHELL_ARMOR,
                8, 165,
                new Stats(0,0,1,0,0,0), 225,
                0.5,
                59, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("They like to sleep upside down in dark caves. Their sturdy rock shell protects them if one happens to fall down on the floor."),
                List.of(new EvolutionEntry("stalacpace", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"29")))
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
                        new MoveLearnSetEntry(Move.DRILL_RUN,32),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,36),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,41),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,45),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,49),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,53)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 7, 32, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DRIPSTONE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hollotite");

    }


}
