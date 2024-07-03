package drai.dev.gravelmon.pokemon.xenoverse;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Koinkoin extends Pokemon {
    public Koinkoin() {
        super("Koinkoin",
                Type.NORMAL,
                new Stats(120, 60, 105, 40, 105, 20),
                List.of(Ability.PIGGY_BANK), Ability.GLUTTONY,
                15, 708,
                new Stats(2,0,0,0,0,0), 180,
                0,
                400, ExperienceGroup.SLOW,
                70,
                32, List.of(EggGroup.FIELD, EggGroup.MINERAL),
                List.of("The more it moves, the more is the gold it drops from its navel. After an intense struggle, its Trainer will make plenty of Nuggets."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TRICK_ROOM,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,6),
                        new MoveLearnSetEntry(Move.YAWN,11),
                        new MoveLearnSetEntry(Move.HELPING_HAND,13),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,16),
                        new MoveLearnSetEntry(Move.STORM_THROW,19),
                        new MoveLearnSetEntry(Move.PAY_DAY,21),
                        new MoveLearnSetEntry(Move.FLAIL,26),
                        new MoveLearnSetEntry(Move.SLAM,31),
                        new MoveLearnSetEntry(Move.FLING,36),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,41),
                        new MoveLearnSetEntry(Move.SNATCH,46),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,50),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.CRUNCH,"egg"),
                        new MoveLearnSetEntry(Move.SLACK_OFF,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"egg"),
                        new MoveLearnSetEntry(Move.BENEVOLENCE,"tutor"),
                        new MoveLearnSetEntry(Move.BLOCK,"tutor"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 29, 57, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SNOWY))),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
