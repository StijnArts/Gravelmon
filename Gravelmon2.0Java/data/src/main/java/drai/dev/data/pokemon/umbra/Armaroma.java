package drai.dev.data.pokemon.umbra;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Armaroma extends Pokemon {
    public Armaroma() {
        super("Armaroma",
                Type.FAIRY, Type.GROUND,
                new Stats(90,
                        80,
                        120,
                        60,
                        60,
                        50),
                List.of(Ability.BATTLE_ARMOR), Ability.AROMA_VEIL,
                14, 940,
                new Stats(0,0,2,0,0,0), 75,
                0.5,
                161, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Armaroma emit a sickly-sweet smell from their bodies. It appears to confuse predators that rely on smell."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,6),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,10),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,15),
                        new MoveLearnSetEntry(Move.DIG,19),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,24),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,30),
                        new MoveLearnSetEntry(Move.CHARM,36),
                        new MoveLearnSetEntry(Move.BODY_SLAM,42),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,48),
                        new MoveLearnSetEntry(Move.ROLLOUT,54),
                        new MoveLearnSetEntry(Move.SKULL_BASH,60),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.BLOCK,"tutor"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.DRILL_RUN,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor")
                        ),
                List.of(Label.UMBRA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(27)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
