package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nymfly extends drai.dev.data.pokemon.Pokemon {
    public Nymfly() {
        super("Nymfly",
                Type.BUG,
                new Stats(35,
                        25,
                        35,
                        50,
                        35,
                        40),
                List.of(Ability.SHIELD_DUST), Ability.BERSERK,
                5, 28,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                44, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.DRAGON),
                List.of("Their thick scales are like metal, to protect their soft fragile bodies. By increasing their internal body temperature, they can shoot small flames like a dragon."),
                List.of(new EvolutionEntry("drasilis", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.TREE_TOP).build(),
                List.of());
           setLangFileName("Nymfly");

    }


}
