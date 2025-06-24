package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Floodle extends drai.dev.data.pokemon.Pokemon {
    public Floodle() {
        super("Floodle",
                Type.WATER, Type.NORMAL,
                new Stats(56,
                        45,
                        29,
                        45,
                        65,
                        45),
                List.of(Ability.HEALER,Ability.SWIFT_SWIM), Ability.WATER_ABSORB,
                8, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("woofoam", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                    .setSpawnPreset(SpawnPreset.NEAR_WATER).build(),
                List.of());
           setLangFileName("Floodle");

    }


}
