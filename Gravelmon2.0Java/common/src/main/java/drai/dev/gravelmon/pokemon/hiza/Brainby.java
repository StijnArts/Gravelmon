package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Brainby extends drai.dev.gravelmon.pokemon.Pokemon {
    public Brainby() {
        super("Brainby",
                Type.PSYCHIC,Type.ELECTRIC,
                new Stats(50,
                        35,
                        50,
                        75,
                        50,
                        40),
                List.of(Ability.ANALYTIC), Ability.ANALYTIC,
                8, 165,
                new Stats(0,0,0,1,0,0), 45,
                0.0,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Brainby started showing up once a meteor hit the planet. Many people argue about whether their home was destroyed on impact or they came from said meteor."),
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
           setLangFileName("Brainby");

    }


}
