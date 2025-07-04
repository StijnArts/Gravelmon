package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Jawligator extends drai.dev.data.pokemon.Pokemon {
    public Jawligator() {
        super("Jawligator",
                Type.GRASS, Type.WATER,
                new Stats(81,
                        103,
                        80,
                        86,
                        72,
                        73),
                List.of(Ability.SWIFT_SWIM,Ability.ANALYTIC,Ability.STRONG_JAW), Ability.STRONG_JAW,
                19, 165,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                239, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of("Jawligator has so much strength in its jaws that it can detach limbs with a single bite. It rolls around while dragging prey underwater to drown them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.BIDE,6),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.AQUA_JET,12),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,16),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,23),
                        new MoveLearnSetEntry(Move.NATURE_POWER,27),
                        new MoveLearnSetEntry(Move.CRUNCH,32),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,37),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,42),
                        new MoveLearnSetEntry(Move.WRING_OUT,50),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,56),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,62),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SANDSHOT,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TORPEDODASH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(42)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_JUNGLE, Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FRESHWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
