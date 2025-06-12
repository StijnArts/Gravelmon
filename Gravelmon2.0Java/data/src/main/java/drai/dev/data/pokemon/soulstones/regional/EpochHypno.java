package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochHypno extends drai.dev.data.pokemon.Pokemon {
    public EpochHypno(String name, Aspect aspect) {
        super(name, aspect, "EpochHypno",
                Type.DARK,Type.FIGHTING,
                new Stats(80,
                        105,
                        85,
                        72,
                        68,
                        73),
                List.of(Ability.REALISM,Ability.MOLD_BREAKER), Ability.MOXIE,
                16, 756,
                new Stats(0,0,0,0,2,0), 100,
                0.5,
                169, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("It carries around a pendant as a trophy. It is a grossly unpleasant creature as it both farts and snores loudly."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPOIL,21),
                        new MoveLearnSetEntry(Move.FRENZY,57),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,61),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,53),
                        new MoveLearnSetEntry(Move.SPECTRAL_THIEF,45),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.ROAR,1),
                        new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.ROLLING_KICK,1),
                        new MoveLearnSetEntry(Move.VENDETTA,25),
                        new MoveLearnSetEntry(Move.FALSE_SURRENDER,33),
                        new MoveLearnSetEntry(Move.REVENGE,14),
                        new MoveLearnSetEntry(Move.TORMENT,7),
                        new MoveLearnSetEntry(Move.BACKSTABBING,1),
                        new MoveLearnSetEntry(Move.SWAGGER,17),
                        new MoveLearnSetEntry(Move.BULK_UP,29),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,37),
                        new MoveLearnSetEntry(Move.NO_RETREAT,49),
                        new MoveLearnSetEntry(Move.POISONSPIT,4),
                        new MoveLearnSetEntry(Move.BRUTEFORCE,41),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DUNEBLAST,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.EXECUTION,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GOBLINSTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.GOLDRUSH,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_MASH,"tm"),
                        new MoveLearnSetEntry(Move.MINDDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.MOSSYPUNCH,"tm"),
                        new MoveLearnSetEntry(Move.MUDSHACKLES,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.VITALITYDRAIN,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(34)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DEEP_DARK)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Hypno");

    }


}
