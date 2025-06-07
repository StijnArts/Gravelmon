package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lavyrm extends drai.dev.data.pokemon.Pokemon {
    public Lavyrm() {
        super("Lavyrm",
                Type.FIRE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FLAME_BODY), Ability.MAGMA_ARMOR,
                5, 150,
                new Stats(0,0,0,0,0,0), 210,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("They have a very slimy layer of mucus around their body, which can get up to over 100°C. In oder to keep the mucus layer, they often swim in volcanoes and magma caverns."),
                List.of(new EvolutionEntry("maganon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(14).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setSpawnPreset(SpawnPreset.NEAR_LAVA).build(),
                List.of());
           setLangFileName("Lavyrm");

    }


}
