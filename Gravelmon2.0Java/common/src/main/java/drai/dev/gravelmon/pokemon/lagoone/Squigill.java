package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Squigill extends drai.dev.gravelmon.pokemon.Pokemon {
    public Squigill() {
        super("Squigill",
                Type.WATER,
                new Stats(45,
                        40,
                        52,
                        66,
                        61,
                        50),
                List.of(Ability.TORRENT), Ability.HYDRATION,
                5, 55,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Its slippery skin allow its body to never dry while out of water. It prefers live by very clean waters so it is always migrating to new areas."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Squigill");

    }


}
