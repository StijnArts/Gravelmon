package drai.dev.gravelmon.pokemon.ultraspace;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Sulgast extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sulgast() {
        super("Sulgast",
                Type.DARK, Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
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
           setLangFileName("Sulgast");

    }


}
