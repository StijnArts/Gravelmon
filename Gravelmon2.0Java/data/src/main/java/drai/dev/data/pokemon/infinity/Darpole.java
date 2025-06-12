package drai.dev.data.pokemon.infinity;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Darpole extends Pokemon {
    public Darpole() {
        super("Darpole",
                Type.WATER,
                new Stats(56, 60, 50, 40, 60, 40),
                List.of(Ability.PICKPOCKET, Ability.SWIFT_SWIM), Ability.INFILTRATOR,
                5, 28,
                new Stats(0,0,0,0,1,0), 45,
                0.875,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                52, List.of(EggGroup.MONSTER, EggGroup.WATER_1),
                List.of("This Pokemon likes to play pranks on trainers who get too close to the edge of a pond, and then dive down into the water where it can't be reached."),
                List.of(new EvolutionEntry("brutoad", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,2),
                        new MoveLearnSetEntry(Move.BUBBLE,3),
                        new MoveLearnSetEntry(Move.ASTONISH,4),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.BIDE,12),
                        new MoveLearnSetEntry(Move.TAUNT,15),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,19),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,23),
                        new MoveLearnSetEntry(Move.SCALD,26),
                        new MoveLearnSetEntry(Move.POISON_FANG,29),
                        new MoveLearnSetEntry(Move.BEAT_UP,32),
                        new MoveLearnSetEntry(Move.PAYBACK,35),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.AQUA_JET,40),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,44),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,47),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,53),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,62),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.BLOCK,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tutor"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tutor"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"egg"),
                        new MoveLearnSetEntry(Move.BRINE,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.REFRESH,"egg"),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")
                        ),
                List.of(Label.INFINITY),
                2, List.of(
                        new ItemDrop("minecraft:leather",50, 1,2)
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FRESHWATER, Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
