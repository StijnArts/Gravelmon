package drai.dev.data.pokemon.ottora;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Inflagulo extends drai.dev.data.pokemon.Pokemon {
    public Inflagulo() {
        super("Inflagulo",
                Type.FIRE,
                new Stats(40,
                        60,
                        60,
                        55,
                        40,
                        60),
                List.of(Ability.BLAZE), Ability.TOUGH_CLAWS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Inflagulo are often hot headed and brash. It's seen rarely in autumnal forests, charring berries before tucking in."),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Inflagulo");

    }


}
