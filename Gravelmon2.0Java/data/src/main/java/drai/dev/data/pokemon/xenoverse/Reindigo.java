package drai.dev.data.pokemon.xenoverse;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Reindigo extends Pokemon {
    public Reindigo() {
        super("Reindigo",
                Type.DARK,
                new Stats(110, 128, 90, 54, 108, 60),
                List.of(Ability.DEFEATIST), Ability.DEFEATIST,
                25, 1200,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                183, ExperienceGroup.MEDIUM_SLOW,
                70,
                32, List.of(EggGroup.MONSTER, EggGroup.FIELD),
                List.of("Contrary to popular belief, it is a gentle soul. Actually, the cause for its constantly sullen face seems to lie in the excessive weight of its antlers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PAYBACK,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.FRUSTRATION,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.PRESENT,1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,1),
                        new MoveLearnSetEntry(Move.HEART_STAMP,19),
                        new MoveLearnSetEntry(Move.STOMP,24),
                        new MoveLearnSetEntry(Move.BESTOW,29),
                        new MoveLearnSetEntry(Move.WISH,35),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,42),
                        new MoveLearnSetEntry(Move.FRUSTRATION,48),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,56),
                        new MoveLearnSetEntry(Move.SUPERPOWER,61),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.COVET,"egg"),
                        new MoveLearnSetEntry(Move.SING,"egg"),
                        new MoveLearnSetEntry(Move.HEALING_WISH,"egg"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.BLOCK,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNATCH,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(45)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .atNight()
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
