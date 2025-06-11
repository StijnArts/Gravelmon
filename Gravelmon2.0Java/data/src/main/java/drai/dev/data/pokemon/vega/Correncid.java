package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Correncid extends Pokemon {
    public Correncid() {
        super( "Correncid",
                Type.WATER, Type.POISON,
                new Stats(100,
                        80,
                        85,
                        110,
                        90,
                        60),
                List.of(Ability.TORRENT), Ability.LIQUID_OOZE,
                14, 350,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                210, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.AMORPHOUS),
                List.of("A mysterious Pokemon that connects this world and the next. Anyone who follows it to the next world will not return."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYDRO_CANNON,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.DELUGE,1),
                        new MoveLearnSetEntry(Move.CURSED_WRATH,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.BUBBLE,8),
                        new MoveLearnSetEntry(Move.WATER_SPORT,11),
                        new MoveLearnSetEntry(Move.WATER_GUN,13),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,14),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,19),
                        new MoveLearnSetEntry(Move.MINIMIZE,23),
                        new MoveLearnSetEntry(Move.SLUDGE,26),
                        new MoveLearnSetEntry(Move.SCALD,32),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,36),
                        new MoveLearnSetEntry(Move.TOXIC,36),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,41),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,52),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,57),
                        new MoveLearnSetEntry(Move.TOXIN_SPRAY,65),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_BOLT,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
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
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
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
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
    }
}
