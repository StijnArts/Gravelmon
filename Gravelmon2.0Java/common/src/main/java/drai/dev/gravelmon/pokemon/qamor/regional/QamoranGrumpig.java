package drai.dev.gravelmon.pokemon.qamor.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class QamoranGrumpig extends drai.dev.gravelmon.pokemon.Pokemon {
    public QamoranGrumpig(String name, Aspect aspect) {
        super(name, aspect, "Grumpig",
                Type.FIGHTING,
                new Stats(80,
                        100,
                        100,
                        55,
                        55,
                        80),
                List.of(Ability.ANGER_POINT,Ability.UNAWARE,Ability.UNNERVE), Ability.UNNERVE,
                9, 165,
                new Stats(0,1,1,0,0,0), 60,
                0.5,
                165, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Grumpig act like admins to Spoink, making them do the hard work as they nap lazily on beaches. But even they have to report to their Boss when it calls for them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TORMENT,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,7),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,10),
                        new MoveLearnSetEntry(Move.KNOCKBACK,14),
                        new MoveLearnSetEntry(Move.PSYCH_UP,15),
                        new MoveLearnSetEntry(Move.REVENGE,18),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,21),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,26),
                        new MoveLearnSetEntry(Move.POWER_GEM,29),
                        new MoveLearnSetEntry(Move.SNORE,35),
                        new MoveLearnSetEntry(Move.BODY_PRESS,42),
                        new MoveLearnSetEntry(Move.PAYBACK,46),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,52),
                        new MoveLearnSetEntry(Move.BOUNCE,60),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_THROW,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 47, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grumpig");

    }


}
