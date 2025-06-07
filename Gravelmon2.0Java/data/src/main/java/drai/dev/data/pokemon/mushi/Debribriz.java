package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Debribriz extends drai.dev.data.pokemon.Pokemon {
    public Debribriz() {
        super("Debribriz",
                Type.GROUND,
                new Stats(58,
                        70,
                        97,
                        24,
                        45,
                        34),
                List.of(Ability.HEATPROOF,Ability.MOLD_BREAKER), Ability.EARTH_EATER,
                6, 0,
                new Stats(0,0,1,0,0,0), 120,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("terremotor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"48")))),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CAVE).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Debribriz");

    }


}
