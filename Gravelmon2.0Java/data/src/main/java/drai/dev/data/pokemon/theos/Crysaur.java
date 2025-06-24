package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crysaur extends drai.dev.data.pokemon.Pokemon {
    public Crysaur() {
        super("Crysaur",
                Type.ROCK, Type.DRAGON,
                new Stats(65,
                        100,
                        80,
                        40,
                        80,
                        50),
                List.of(Ability.STURDY,Ability.ROUGH_SKIN), Ability.SHEER_FORCE,
                18, 860,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Crysaur love to consume precious stones. Tales tell of Crysaur often eating the entire treasure vaults of Kings back in ancient times."),
                List.of(new EvolutionEntry("dinomond", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"41")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(24).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CAVE).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERGROUND).build(),
                List.of());
           setLangFileName("Crysaur");

    }


}
