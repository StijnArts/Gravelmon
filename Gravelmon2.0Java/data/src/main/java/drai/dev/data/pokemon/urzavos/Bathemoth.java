package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bathemoth extends drai.dev.data.pokemon.Pokemon {
    public Bathemoth() {
        super("Bathemoth",
                Type.FLYING, Type.GROUND,
                new Stats(80,
                        130,
                        70,
                        100,
                        70,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                31, 0,
                new Stats(0,0,0,0,0,0), 40,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(30).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DRIPSTONE).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERGROUND).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Bathemoth");

    }


}
