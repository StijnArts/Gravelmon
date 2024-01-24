package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sliterfall extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sliterfall() {
        super("Sliterfall",
                Type.WATER,
                new Stats(40,
                        55,
                        50,
                        60,
                        60,
                        55),
                List.of(Ability.TORRENT), Ability.WATER_ABSORB,
                8, 165,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_1),
                List.of("Sliterfall are born exclusively at river springs. As they grow too big they start making their journey to the ocean."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sliterfall");

    }


}
