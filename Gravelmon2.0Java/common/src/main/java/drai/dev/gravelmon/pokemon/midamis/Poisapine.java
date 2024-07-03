package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Poisapine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Poisapine() {
        super("Poisapine",
                Type.POISON, Type.STEEL,
                new Stats(55,
                        50,
                        105,
                        95,
                        95,
                        60),
                List.of(Ability.POISON_POINT), Ability.HEAVY_METAL,
                15, 165,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(               new MoveLearnSetEntry(Move.SPIKE_CANNON,1),
                        new MoveLearnSetEntry(Move.ACID,6),
                        new MoveLearnSetEntry(Move.SHARPEN,10),
                        new MoveLearnSetEntry(Move.WORK_UP,13),
                        new MoveLearnSetEntry(Move.ROLLOUT,17),
                        new MoveLearnSetEntry(Move.POISON_FANG,21),
                        new MoveLearnSetEntry(Move.METAL_BURST,25),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,28),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,34),
                        new MoveLearnSetEntry(Move.REST,38),
                        new MoveLearnSetEntry(Move.IRON_HEAD,43),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,46),
                        new MoveLearnSetEntry(Move.GYRO_BALL,52)          ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 46, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Poisapine");

    }


}
