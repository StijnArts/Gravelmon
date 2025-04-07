package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kestric extends drai.dev.data.pokemon.Pokemon {
    public Kestric() {
        super("Kestric",
                Type.FLYING, Type.ELECTRIC,
                new Stats(60,
                        75,
                        55,
                        55,
                        50,
                        85),
                List.of(Ability.LIMBER), Ability.HUSTLE,
                7, 160,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Kestric are incredibly swift, causing small electrical currents to form behind them as they fly."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Kestric");

    }


}
