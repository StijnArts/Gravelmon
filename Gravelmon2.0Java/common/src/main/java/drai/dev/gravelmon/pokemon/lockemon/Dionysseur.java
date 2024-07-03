package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Dionysseur extends Pokemon {
    public Dionysseur() {
        super("Dionysseur",
                Type.POISON, Type.GRASS,
                new Stats(110,
                        120,
                        100,
                        60,
                        100,
                        75),
                List.of(Ability.RIPEN, Ability.FIELDWORKER), Ability.INTOXICATE,
                19, 2131,
                new Stats(1,1,0,0,0,0), 80,
                0.5,
                243, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE, EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ABSORB,5),
                        new MoveLearnSetEntry(Move.GROWTH,7),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,10),
                        new MoveLearnSetEntry(Move.HELPING_HAND,13),
                        new MoveLearnSetEntry(Move.FLAIL,16),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,20),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,23),
                        new MoveLearnSetEntry(Move.SEED_BOMB,29),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,34),
                        new MoveLearnSetEntry(Move.LEECH_SEED,37),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,42),
                        new MoveLearnSetEntry(Move.MEMENTO,"egg"),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,"egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"egg"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 32, 58, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_BERRY_BUSH),
                0.28, 0.3,
                List.of());
    }
}
