package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochKadabra extends drai.dev.data.pokemon.Pokemon {
    public EpochKadabra(String name, Aspect aspect) {
        super(name, aspect, "EpochKadabra",
                Type.FIGHTING,Type.NORMAL,
                new Stats(65,
                        35,
                        55,
                        80,
                        90,
                        75),
                List.of(Ability.INNER_FOCUS,Ability.STEADFAST), Ability.PURE_POWER,
                13, 565,
                new Stats(0,0,0,0,0,2), 100,
                0.25,
                140, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("It trains its fists both through repetitive attacks against hard surfaces and also against ethereal forces as regular training."),
                List.of(new EvolutionEntry("epochalakazam", EvolutionType.ITEM_INTERACT, false, List.of(),
 List.of(), List.of(), "cobblemon:black_belt")),
                List.of(
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,40),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,21),
                        new MoveLearnSetEntry(Move.DETERMINATION,54),
                        new MoveLearnSetEntry(Move.CHIDORI,37),
                        new MoveLearnSetEntry(Move.FANTASYSEAL,21),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,17),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,9),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,13),
                        new MoveLearnSetEntry(Move.COACHING,28),
                        new MoveLearnSetEntry(Move.CHAKRABLAST,58),
                        new MoveLearnSetEntry(Move.RETURN,47),
                        new MoveLearnSetEntry(Move.REST,34),
                        new MoveLearnSetEntry(Move.CLONESURGE,1),
                        new MoveLearnSetEntry(Move.DEADLYREACH,31),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,51),
                        new MoveLearnSetEntry(Move.CHIORB,4),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,4),
                        new MoveLearnSetEntry(Move.SHUTDOWN,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,25),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,44),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,9),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHIDORI,"tm"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.COUPDEGRACE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DEADLYREACH,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FANTASYSEAL,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HEAVENSKNUCKLE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHTSABER,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.MOSSYPUNCH,"tm"),
                        new MoveLearnSetEntry(Move.MYSTICPULSE,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.PAY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PURGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Kadabra");

    }


}
