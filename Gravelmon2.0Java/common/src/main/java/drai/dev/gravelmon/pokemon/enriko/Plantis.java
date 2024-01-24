package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Plantis extends drai.dev.gravelmon.pokemon.Pokemon {
    public Plantis() {
        super("Plantis",
                Type.GRASS,Type.BUG,
                new Stats(45,
                        65,
                        60,
                        80,
                        40,
                        60),
                List.of(Ability.OVERGROW,Ability.COMPOUND_EYES,Ability.DEFIANT), Ability.DEFIANT,
                8, 165,
                new Stats(0,0,0,1,0,0), 80,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.BUG),
                List.of("Their parents lay their eggs in the canopy of jungles, where they blend in. They make a high-pitched chirping noise so their parents can find them afterwards."),
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
           setLangFileName("Plantis");

    }


}
