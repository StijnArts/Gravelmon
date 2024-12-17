package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hoole extends drai.dev.data.pokemon.Pokemon {
    public Hoole() {
        super("Hoole",
                Type.GRASS,
                new Stats(84,
                        40,
                        63,
                        72,
                        68,
                        23),
                List.of(Ability.OVERGROW), Ability.NATURAL_CURE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                123, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Hoole dig large communal burrows, but still prefer coming to the surface to eat. A common nuisance in gardens, they like to graze on fruits and vegetables."),
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
           setLangFileName("Hoole");

    }


}
