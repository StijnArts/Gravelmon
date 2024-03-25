package drai.dev.gravelmon.pokemon.mushi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Tarpress extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tarpress() {
        super("Tarpress",
                Type.WATER,Type.PSYCHIC,
                new Stats(135,
                        102,
                        108,
                        55,
                        90,
                        40),
                List.of(Ability.TORRENT), Ability.MAGIC_GUARD,
                0, 0,
                new Stats(3,0,0,0,0,0), 0,
                0.875,
                265, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tarpress");

    }


}
