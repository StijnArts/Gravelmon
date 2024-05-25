package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Harpiveran extends drai.dev.gravelmon.pokemon.Pokemon {
    public Harpiveran() {
        super("Harpiveran",
                Type.GHOST, Type.DRAGON,
                new Stats(120,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(3,0,0,0,0,0), 3,
                0.5,
                279, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("The emissary of alignment; Harpiveran takes those who challenge balance to either Orderion or Anarchaic. It is not known who its true master is."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Harpiveran");

    }


}
