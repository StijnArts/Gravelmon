package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crickick extends drai.dev.data.pokemon.Pokemon {
    public Crickick() {
        super("Crickick",
                Type.BUG, Type.FIGHTING,
                new Stats(60,
                        120,
                        80,
                        50,
                        60,
                        85),
                List.of(Ability.JUSTIFIED), Ability.JUSTIFIED,
                6, 108,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ability: Lead Foot - Boosts the power of 'kicking' moves"),
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
           setLangFileName("Crickick");

    }


}
