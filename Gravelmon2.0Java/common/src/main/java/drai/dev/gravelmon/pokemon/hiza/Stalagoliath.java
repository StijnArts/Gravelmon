package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Stalagoliath extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stalagoliath() {
        super("Stalagoliath",
                Type.ROCK,Type.DARK,
                new Stats(70,
                        120,
                        115,
                        110,
                        60,
                        65),
                List.of(Ability.ROCK_HEAD), Ability.RECKLESS,
                23, 165,
                new Stats(0,1,1,1,0,0), 45,
                0.5,
                243, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Its massive rock shell is not for protection but used as a weapon. When in combat it tackles its foes at full force with no fear of damaging itself."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.ROCK_THROW,8),
                        new MoveLearnSetEntry(Move.SHARPEN,12),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,16),
                        new MoveLearnSetEntry(Move.ASSURANCE,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,29),
                        new MoveLearnSetEntry(Move.DRILL_RUN,31),
                        new MoveLearnSetEntry(Move.JAW_LOCK,34),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,50),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,57),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,66)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 45, 60, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DRIPSTONE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stalagoliath");

    }


}
