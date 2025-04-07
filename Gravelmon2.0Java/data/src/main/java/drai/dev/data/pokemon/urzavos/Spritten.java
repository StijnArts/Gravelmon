package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Spritten extends drai.dev.data.pokemon.Pokemon {
    public Spritten() {
        super("Spritten",
                Type.GRASS,
                new Stats(67,
                        69,
                        52,
                        42,
                        30,
                        55),
                List.of(Ability.OVERGROW), Ability.TOUGH_CLAWS,
                4, 100,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("Spritten are playful and energetic 'Mons, and can be a handful for new trainers. They used to be hunted extensively, being prized as rare pets."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Spritten");

    }


}
