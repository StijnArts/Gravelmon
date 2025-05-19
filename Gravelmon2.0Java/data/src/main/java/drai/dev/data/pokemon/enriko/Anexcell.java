package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Anexcell extends drai.dev.data.pokemon.Pokemon {
    public Anexcell() {
        super("Anexcell",
                Type.STEEL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.ADAPTABILITY,Ability.TRANSISTOR,Ability.IMPOSTER), Ability.IMPOSTER,
                8, 165,
                new Stats(0,0,0,0,0,0), 250,
                0.75,
                70, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.DITTO),
                List.of("(steel/grease) Its malleable body is full of microscopic mechanical parts. Its tenacity is rivaled only by its hunger."),
                List.of(),
                List.of(),
                List.of(Label.ENRIKO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Anexcell");

    }


}
