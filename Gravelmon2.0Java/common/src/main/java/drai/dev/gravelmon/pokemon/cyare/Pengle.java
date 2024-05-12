package drai.dev.gravelmon.pokemon.cyare;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Pengle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pengle() {
        super("Pengle",
                Type.WATER,
                new Stats(54,
                        42,
                        48,
                        68,
                        46,
                        48),
                List.of(Ability.TORRENT), Ability.TORRENT,
                6, 91,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Pengle love to hobble around arctic-level temperatures and slide on their bellies for fun. Though they are a tad lazy, Pengle will search for fish endlessly when they're hungry."),
                List.of(),
                List.of(                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pengle");

    }


}
