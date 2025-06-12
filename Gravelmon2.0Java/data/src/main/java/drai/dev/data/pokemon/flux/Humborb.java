package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Humborb extends Pokemon {
    public Humborb() {
        super("Humborb",
                Type.FLYING, Type.NORMAL,
                new Stats(46,
                        40,
                        38,
                        30,
                        30,
                        61),
                List.of(Ability.SAP_SIPPER, Ability.HONEY_GATHER), Ability.BULLETPROOF,
                3, 11,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                49, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It harvests nectar all day, which its belly converts into a high-powered fuel. If one is low on energy, others will share their nectar reserves."),
                List.of(new EvolutionEntry("navibri", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.SUPERSONIC,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.BULLET_SEED,14),
                        new MoveLearnSetEntry(Move.AGILITY,17),
                        new MoveLearnSetEntry(Move.DRILL_PECK,20),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,23),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,26),
                        new MoveLearnSetEntry(Move.TAILWIND,29),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,32),
                        new MoveLearnSetEntry(Move.EXPLOSION,35)
                        ),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
