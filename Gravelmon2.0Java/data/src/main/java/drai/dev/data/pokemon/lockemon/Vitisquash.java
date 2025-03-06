package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Vitisquash extends Pokemon {
    public Vitisquash() {
        super("Vitisquash",
                Type.NORMAL, Type.GRASS,
                new Stats(100,
                        85,
                        70,
                        45,
                        70,
                        50),
                List.of(Ability.RIPEN, Ability.FIELDWORKER), Ability.HARVEST,
                11, 131,
                new Stats(1,0,0,0,0,0), 170,
                0.5,
                143, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE, EggGroup.FIELD),
                List.of("Vitisquash use their large feet to squish grapes it grows with fellow farmers. No one knows where they came from, just that they are gentle souls."),
                List.of(new EvolutionEntry("dionysseur", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:galarica_wreath")),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 27, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_BERRY_BUSH),
                0.28, 0.3,
                List.of());
    }
}
