package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flurrite extends drai.dev.data.pokemon.Pokemon {
    public Flurrite() {
        super("Flurrite",
                Type.ICE,Type.FAIRY,
                new Stats(21,
                        34,
                        31,
                        64,
                        42,
                        71),
                List.of(Ability.ICE_BODY,Ability.PIXILATE), Ability.SNOW_WARNING,
                2, 2,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                53, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Flurrite love to summon snow to play in. Large groups have been known to summon powerful blizzards. They're also responsible for unseasonal snowfalls."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flurrite");

    }


}