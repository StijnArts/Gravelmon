package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Histameanie extends Pokemon {
    public Histameanie() {
        super("Histameanie",
                Type.GRASS,
                new Stats(50,
                        85,
                        60,
                        75,
                        60,
                        70),
                List.of(Ability.LEAF_GUARD, Ability.HAY_FEVER), Ability.BLOOMSPRING,
                7, 60,
                new Stats(1,0,0,0,0,0), 180,
                0.5,
                121, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.FAIRY),
                List.of("Histameanie are infamous for hiding in tall grass and attacking unsuspecting passerby. Due to this, it is uncommon to see a trainer in Kaskade without a repel."),
                List.of(),
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 18, 41, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
    }
}
