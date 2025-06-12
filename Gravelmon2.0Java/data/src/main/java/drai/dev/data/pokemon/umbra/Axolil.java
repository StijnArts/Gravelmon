package drai.dev.data.pokemon.umbra;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Axolil extends Pokemon {
    public Axolil() {
        super("Axolil",
                Type.WATER, Type.PSYCHIC,
                new Stats(20,
                        20,
                        20,
                        70,
                        60,
                        20),
                List.of(Ability.SENSORY_BOOST), Ability.SWIFT_SWIM,
                7, 68,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                40, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Axolil have a petrifying fear of drying out. If taken away from water and released, they will dowse for the nearest source of fresh water."),
                List.of(new EvolutionEntry("visimander", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_SPORT,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.CONFUSION,7),
                        new MoveLearnSetEntry(Move.MUDSLAP,10),
                        new MoveLearnSetEntry(Move.WATER_GUN,13),
                        new MoveLearnSetEntry(Move.DETECT,16),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,19),
                        new MoveLearnSetEntry(Move.WATER_PULSE,22),
                        new MoveLearnSetEntry(Move.MUD_BOMB,25),
                        new MoveLearnSetEntry(Move.MIND_READER,28),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,32),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,36),
                        new MoveLearnSetEntry(Move.HAZE,44),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,48),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor")
                        ),
                List.of(Label.UMBRA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(2)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_LUSH)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
