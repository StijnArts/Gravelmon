package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Gareed extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gareed() {
        super("Gareed",
                Type.GRASS,Type.FIRE,
                new Stats(41,
                        41,
                        51,
                        66,
                        51,
                        50),
                List.of(Ability.LEVITATE), Ability.PRANKSTER,
                4, 6,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                75, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.GRASS),
                List.of("Gareed smell heavily of garlic. It is said that in ancient times when people were afraid of vampires, they would keep Gareed around."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gareed");

    }


}
