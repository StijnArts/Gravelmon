package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Festale extends drai.dev.data.pokemon.Pokemon {
    public Festale() {
        super("Festale",
                Type.DRAGON,Type.ELECTRIC,
                new Stats(60,
                        50,
                        55,
                        103,
                        82,
                        70),
                List.of(Ability.LIGHTNING_ROD,Ability.CLOUD_NINE), Ability.SERENE_GRACE,
                15, 306,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Rarely seen, they stay deep in the mountains away from civilization. Festale are thought to bring summer showers."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Festale");

    }


}
