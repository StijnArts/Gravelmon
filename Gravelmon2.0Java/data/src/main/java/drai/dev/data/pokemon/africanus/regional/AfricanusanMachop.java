package drai.dev.data.pokemon.africanus.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AfricanusanMachop extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanMachop(String name, Aspect aspect) {
        super(name, aspect, "Machop",
                Type.ROCK,
                new Stats(70,
                        80,
                        50,
                        35,
                        35,
                        35),
                List.of(Ability.DISGUISE), null,
                8, 195,
                new Stats(0,1,0,0,0,0), 180,
                0.25,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Se entrena hasta la extenuación para dominar todo tipo de artes marciales. Es tan fuerte que puede llevar a un luchador de sumo sobre los hombros."),
                List.of(new EvolutionEntry("machoke africanusan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(
                        new MoveLearnSetEntry(Move.KARATE_CHOP,10),
                        new MoveLearnSetEntry(Move.VITAL_THROW,31),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.FORESIGHT,19),
                        new MoveLearnSetEntry(Move.SUBMISSION,34),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,13),
                        new MoveLearnSetEntry(Move.LOW_KICK,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,7),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,43),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,37),
                        new MoveLearnSetEntry(Move.REVENGE,25),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,49),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,22),
                        new MoveLearnSetEntry(Move.SCARY_FACE,46),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"egg"),
                        new MoveLearnSetEntry(Move.COUNTER,"egg"),
                        new MoveLearnSetEntry(Move.ENCORE,"egg"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"egg"),
                        new MoveLearnSetEntry(Move.MEDITATE,"egg"),
                        new MoveLearnSetEntry(Move.POWER_TRICK,"egg"),
                        new MoveLearnSetEntry(Move.ROLLING_KICK,"egg"),
                        new MoveLearnSetEntry(Move.SMELLING_SALTS,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg")                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.JUNGLE_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Machop");

    }


}
