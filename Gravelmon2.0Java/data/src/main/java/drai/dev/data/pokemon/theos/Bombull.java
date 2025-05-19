package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bombull extends drai.dev.data.pokemon.Pokemon {
    public Bombull() {
        super("Bombull",
                Type.FIRE, Type.STEEL,
                new Stats(80,
                        70,
                        95,
                        55,
                        75,
                        45),
                List.of(Ability.BLAZE), Ability.HEAVY_METAL,
                14, 520,
                new Stats(0,0,2,0,0,0), 45,
                0.75,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
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
           setLangFileName("Bombull");

    }


}
