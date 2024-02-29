package drai.dev.gravelmon.pokemon.flux;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Pyropteryx extends Pokemon {
    public Pyropteryx() {
        super("Pyropteryx",
                Type.FIRE, Type.FLYING,
                new Stats(75,
                        100,
                        70,
                        90,
                        70,
                        125),
                List.of(Ability.BLAZE), Ability.TOUGH_CLAWS,
                17, 460,
                new Stats(0,1,0,0,0,2), 45,
                0.875,
                265, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING, EggGroup.FIELD),
                List.of("Descended from a common ancestor of bird and dinosaur Pokemon. Its developed feathers allow it to glide, leaving scorching flames in its wake."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLY,1),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,11),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,15),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,20),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,26),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,31),
                        new MoveLearnSetEntry(Move.WHIRLWIND,39),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,46),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,54),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,61),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"egg"),
                        new MoveLearnSetEntry(Move.TAILWIND,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg")
                ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 32, 45, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
    }
}
