package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Rabyoose extends Pokemon {
    public Rabyoose() {
        super("Rabyoose",
                Type.DARK, Type.FLYING,
                new Stats(75,
                        110,
                        70,
                        65,
                        75,
                        105),
                List.of(Ability.MOXIE, Ability.MALICE), Ability.INTIMIDATE,
                12, 231,
                new Stats(0,1,0,0,0,1), 120,
                0.5,
                143, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING, EggGroup.WATER_1),
                List.of("Most wild Rabyoose have no interest in humans or other Pokemon, making them hostile to anyone not of their kind. Rabyoose are known to aggressively charge at others in their pack to assert dominance."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HONE_CLAWS,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.MEMENTO,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.THIEF,7),
                        new MoveLearnSetEntry(Move.WATER_GUN,11),
                        new MoveLearnSetEntry(Move.WHIRLWIND,16),
                        new MoveLearnSetEntry(Move.PLUCK,20),
                        new MoveLearnSetEntry(Move.TORMENT,24),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,29),
                        new MoveLearnSetEntry(Move.PAYBACK,36),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,43),
                        new MoveLearnSetEntry(Move.LIQUIDATION,47),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,53),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,60),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.POWER_TRIP,"egg"),
                        new MoveLearnSetEntry(Move.ROOST,"egg"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 36, 56, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER, SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
    }
}
