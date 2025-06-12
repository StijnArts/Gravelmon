package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Liquiput extends Pokemon {
    public Liquiput() {
        super( "Liquiput",
                Type.WATER,
                new Stats(60,
                        47,
                        48,
                        65,
                        58,
                        40),
                List.of(Ability.TORRENT), Ability.LIQUID_OOZE,
                6, 65,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.AMORPHOUS),
                List.of("Its body is made of liquid, so droughts pose a great danger to it. It is always found close to a source of water."),
                List.of(new EvolutionEntry("hydrush", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BUBBLE,8),
                        new MoveLearnSetEntry(Move.WATER_SPORT,11),
                        new MoveLearnSetEntry(Move.WATER_GUN,13),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,18),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,21),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,23),
                        new MoveLearnSetEntry(Move.SCALD,28),
                        new MoveLearnSetEntry(Move.POISON_GAS,31),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,33),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,41),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,43),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,48),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_BOLT,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tutor"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,"tutor"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"egg"),
                        new MoveLearnSetEntry(Move.ASTONISH,"egg"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"egg"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"egg"),
                        new MoveLearnSetEntry(Move.CORNER,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.DIVE,"egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"egg"),
                        new MoveLearnSetEntry(Move.FROSTBITE,"egg"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.HAIL,"egg"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"egg"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.RECOVER,"egg"),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"egg"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"egg"),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,"egg"),
                        new MoveLearnSetEntry(Move.SNATCH,"egg"),
                        new MoveLearnSetEntry(Move.SNORE,"egg"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
    }
}
