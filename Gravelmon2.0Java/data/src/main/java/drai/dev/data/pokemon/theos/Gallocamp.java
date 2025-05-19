package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gallocamp extends drai.dev.data.pokemon.Pokemon {
    public Gallocamp() {
        super("Gallocamp",
                Type.WATER, Type.FAIRY,
                new Stats(55,
                        55,
                        65,
                        95,
                        75,
                        80),
                List.of(Ability.TORRENT), Ability.DAZZLING,
                14, 460,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                143, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Gallocamp are very playful and energetic. They have the ability to run on water, often putting on shows to entertain wild Pokémon."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Gallocamp");

    }


}
