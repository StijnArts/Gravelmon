package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shugatrix extends drai.dev.data.pokemon.Pokemon {
    public Shugatrix() {
        super("Shugatrix",
                Type.FAIRY, Type.ELECTRIC,
                new Stats(58,
                        102,
                        54,
                        102,
                        61,
                        113),
                List.of(Ability.SWEET_VEIL,Ability.UNBURDEN), Ability.UNAWARE,
                17, 0,
                new Stats(0,0,0,0,0,2), 45,
                1.0,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(38).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MAGICAL).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Shugatrix");

    }


}
