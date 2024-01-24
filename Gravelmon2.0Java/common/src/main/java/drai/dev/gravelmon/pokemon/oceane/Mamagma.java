package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mamagma extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mamagma() {
        super("Mamagma",
                Type.FIRE,
                new Stats(183,
                        76,
                        63,
                        103,
                        64,
                        41),
                List.of(Ability.CUTE_CHARM), Ability.BERSERK,
                8, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.0,
                186, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of(""),
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
           setLangFileName("Mamagma");

    }


}
