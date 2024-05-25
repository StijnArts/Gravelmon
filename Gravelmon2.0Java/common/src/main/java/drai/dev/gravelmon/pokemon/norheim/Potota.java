package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Potota extends drai.dev.gravelmon.pokemon.Pokemon {
    public Potota(Stats stats) {
        super("Potota",
                Type.GRASS, Type.GROUND,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,5),
                        new MoveLearnSetEntry(Move.MIST,10),
                        new MoveLearnSetEntry(Move.MUD_SHOT,15),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,20),
                        new MoveLearnSetEntry(Move.MUD_BOMB,25),
                        new MoveLearnSetEntry(Move.SWAGGER,30),
                        new MoveLearnSetEntry(Move.INGRAIN,35),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,41),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,45)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 17, 33, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WINTER, Biome.IS_AUTUMN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_CROPS),
                0.28, 0.3,
                List.of());
           setLangFileName("Potota");

    }


}
