package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class LagoonanSableye extends drai.dev.gravelmon.pokemon.Pokemon {
    public LagoonanSableye() {
        super("Sableye",
                Type.DARK,Type.STEEL,
                new Stats(50,
                        75,
                        95,
                        65,
                        55,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 600,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                133, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Its claws have turned into solid gold after touching cursed treasure. Even at the risk of turning itself into a statue, this greedy Pokémon will not stop eating gold."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sableye");

    }


}
