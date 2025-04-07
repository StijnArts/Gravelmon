package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Glimpid extends drai.dev.data.pokemon.Pokemon {
    public Glimpid() {
        super("Glimpid",
                Type.BUG, Type.ICE,
                new Stats(30,
                        35,
                        25,
                        55,
                        50,
                        30),
                List.of(Ability.WATER_ABSORB), Ability.WEAK_ARMOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their jelly-like substance on their bodies resemble dew drops and sparkle beautifully in the sunlight. It helps them withstand harsh heat."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Glimpid");

    }


}
