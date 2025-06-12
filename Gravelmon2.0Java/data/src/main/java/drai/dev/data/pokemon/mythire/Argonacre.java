package drai.dev.data.pokemon.mythire;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Argonacre extends drai.dev.data.pokemon.Pokemon {
    public Argonacre() {
        super("Argonacre",
                Type.ROCK,
                new Stats(50,
                        40,
                        120,
                        55,
                        120,
                        85),
                List.of(Ability.DAZZLING,Ability.STONECUTTER,Ability.SNOW_CLOAK), Ability.SNOW_CLOAK,
                15, 165,
                new Stats(0,0,2,0,0,0), 125,
                0.5,
                165, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.MINERAL),
                List.of("Argonacre are prized for their beautiful crystal shells, grown over the course of their whole lives. They were once plentiful, but poaching has made them rare."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POWER_GEM,1),
                        new MoveLearnSetEntry(Move.GEM_CRASH,1),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.BIND,1),
                        new MoveLearnSetEntry(Move.POWER_WHIP,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,1),
                        new MoveLearnSetEntry(Move.RAINBOW_GUST,1),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,1),
                        new MoveLearnSetEntry(Move.TICKLE,1),
                        new MoveLearnSetEntry(Move.SLAM,1),
                        new MoveLearnSetEntry(Move.CRYSTAL_DEFENSE,1),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ICYCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.OCEAN_MONUMENT)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);
        setCanFly(true);

    }


}
