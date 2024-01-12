package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Mosster extends Pokemon {
    public Mosster() {
        super("Mosster",
                Type.GRASS,
                new Stats(55,
                        60,
                        85,
                        60,
                        75,
                        55),
                List.of(Ability.RAIN_DISH, Ability.BLOOMSPRING), Ability.SAP_SIPPER,
                3, 34,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                71, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.FIELD),
                List.of("Mosster like to lay on roofs, using its fur to plant itself between the shingles. Large colonies of Mosster can form if not checked regularly."),
                List.of(new EvolutionEntry("mosskrat", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:water_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,3),
                        new MoveLearnSetEntry(Move.STUN_SPORE,6),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,9),
                        new MoveLearnSetEntry(Move.CHARM,12),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,15),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,18),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,21),
                        new MoveLearnSetEntry(Move.LEECH_SEED,24),
                        new MoveLearnSetEntry(Move.AFTER_YOU,27),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,30),
                        new MoveLearnSetEntry(Move.SYNTHESIS,33),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,36),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,39),
                        new MoveLearnSetEntry(Move.LEAF_STORM,42)
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 34, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_LUSH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
    }
}
