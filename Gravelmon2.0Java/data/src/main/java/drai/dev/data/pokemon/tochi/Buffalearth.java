package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Buffalearth extends drai.dev.data.pokemon.Pokemon {
    public Buffalearth(Stats stats) {
        super("Buffalearth",
                Type.GROUND,Type.ICE,
                stats,
                List.of(Ability.SAP_SIPPER), Ability.STAMINA,
                25, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("These gigantic pokemon are extremely territorial of the mountain environments they inhabit, and attempt to scare off any humans who attempt to enter their land."),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_HIGHLANDS).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Buffalearth");

    }


}
