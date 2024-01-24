package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Dualance extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dualance() {
        super("Dualance",
                Type.STEEL,
                new Stats(65,
                        115,
                        100,
                        40,
                        65,
                        75),
                List.of(Ability.MOXIE,Ability.NO_GUARD,Ability.DEFIANT), Ability.DEFIANT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("This Pokémon's bladed tails are used to spar with rivals. Great care is taken to avoid dealing serious injury, however."),
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
           setLangFileName("Dualance");

    }


}
