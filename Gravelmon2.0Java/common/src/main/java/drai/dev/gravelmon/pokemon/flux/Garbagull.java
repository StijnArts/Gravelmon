package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Garbagull extends Pokemon {
    public Garbagull() {
        super("Garbagull",
                Type.POISON, Type.STEEL,
                new Stats(70,
                        95,
                        70,
                        55,
                        100,
                        50),
                List.of(Ability.GLUTTONY, Ability.STENCH), Ability.BIG_PECKS,
                17, 1900,
                new Stats(0,1,0,0,1,0), 45,
                0.5,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING, EggGroup.MINERAL),
                List.of("It gluts itself on garbage until it grows too heavy to fly. It is one of the only known species that preys upon TRUBBISH and GARBODOR."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STEEL_WING,1),
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,1),
                        new MoveLearnSetEntry(Move.FLY,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.PLUCK,16),
                        new MoveLearnSetEntry(Move.CROSS_POISON,22),
                        new MoveLearnSetEntry(Move.FLING,28),
                        new MoveLearnSetEntry(Move.ROOST,36),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,56),
                        new MoveLearnSetEntry(Move.BELCH,64),
                        new MoveLearnSetEntry(Move.METAL_CLAW,"egg"),
                        new MoveLearnSetEntry(Move.TOXIC,"egg"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"egg"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"egg"),
                        new MoveLearnSetEntry(Move.SWALLOW,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 25, 41, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP, Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
    }
}
