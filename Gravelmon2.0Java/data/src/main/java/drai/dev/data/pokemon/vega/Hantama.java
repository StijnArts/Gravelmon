package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hantama extends Pokemon {
    public Hantama() {
        super( "Hantama",
                Type.GHOST, Type.FIGHTING,
                new Stats(60	,
                        115	,
                        70	,
                        65	,
                        50	,
                        95),
                List.of(Ability.INTIMIDATE), Ability.KEEN_EYE,
                15, 315,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                151, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY, EggGroup.HUMAN_LIKE),
                List.of("It can move through solid matter. It is skilled at hunting prey by hiding in the ground or dropping through the ceiling."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,5),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,9),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,14),
                        new MoveLearnSetEntry(Move.SMELLING_SALTS,18),
                        new MoveLearnSetEntry(Move.DETECT,22),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,27),
                        new MoveLearnSetEntry(Move.SPITE,31),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,35),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,40),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,44),
                        new MoveLearnSetEntry(Move.SWAGGER,48),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,53),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,57),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,61),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DEVASTATE,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.RAGING_FLAME,"tm"),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.PSYGATLING,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"egg"),
                        new MoveLearnSetEntry(Move.BIDE,"egg"),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"egg"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"egg"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.FORCE_PALM,"egg"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"egg"),
                        new MoveLearnSetEntry(Move.GRUDGE,"egg"),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,"egg"),
                        new MoveLearnSetEntry(Move.ICICLE_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.JUMP_KICK,"egg"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.RETURN,"egg"),
                        new MoveLearnSetEntry(Move.REVENGE,"egg"),
                        new MoveLearnSetEntry(Move.ROLLING_KICK,"egg"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"egg"),
                        new MoveLearnSetEntry(Move.TAUNT,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(22)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY, Biome.IS_BAMBOO)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
