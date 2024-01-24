package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Verblunt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Verblunt() {
        super("Verblunt",
                Type.GRASS,Type.ROCK,
                new Stats(80,
                        73,
                        80,
                        60,
                        71,
                        56),
                List.of(Ability.OVERGROW), Ability.GRASS_PELT,
                8, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                147, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("A laid back Pokemon that spends most of its day sunbathing. Smaller bird Pokemon eventually build their nests on its back."),
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
           setLangFileName("Verblunt");

    }


}
