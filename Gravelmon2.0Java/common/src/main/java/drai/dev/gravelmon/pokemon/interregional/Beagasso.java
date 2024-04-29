package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Beagasso extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beagasso() {
        super("Beagasso",
                Type.NORMAL,
                new Stats(75,
                        60,
                        85,
                        60,
                        95,
                        105),
                List.of(Ability.OWN_TEMPO,Ability.TECHNICIAN,Ability.MOODY), Ability.MOODY,
                15, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                       new MoveLearnSetEntry(Move.SKETCH,1),
                        new MoveLearnSetEntry(Move.SKETCH,11),
                        new MoveLearnSetEntry(Move.SKETCH,21),
                        new MoveLearnSetEntry(Move.SKETCH,31),
                        new MoveLearnSetEntry(Move.SKETCH,41),
                        new MoveLearnSetEntry(Move.SKETCH,51),
                        new MoveLearnSetEntry(Move.SKETCH,61),
                        new MoveLearnSetEntry(Move.SKETCH,71),
                        new MoveLearnSetEntry(Move.SKETCH,81),
                        new MoveLearnSetEntry(Move.SKETCH,91)             ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 39, 59, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Beagasso");

    }


}
