package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Carnibal extends Pokemon {
    public Carnibal() {
        super("Carnibal",
                Type.ICE, Type.DARK,
                new Stats(58, 125, 91, 75, 91, 85),
                List.of(Ability.INTIMIDATE, Ability.IRON_JAW), Ability.SNOW_CLOAK,
                17, 879,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                184, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Carnibal's ravaging hunger is never satisfied. It can't stand the thought of sharing food with others, so it leaves the pack to hunt on its own."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_FANG,1),
                        new MoveLearnSetEntry(Move.BEAT_UP,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,4),
                        new MoveLearnSetEntry(Move.PURSUIT,8),
                        new MoveLearnSetEntry(Move.HOWL,12),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.ICE_FANG,20),
                        new MoveLearnSetEntry(Move.HAZE,24),
                        new MoveLearnSetEntry(Move.SLASH,28),
                        new MoveLearnSetEntry(Move.FROST_SLASH,32),
                        new MoveLearnSetEntry(Move.CRUNCH,35),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,39),
                        new MoveLearnSetEntry(Move.SCARY_FACE,43),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,47),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,51),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,55),
                        new MoveLearnSetEntry(Move.MEGAHORN,59),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SNOWY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.STANDOFF,"tm"),
                        new MoveLearnSetEntry(Move.PINCER_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tutor"),
                        new MoveLearnSetEntry(Move.COUNTER,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.FLING,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                        new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"egg"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"egg"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"egg"),
                        new MoveLearnSetEntry(Move.HORN_LEECH,"egg"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.SLASH,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:ice",100, 1,2)
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(36)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .setAntiBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
