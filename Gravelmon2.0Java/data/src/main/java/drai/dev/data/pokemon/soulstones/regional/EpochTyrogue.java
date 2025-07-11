package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochTyrogue extends drai.dev.data.pokemon.Pokemon {
    public EpochTyrogue(String name, Aspect aspect) {
        super(name, aspect, "EpochTyrogue",
                Type.FIGHTING,Type.NORMAL,
                new Stats(35,
                        35,
                        35,
                        35,
                        35,
                        35),
                List.of(Ability.SCRAPPY,Ability.LONG_REACH), Ability.NO_GUARD,
                7, 210,
                new Stats(0,1,0,0,0,0), 100,
                1.0,
                42, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("This Pokemon is said to be the alter-ego and secret identity of a famous superhero..."),
                List.of(new EvolutionEntry("epochhitmonlee", EvolutionType.ITEM_INTERACT, false, List.of(),
 List.of(), List.of(), "gravelmon:air_stone"),
new EvolutionEntry("epochhitmonchan", EvolutionType.ITEM_INTERACT, false, List.of(),
 List.of(), List.of(), "cobblemon:fire_stone"),
new EvolutionEntry("epochhitmontop", EvolutionType.ITEM_INTERACT, false, List.of(),
 List.of(), List.of(), "cobblemon:thunder_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.RAPID_STRIKE,41),
                        new MoveLearnSetEntry(Move.VITAL_THROW,32),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SUPERPOWER,49),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.COURT_CHANGE,37),
                        new MoveLearnSetEntry(Move.COVET,28),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,10),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,7),
                        new MoveLearnSetEntry(Move.ACHILLES_HEEL,23),
                        new MoveLearnSetEntry(Move.RETURN,45),
                        new MoveLearnSetEntry(Move.FAKE_OUT,4),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,14),
                        new MoveLearnSetEntry(Move.BULK_UP,18),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BATTLEOFWITS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.CHIDORI,"tm"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.COSMICAVATAR,"tm"),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,"tm"),
                        new MoveLearnSetEntry(Move.DEADLYREACH,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FANTASYSEAL,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.HEAVENSKNUCKLE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.METEOR_MASH,"tm"),
                        new MoveLearnSetEntry(Move.METRONOME,"tm"),
                        new MoveLearnSetEntry(Move.PAY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.SWEEPINGWIND,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.VENDETTA,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.BRUTEFORCE,"egg"),
                        new MoveLearnSetEntry(Move.MEDITATE,"egg"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.WORK_UP,"egg"),
                        new MoveLearnSetEntry(Move.BESTOW,"egg"),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,"egg"),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,"egg"),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.CHIORB,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tyrogue");

    }


}
