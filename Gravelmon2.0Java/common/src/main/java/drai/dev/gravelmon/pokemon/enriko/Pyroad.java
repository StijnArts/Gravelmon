package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pyroad extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pyroad() {
        super("Pyroad",
                Type.FIRE,Type.POISON,
                new Stats(120,
                        105,
                        110,
                        75,
                        95,
                        60),
                List.of(Ability.BLAZE), Ability.INTIMIDATE,
                8, 165,
                new Stats(0,0,3,0,0,0), 45,
                0.5,
                224, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Where Pyroad roams, it is revered as king. The thunderous croaks it lets out strikes fear in the hearts of any Pokemon."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pyroad");

    }


}
