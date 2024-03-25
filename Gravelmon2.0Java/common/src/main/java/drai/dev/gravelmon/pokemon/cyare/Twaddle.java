package drai.dev.gravelmon.pokemon.cyare;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Twaddle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Twaddle() {
        super("Twaddle",
                Type.WATER,
                new Stats(72,
                        57,
                        67,
                        88,
                        65,
                        66),
                List.of(Ability.TORRENT), Ability.TORRENT,
                8, 288,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                145, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Twaddle have an acute sense of loyalty to those who feed it and take care of it. If itself is challenged, it will battle as it usually would - however, if it's family is threatened, Twaddle will fight with unbridled might."),
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
           setLangFileName("Twaddle");

    }


}
