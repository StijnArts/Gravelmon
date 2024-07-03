package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Suburvian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Suburvian() {
        super("Suburvian",
                Type.NORMAL, Type.FLYING,
                new Stats(82,
                        77,
                        57,
                        40,
                        57,
                        68),
                List.of(Ability.BIG_PECKS,Ability.GUTS,Ability.OBLIVIOUS), Ability.OBLIVIOUS,
                5, 165,
                new Stats(2,0,0,0,0,0), 120,
                0.5,
                133, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Suburvian are commonly know to steal any food they see. They are quick to anger and attack agitators."),
                List.of(new EvolutionEntry("horrendove", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.GUST,5),
                        new MoveLearnSetEntry(Move.THIEF,8),
                        new MoveLearnSetEntry(Move.PLUCK,13),
                        new MoveLearnSetEntry(Move.SWAGGER,17),
                        new MoveLearnSetEntry(Move.ROOST,21),
                        new MoveLearnSetEntry(Move.ASSURANCE,26),
                        new MoveLearnSetEntry(Move.TAUNT,31),
                        new MoveLearnSetEntry(Move.EMBARGO,34),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,41),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,45),
                        new MoveLearnSetEntry(Move.AIR_SLASH,51),
                        new MoveLearnSetEntry(Move.ENDEAVOR,58),
                        new MoveLearnSetEntry(Move.FEATHERRUSH,65),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 16, 38, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Suburvian");
        setCanFly(true);

    }


}
