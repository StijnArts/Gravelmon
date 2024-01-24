package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Wapolyp extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wapolyp() {
        super("Wapolyp",
                Type.WATER,Type.FIGHTING,
                new Stats(87,
                        130,
                        105,
                        100,
                        40,
                        40),
                List.of(Ability.WATER_COMPACTION), Ability.WATER_ABSORB,
                8, 165,
                new Stats(0,3,0,0,0,0), 75,
                0.5,
                230, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Evo Drain PunchSTAB Fighting - LiquidationSTAB Water - Close CombatSTAB Fighting - Sucker Punch Dark - Acid Armor Poison - Drain PunchSTAB Fighting - Pound Normal - Harden Normal - Work Up Normal - Aqua JetSTAB Water 5 Work Up Normal 9 Aqua JetSTAB Water 16 Circle ThrowSTAB Fighting 23 Flip TurnSTAB Water 30 Soak Water 36 WaterfallSTAB Water 40 Double-Edge Normal 50 Belly Drum Normal 61 Focus PunchSTAB Fighting"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.WORK_UP,5),
                        new MoveLearnSetEntry(Move.AQUA_JET,9),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,16),
                        new MoveLearnSetEntry(Move.FLIP_TURN,23),
                        new MoveLearnSetEntry(Move.SOAK,30),
                        new MoveLearnSetEntry(Move.WATERFALL,36),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,40),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,50),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,61)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wapolyp");

    }


}
