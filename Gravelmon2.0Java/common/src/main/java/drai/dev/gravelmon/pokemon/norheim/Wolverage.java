package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Wolverage extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wolverage() {
        super("Wolverage",
                Type.NORMAL,
                new Stats(95,
                        110,
                        80,
                        65,
                        75,
                        80),
                List.of(Ability.OVERCOAT,Ability.GLUTTONY,Ability.HUNGER_SWITCH), Ability.HUNGER_SWITCH,
                15, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A rare sight to behold in the forests of Migard; often mistaken for other Pokemon. When hungry, it may tear down large trees with its clumsy body."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.ENDURE,8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,11),
                        new MoveLearnSetEntry(Move.SCRATCH,15),
                        new MoveLearnSetEntry(Move.BITE,19),
                        new MoveLearnSetEntry(Move.HYPER_FANG,29),
                        new MoveLearnSetEntry(Move.WORK_UP,33),
                        new MoveLearnSetEntry(Move.SWIFT,37),
                        new MoveLearnSetEntry(Move.BODY_SLAM,46),
                        new MoveLearnSetEntry(Move.LAST_RESORT,53)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 23, 34, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_OCEAN))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wolverage");

    }


}
