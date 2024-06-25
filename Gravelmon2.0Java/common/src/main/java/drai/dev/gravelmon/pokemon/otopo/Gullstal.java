package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Gullstal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gullstal() {
        super("Gullstal",
                Type.WATER, Type.FLYING,
                new Stats(40,
                        30,
                        30,
                        65,
                        40,
                        65),
                List.of(Ability.DRIZZLE,Ability.HYDRATION), Ability.SWIFT_SWIM,
                6, 95,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                54, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FLYING),
                List.of("Gullstal is a popular choice among sailors and fisherman. Its diminutive size allows it to get into places that other Pokémon can't. It frequently quarrels with Wingull."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.BUBBLE,4),
                        new MoveLearnSetEntry(Move.SUPERSONIC,5),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.MIST,12),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,19),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,23),
                        new MoveLearnSetEntry(Move.PURSUIT,26),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,28),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,30),
                        new MoveLearnSetEntry(Move.AGILITY,35),
                        new MoveLearnSetEntry(Move.ROOST,37),
                        new MoveLearnSetEntry(Move.AIR_SLASH,41),
                        new MoveLearnSetEntry(Move.HURRICANE,45),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm")                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gullstal");

    }


}
