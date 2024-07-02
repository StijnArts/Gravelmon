package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Hindawn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hindawn() {
        super("Hindawn",
                Type.GHOST, Type.PSYCHIC,
                new Stats(70,
                        85,
                        65,
                        85,
                        75,
                        90),
                List.of(Ability.LEVITATE), Ability.CURSED_BODY,
                13, 165,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hindawn is known to predict the near future for those who manage to best it in battle, although it's rumored that it can change the future for the worse as well."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MIRROR_COAT,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,8),
                        new MoveLearnSetEntry(Move.CURSE,11),
                        new MoveLearnSetEntry(Move.FORESIGHT,19),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,22),
                        new MoveLearnSetEntry(Move.GRUDGE,30),
                        new MoveLearnSetEntry(Move.DREAM_EATER,33),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,41),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,44),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,52)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 17, 36, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hindawn");

    }


}
