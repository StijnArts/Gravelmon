package drai.dev.gravelmon.pokemon.dhiome;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Bubblebon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bubblebon() {
        super("Bubblebon",
                Type.WATER,
                new Stats(55,
                        60,
                        45,
                        50,
                        55,
                        45),
                List.of(Ability.TORRENT), Ability.IRON_FIST,
                5, 59,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Groups of these Pokemon tend to gather around ponds happily splashing water to each other. When enraged it defends itself with Bubbles."),
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
           setLangFileName("Bubblebon");

    }


}
