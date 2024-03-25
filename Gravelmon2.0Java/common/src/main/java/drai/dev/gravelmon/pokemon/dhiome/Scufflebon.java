package drai.dev.gravelmon.pokemon.dhiome;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Scufflebon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scufflebon() {
        super("Scufflebon",
                Type.WATER,Type.FIGHTING,
                new Stats(75,
                        85,
                        55,
                        60,
                        70,
                        60),
                List.of(Ability.TORRENT), Ability.IRON_FIST,
                9, 116,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It uses its ears, as if they were hands, to unleash powerful blows. It is very proud of its power."),
                List.of(),
                List.of(                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scufflebon");

    }


}
