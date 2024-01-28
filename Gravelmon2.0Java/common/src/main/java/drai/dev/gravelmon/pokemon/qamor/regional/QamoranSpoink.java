package drai.dev.gravelmon.pokemon.qamor.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class QamoranSpoink extends drai.dev.gravelmon.pokemon.Pokemon {
    public QamoranSpoink(int dex) {
        super(dex, "Spoink",
                Type.FIGHTING,
                new Stats(60,
                        70,
                        80,
                        25,
                        35,
                        60),
                List.of(Ability.ANGER_POINT,Ability.UNAWARE,Ability.UNNERVE), Ability.UNNERVE,
                7, 165,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                66, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Spoink use their hard, spikey tail to bash their enemies. They stick together in packs and gang up on weaker Pokemon."),
                List.of(new EvolutionEntry("qamorangrumpig", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,7),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,10),
                        new MoveLearnSetEntry(Move.KNOCKBACK,14),
                        new MoveLearnSetEntry(Move.PSYCH_UP,15),
                        new MoveLearnSetEntry(Move.REVENGE,18),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,21),
                        new MoveLearnSetEntry(Move.HEADBUTT,26),
                        new MoveLearnSetEntry(Move.POWER_GEM,29),
                        new MoveLearnSetEntry(Move.SNORE,33),
                        new MoveLearnSetEntry(Move.BODY_PRESS,38),
                        new MoveLearnSetEntry(Move.PAYBACK,40),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,44),
                        new MoveLearnSetEntry(Move.BOUNCE,50),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_THROW,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 10, 33, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spoink");

    }


}
