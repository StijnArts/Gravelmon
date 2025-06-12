package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochTentacruel extends drai.dev.data.pokemon.Pokemon {
    public EpochTentacruel(String name, Aspect aspect) {
        super(name, aspect, "EpochTentacruel",
                Type.COSMIC,Type.WATER,
                new Stats(100,
                        40,
                        100,
                        80,
                        90,
                        105),
                List.of(Ability.DARKMATTER,Ability.SUCTION_CUPS), Ability.OVERCOAT,
                16, 550,
                new Stats(0,0,0,0,2,0), 123,
                0.5,
                180, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Its head looks suspiciously like a wizard hat leading some people to believe that it has some magical powers that it conceals."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_PULSE,15),
                        new MoveLearnSetEntry(Move.EERIE_SPELL,38),
                        new MoveLearnSetEntry(Move.OCEANBLAST,35),
                        new MoveLearnSetEntry(Move.QUICKSPELL,9),
                        new MoveLearnSetEntry(Move.URANOMETRIA,67),
                        new MoveLearnSetEntry(Move.ARCANEENERGY,55),
                        new MoveLearnSetEntry(Move.AQUA_RING,12),
                        new MoveLearnSetEntry(Move.TIDALWAVE,51),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.MOONBLAST,41),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,31),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.GENESIS,59),
                        new MoveLearnSetEntry(Move.RADIATION,4),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,63),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,1),
                        new MoveLearnSetEntry(Move.STARFALL,21),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,27),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,18),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,47),
                        new MoveLearnSetEntry(Move.CLONESURGE,7),
                        new MoveLearnSetEntry(Move.PULSE,24),
                        new MoveLearnSetEntry(Move.VOIDDRIFT,1),
                        new MoveLearnSetEntry(Move.PRIMALWAVE,44),
                        new MoveLearnSetEntry(Move.ARCANEENERGY,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CASCADE,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.COSMICAVATAR,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.FANTASYSEAL,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GAMMA_RAY,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPOTHERMIA,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.METEORDRIVE,"tm"),
                        new MoveLearnSetEntry(Move.MINDDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MIXEDWAVES,"tm"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICPULSE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.OCEANWRATH,"tm"),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.PHOBIA,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm"),
                        new MoveLearnSetEntry(Move.SOLARECLIPSE,"tm"),
                        new MoveLearnSetEntry(Move.STARDUSTREVERIE,"tm"),
                        new MoveLearnSetEntry(Move.STEAM_ERUPTION,"tm"),
                        new MoveLearnSetEntry(Move.STELLARRUSH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.VITALITYDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_DEEP_OCEAN, Biome.IS_END)
    .atNight()
    .belowY(32)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Tentacruel");

    }


}
