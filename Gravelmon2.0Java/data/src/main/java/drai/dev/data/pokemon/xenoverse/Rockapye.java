package drai.dev.data.pokemon.xenoverse;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Rockapye extends Pokemon {
    public Rockapye() {
        super("Rockapye",
                Type.ROCK, Type.NORMAL,
                new Stats(60, 70, 80, 40, 60, 55),
                List.of(Ability.PICKUP), Ability.ADAPTABILITY,
                7, 108,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                53, ExperienceGroup.MEDIUM_FAST,
                70,
                32, List.of(EggGroup.HUMAN_LIKE, EggGroup.FIELD),
                List.of("Despite its clumsy appearance, it is a very quick learner if followed step by step. Each Rockapye has a diffferent handprint."),
                List.of(new EvolutionEntry("troglolith", EvolutionType.LEVEL_UP, false, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,6),
                        new MoveLearnSetEntry(Move.WORK_UP,11),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,14),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,18),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,22),
                        new MoveLearnSetEntry(Move.FLING,26),
                        new MoveLearnSetEntry(Move.SMELLING_SALTS,30),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,35),
                        new MoveLearnSetEntry(Move.STRENGTH,40),
                        new MoveLearnSetEntry(Move.QUASH,44),
                        new MoveLearnSetEntry(Move.SLACK_OFF,50),
                        new MoveLearnSetEntry(Move.THRASH,54),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,58),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"egg"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .duringDaytime()
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        
    }
}
