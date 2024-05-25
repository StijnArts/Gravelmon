package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Rancroak extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rancroak() {
        super("Rancroak",
                Type.POISON, Type.DARK,
                new Stats(70,
                        70,
                        70,
                        50,
                        50,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,2), 120,
                0.5,
                140, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Due to the acidic qualities of its saliva, it feels a continual burning sensation on its tongue. A single lick from a Pokemon may render you paralysed for life."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.SPLASH,"tm"),
                        new MoveLearnSetEntry(Move.MIND_READER,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.REFRESH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.WATER_SPORT,"tm")                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rancroak");

    }


}
