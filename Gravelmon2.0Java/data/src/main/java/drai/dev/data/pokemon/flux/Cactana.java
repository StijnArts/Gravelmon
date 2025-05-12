package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cactana extends Pokemon {
    public Cactana() {
        super("Cactana",
                Type.GROUND, Type.GRASS,
                new Stats(55,
                        60,
                        55,
                        45,
                        50,
                        55),
                List.of(Ability.ROUGH_SKIN, Ability.WATER_ABSORB), Ability.SAND_FORCE,
                5, 412,
                new Stats(0,1,0,0,0,0), 230,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON, EggGroup.GRASS),
                List.of("It burrows into the ground to avoid the sun, its tail peeking out so it can still photosynthesize. It looks just like a regular cactus this way."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.POISON_STING,5),
                        new MoveLearnSetEntry(Move.SAND_TOMB,8),
                        new MoveLearnSetEntry(Move.SYNTHESIS,13),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,16),
                        new MoveLearnSetEntry(Move.SPIKES,21),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,24),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,29),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,32),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,37),
                        new MoveLearnSetEntry(Move.SANDSTORM,40),
                        new MoveLearnSetEntry(Move.THORN_FALL,45),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,48),
                        new MoveLearnSetEntry(Move.SHED_TAIL,53),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"egg"),
                        new MoveLearnSetEntry(Move.GROWTH,"egg")
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 54, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
