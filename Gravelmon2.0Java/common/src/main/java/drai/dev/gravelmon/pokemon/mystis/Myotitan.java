package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Myotitan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Myotitan() {
        super("Myotitan",
                Type.POISON,Type.FIGHTING,
                new Stats(140,
                        125,
                        90,
                        90,
                        80,
                        55),
                List.of(Ability.SHEER_FORCE), Ability.SHEER_FORCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                293, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("A great plague befell this Mon. It now festers within this Mon's thorny roots, violently lashing out at trespassers to the Terrimis Forest."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Myotitan");

    }


}
