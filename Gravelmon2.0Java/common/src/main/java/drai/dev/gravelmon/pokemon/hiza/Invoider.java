package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Invoider extends drai.dev.gravelmon.pokemon.Pokemon {
    public Invoider() {
        super("Invoider",
                Type.PSYCHIC,Type.ELECTRIC,
                new Stats(70,
                        60,
                        70,
                        90,
                        70,
                        60),
                List.of(Ability.ANALYTIC), Ability.ANALYTIC,
                8, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.0,
                137, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Its brain makes up for most its body and is its only internal organ. It is able to send out shock waves to disable electronic devices."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Invoider");

    }


}
