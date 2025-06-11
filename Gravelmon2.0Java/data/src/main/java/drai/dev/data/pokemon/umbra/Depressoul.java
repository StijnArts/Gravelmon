package drai.dev.data.pokemon.umbra;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Depressoul extends Pokemon {
    public Depressoul() {
        super("Depressoul",
                Type.GHOST,
                new Stats(50,
                        40,
                        65,
                        90,
                        110,
                        45),
                List.of(Ability.INSOMNIA, Ability.SOUNDPROOF), Ability.UNAWARE,
                5, 45,
                new Stats(0,0,0,0,2,0), 90,
                0.25,
                140, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Depressoul will actively move away from those that tell it to feel better. It responds best to trainers that are willing to quietly sit beside it."),
                List.of(new EvolutionEntry("spectorment", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.UPROAR,"")),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.PSYWAVE,1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.CONFIDE,6),
                        new MoveLearnSetEntry(Move.SCREECH,11),
                        new MoveLearnSetEntry(Move.HYPNOSIS,15),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,20),
                        new MoveLearnSetEntry(Move.ICY_WIND,25),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,30),
                        new MoveLearnSetEntry(Move.REST,36),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,36),
                        new MoveLearnSetEntry(Move.QUASH,42),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,47),
                        new MoveLearnSetEntry(Move.NIGHTMARE,53),
                        new MoveLearnSetEntry(Move.DREAM_EATER,59),
                        new MoveLearnSetEntry(Move.MEMENTO,64),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                    new MoveLearnSetEntry(Move.SNORE,"tutor"),
                    new MoveLearnSetEntry(Move.UPROAR,"tutor"),
                new MoveLearnSetEntry(Move.LAST_RESORT,"tutor"),
                new MoveLearnSetEntry(Move.SPITE,"tutor"),
                new MoveLearnSetEntry(Move.AFTER_YOU,"tutor"),
                new MoveLearnSetEntry(Move.GRAVITY,"tutor"),
                new MoveLearnSetEntry(Move.TELEKINESIS,"tutor"),
                new MoveLearnSetEntry(Move.ROLE_PLAY,"tutor"),
                new MoveLearnSetEntry(Move.FIRE_PUNCH,"tutor"),
                new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tutor"),
                new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tutor"),
                new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                new MoveLearnSetEntry(Move.TRICK,"tutor"),
                new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                new MoveLearnSetEntry(Move.SKILL_SWAP,"tutor")
                        ),
                List.of(Label.UMBRA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
