package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Siphonowar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Siphonowar() {
        super("Siphonowar",
                Type.PSYCHIC,
                new Stats(65,
                        55,
                        55,
                        100,
                        85,
                        50),
                List.of(Ability.LEVITATE), Ability.ANALYTIC,
                8, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Since merging, their psychic power is tripled - but now finds itself prone to sudden mood swings. A touch from one of its fingers is enough to see all your memories and thoughts."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Siphonowar");

    }


}
