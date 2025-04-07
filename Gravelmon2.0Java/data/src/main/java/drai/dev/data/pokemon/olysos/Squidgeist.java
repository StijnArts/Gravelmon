package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squidgeist extends drai.dev.data.pokemon.Pokemon {
    public Squidgeist() {
        super("Squidgeist",
                Type.WATER, Type.GHOST,
                new Stats(60,
                        40,
                        60,
                        90,
                        90,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 349,
                new Stats(0,0,0,2,1,0), 60,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Squidgeist is the evolved form of Squishid. Its small size and white coloration help it blend into the ocean floor, but it has become more aggressive and territorial than its previous form. Its fins have grown longer and sharper, giving it greater speed and maneuverability. Squidgeist's red-marked tentacles are now more pronounced and intimidating, serving as a warning to potential predators. Its ghostly aura and spectral powers make it a fearsome and mysterious creature of the deep."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Squidgeist");

    }


}
