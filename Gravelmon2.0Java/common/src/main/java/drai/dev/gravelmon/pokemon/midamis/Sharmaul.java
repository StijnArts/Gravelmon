package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Sharmaul extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sharmaul() {
        super("Sharmaul",
                Type.STEEL, Type.WATER,
                new Stats(70,
                        100,
                        120,
                        75,
                        70,
                        75),
                List.of(Ability.SWIFT_SWIM), Ability.UNAWARE,
                16, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(    new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.WATER_SPORT,9),
                        new MoveLearnSetEntry(Move.BOLTIN,12),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,15),
                        new MoveLearnSetEntry(Move.PURIFY,19),
                        new MoveLearnSetEntry(Move.MUD_SHOT,21),
                        new MoveLearnSetEntry(Move.WATER_PULSE,25),
                        new MoveLearnSetEntry(Move.SOAK,29),
                        new MoveLearnSetEntry(Move.LIQUIDMETAL,32),
                        new MoveLearnSetEntry(Move.RECYCLE,35),
                        new MoveLearnSetEntry(Move.METAL_SOUND,39),
                        new MoveLearnSetEntry(Move.METAL_BURST,42),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,45),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,48),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,52),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,56)                    ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 41, 64, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
