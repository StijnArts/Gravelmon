package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Aquagator extends drai.dev.data.pokemon.Pokemon {
    public Aquagator() {
        super("Aquagator",
                Type.WATER,
                new Stats(70,
                        96,
                        74,
                        64,
                        71,
                        50),
                List.of(Ability.TORRENT), Ability.SWIFT_SWIM,
                12, 0,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.DRAGON),
                List.of(""),
                List.of(new EvolutionEntry("Ryuvern", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Aquagator");

    }


}
