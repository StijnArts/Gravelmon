package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cereblast extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cereblast() {
        super("Cereblast",
                Type.PSYCHIC,Type.ELECTRIC,
                new Stats(95,
                        85,
                        115,
                        135,
                        100,
                        70),
                List.of(Ability.ANALYTIC), Ability.ANALYTIC,
                8, 165,
                new Stats(0,0,0,3,0,0), 35,
                0.0,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Most records about this Pokémon were burned down in a fire. However it is known that Cereblast can control multiples of its own species as a hivemind."),
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
           setLangFileName("Cereblast");

    }


}
