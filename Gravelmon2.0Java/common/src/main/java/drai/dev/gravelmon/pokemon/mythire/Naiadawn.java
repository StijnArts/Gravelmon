package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Naiadawn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Naiadawn() {
        super("Naiadawn",
                Type.BUG,
                new Stats(40,
                        40,
                        40,
                        40,
                        40,
                        50),
                List.of(Ability.WATER_VEIL,Ability.CLOUD_NINE,Ability.RATTLED), Ability.RATTLED,
                8, 165,
                new Stats(0,0,0,0,0,1), 230,
                0.5,
                50, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("A Bug Pokemon that lives in water, and spends most of its life in this form. It sometimes leaps out of the water in an attempt to fly, but can't."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Naiadawn");

    }


}
