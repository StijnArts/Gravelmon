package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochFurfrou extends drai.dev.data.pokemon.Pokemon {
    public EpochFurfrou(String name, Aspect aspect) {
        super(name, aspect, "EpochFurfrou",
                Type.FLYING,
                new Stats(70,
                        75,
                        65,
                        115,
                        75,
                        75),
                List.of(Ability.ADAPTABILITY), null,
                12, 280,
                new Stats(0,0,0,0,0,2), 120,
                0.5,
                165, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("These Pokemon are rumoured to be representations of various weather systems in the form of a Pokemon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HURRICANE,52),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.JETDIVE,8),
                        new MoveLearnSetEntry(Move.AIR_SLASH,36),
                        new MoveLearnSetEntry(Move.GENESIS,56),
                        new MoveLearnSetEntry(Move.TICKLE,4),
                        new MoveLearnSetEntry(Move.GALEHOLD,1),
                        new MoveLearnSetEntry(Move.ACROBATICS,16),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,12),
                        new MoveLearnSetEntry(Move.STREAMRUSH,20),
                        new MoveLearnSetEntry(Move.TAILWIND,24),
                        new MoveLearnSetEntry(Move.TURBULENCE,28),
                        new MoveLearnSetEntry(Move.ROOST,32),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,40),
                        new MoveLearnSetEntry(Move.MOONLIGHT,44),
                        new MoveLearnSetEntry(Move.PRIMALWAVE,48),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.DEAFEN,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FLOCK,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FORTISSIMO,"tm"),
                        new MoveLearnSetEntry(Move.GENESIS,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.PURGE,"tm"),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.TORNADO,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.TURBULENCE,"tm"),
                        new MoveLearnSetEntry(Move.WAIL,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"egg"),
                        new MoveLearnSetEntry(Move.WORK_UP,"egg"),
                        new MoveLearnSetEntry(Move.MIMIC,"egg"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"egg"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(21)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Furfrou");

    }


}
