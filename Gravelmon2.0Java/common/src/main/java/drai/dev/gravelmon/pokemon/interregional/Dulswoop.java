package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Dulswoop extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dulswoop() {
        super("Dulswoop",
                Type.ICE,Type.FLYING,
                new Stats(132,
                        72,
                        70,
                        93,
                        102,
                        61),
                List.of(Ability.ICE_BODY), Ability.SWEET_VEIL,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dulswoop typically only come out during the summer, ironically. During migration, the chocolate they melt off forms a type of delicious rain. Children love to run out with bowls to try and catch the delicious syrup."),
                List.of(),
                List.of(                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dulswoop");

    }


}
