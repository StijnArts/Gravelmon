package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cramic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cramic() {
        super("Cramic",
                Type.BUG,
                new Stats(40,
                        50,
                        70,
                        40,
                        70,
                        30),
                List.of(Ability.HYPER_CUTTER,Ability.SHELL_ARMOR,Ability.FRISK), Ability.FRISK,
                8, 165,
                new Stats(0,0,1,0,0,0), 0,
                0.5,
                60, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("- PinchSTAB Bug 4 Withdraw Water"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PINCH,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,4),
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm")                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cramic");

    }


}
