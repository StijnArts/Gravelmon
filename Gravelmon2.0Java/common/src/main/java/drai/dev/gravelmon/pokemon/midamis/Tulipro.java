package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Tulipro extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tulipro() {
        super("Tulipro",
                Type.POISON,Type.PSYCHIC,
                new Stats(65,
                        50,
                        65,
                        110,
                        65,
                        65),
                List.of(Ability.UNAWARE), Ability.LEVITATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Proseed has blossomed into Tulipro, now becoming much more carefree instead of worrisome. If attacked, it will likely take a few seconds for it to even register the pain."),
                List.of(),
                List.of(                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tulipro");

    }


}
