package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fuchsiadame extends drai.dev.data.pokemon.Pokemon {
    public Fuchsiadame() {
        super("Fuchsiadame",
                Type.GRASS, Type.FAIRY,
                new Stats(100,
                        65,
                        60,
                        105,
                        135,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 180,
                new Stats(0,0,0,0,3,0), 45,
                0.5,
                213, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FLORAL, Biome.IS_CHERRY_GROVE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Fuchsiadame");

    }


}
