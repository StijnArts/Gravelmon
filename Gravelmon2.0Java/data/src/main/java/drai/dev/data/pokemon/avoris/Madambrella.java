package drai.dev.data.pokemon.avoris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Madambrella extends drai.dev.data.pokemon.Pokemon {
    public Madambrella() {
        super("Madambrella",
                Type.GHOST,Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.WIND_RIDER,Ability.UNBURDEN), Ability.INSOMNIA,
                12, 120,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Being sensitive to sunlight, they carry parasols for protection. They spend the night collecting and wearing valuable items of those that were once living."),
                List.of(),
                List.of(),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Madambrella");

    }


}
