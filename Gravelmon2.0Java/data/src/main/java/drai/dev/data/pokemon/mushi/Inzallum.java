package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Inzallum extends drai.dev.data.pokemon.Pokemon {
    public Inzallum() {
        super("Inzallum",
                Type.BUG, Type.PSYCHIC,
                new Stats(74,
                        60,
                        62,
                        110,
                        100,
                        94),
                List.of(Ability.TINTED_LENS,Ability.OBLIVIOUS), Ability.PSYCHIC_SURGE,
                14, 0,
                new Stats(0,0,0,2,1,1), 45,
                0.5,
                245, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(22).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MAGICAL).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Inzallum");

    }


}
