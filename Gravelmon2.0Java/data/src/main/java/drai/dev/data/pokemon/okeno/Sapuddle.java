package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sapuddle extends drai.dev.data.pokemon.Pokemon {
    public Sapuddle() {
        super("Sapuddle",
                Type.GROUND, Type.POISON,
                new Stats(90,
                        80,
                        40,
                        62,
                        90,
                        30),
                List.of(Ability.POISON_TOUCH,Ability.ANGER_POINT,Ability.HYDRATION), Ability.HYDRATION,
                8, 165,
                new Stats(0,0,0,0,0,0), 150,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("They need humidity to survive. When the weather becomes too hot, they hibernate in burrows. It defeats Pokemon by grabbing them with its tongue and forcing them against its poisonous body."),
                List.of(new EvolutionEntry("bulwart", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 18, 44, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER, SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Sapuddle");

    }


}
