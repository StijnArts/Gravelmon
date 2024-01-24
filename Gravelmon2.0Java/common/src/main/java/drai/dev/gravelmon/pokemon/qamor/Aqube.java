package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Aqube extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aqube() {
        super("Aqube",
                Type.WATER,Type.FIGHTING,
                new Stats(50,
                        82,
                        81,
                        62,
                        25,
                        25),
                List.of(Ability.WATER_COMPACTION), Ability.WATER_ABSORB,
                8, 165,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("- Pound Normal - Harden Normal 5 Work Up Normal 9 Aqua JetSTAB Water 16 Circle ThrowSTAB Fighting 22 Flip TurnSTAB Water 26 Soak Water 30 WaterfallSTAB Water 36 Double-Edge Normal 41 Belly Drum Normal 50 Focus PunchSTAB Fighting"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.WORK_UP,5),
                        new MoveLearnSetEntry(Move.AQUA_JET,9),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,16),
                        new MoveLearnSetEntry(Move.FLIP_TURN,22),
                        new MoveLearnSetEntry(Move.SOAK,26),
                        new MoveLearnSetEntry(Move.WATERFALL,30),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,36),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,41),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,50)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aqube");

    }


}
