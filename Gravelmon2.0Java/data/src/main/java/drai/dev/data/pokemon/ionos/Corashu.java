package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Corashu extends drai.dev.data.pokemon.Pokemon {
    public Corashu() {
        super("Corashu",
                Type.WATER,
                new Stats(60,
                        70,
                        50,
                        70,
                        77,
                        80),
                List.of(Ability.TORRENT), Ability.ZEN_MODE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Corashu (Normal Form) is still getting used to dry land. Its insides contains water, making it possible to survive far away from any natural water source. While exploring more effectively, it transforms into an odd shaped coral, hovering around at high speeds."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Corashu");

    }


}
