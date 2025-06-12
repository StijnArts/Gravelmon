package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cocopow extends drai.dev.data.pokemon.Pokemon {
    public Cocopow() {
        super("Cocopow",
                Type.ROCK, Type.FIGHTING,
                new Stats(50,
                        65,
                        130,
                        45,
                        80,
                        25),
                List.of(Ability.UNAWARE,Ability.HUGE_POWER), Ability.ROCK_HEAD,
                6, 159,
                new Stats(0,0,2,0,0,0), 190,
                0.5,
                135, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MINERAL),
                List.of("Cocopow travel by floating across the ocean, and can often be found miles from mainland. Contrary to popular belief, Cocopow don't have tasty juice inside their body."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,6),
                        new MoveLearnSetEntry(Move.ROLLOUT,10),
                        new MoveLearnSetEntry(Move.REST,13),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,16),
                        new MoveLearnSetEntry(Move.BRINE,19),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,23),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,27),
                        new MoveLearnSetEntry(Move.MILK_DRINK,31),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,36),
                        new MoveLearnSetEntry(Move.AMNESIA,41),
                        new MoveLearnSetEntry(Move.EXPLOSION,46),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,51),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.BAMBOOSHOT,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.SLACK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm")                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Cocopow");

    }


}
