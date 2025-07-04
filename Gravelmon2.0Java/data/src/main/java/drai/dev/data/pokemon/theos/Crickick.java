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
                new Stats(0,2,0,0,0,0), 150,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ability: Lead Foot - Boosts the power of 'kicking' moves"),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(18).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Crickick");

    }


}
