package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dracopuff extends drai.dev.data.pokemon.Pokemon {
    public Dracopuff() {
        super("Dracopuff",
                Type.FAIRY, Type.DRAGON,
                new Stats(100,
                        80,
                        85,
                        85,
                        80,
                        70),
                List.of(Ability.SWEET_VEIL), Ability.LINGERING_AROMA,
                19, 160,
                new Stats(2,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite their size, Dracopuff are extremely light and fluffy. Shop owners around Theos often have one by their side, providing a happy enviroment for their customers."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(36).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky().duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Dracopuff");

    }


}
