package drai.dev.gravelmon.pokemon.mastenia;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Beetleer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Beetleer() {
        super("Beetleer",
                Type.ROCK, Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Beetleer is a peculiar Pokémon. What seems to be the body of an insect has been taken over by an unusual gem. The gemstone itself may be associated with Sableye in some way."),
                List.of(),
                List.of(                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Beetleer");

    }


}
