package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pipsicle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pipsicle() {
        super("Pipsicle",
                Type.ICE,
                new Stats(70,
                        20,
                        90,
                        70,
                        120,
                        90),
                List.of(Ability.REFRIGERATE,Ability.SNOWPLOW,Ability.PERMAFROST), Ability.PERMAFROST,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their bodies are made up of a similar substance to Never-Melt Ice. They can withstand harsh temperatures. Their cold bodies help cool the air around themselves, and for that, they are commonly used indoors for those who don't have air conditioning. However, people are warned not to be exposed to them for long periods of time due to fears of getting frostbite."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pipsicle");

    }


}
