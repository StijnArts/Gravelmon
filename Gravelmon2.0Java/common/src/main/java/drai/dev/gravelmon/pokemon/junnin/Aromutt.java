package drai.dev.gravelmon.pokemon.junnin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Aromutt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aromutt() {
        super("Aromutt",
                Type.NORMAL,
                new Stats(50,
                        64,
                        50,
                        47,
                        50,
                        60),
                List.of(Ability.FOREWARN,Ability.PICKUP,Ability.FRIEND_GUARD), Ability.FRIEND_GUARD,
                4, 165,
                new Stats(0,1,0,0,0,0), 244,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Aromutt has an amazing sense of smell that lets it seek out lost people and things. It is known as the Domestic Pokemon because it can only be found in captivity. It only lives with humans in cities and towns."),
                List.of(new EvolutionEntry("odorog", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.SCRATCH,7),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,10),
                        new MoveLearnSetEntry(Move.BITE,13),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,16),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,19),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,22),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.CUDDLE,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BIDE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.BOLTIN,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Aromutt");

    }


}
