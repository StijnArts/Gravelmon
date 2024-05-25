package drai.dev.gravelmon.pokemon.ultraspace;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Cubirite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cubirite() {
        super("Cubirite",
                Type.FIGHTING, Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Cubirite are curious and are said to be the slice of a moon. They are kind spirited but can pack a punch if intimidated."),
                List.of(),
                List.of(                        ),
                List.of(Label.ULTRASPACE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cubirite");

    }


}
