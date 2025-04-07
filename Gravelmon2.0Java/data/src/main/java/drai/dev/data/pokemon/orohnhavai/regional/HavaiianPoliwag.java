package drai.dev.data.pokemon.orohnhavai.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class HavaiianPoliwag extends drai.dev.data.pokemon.Pokemon {
    public HavaiianPoliwag() {
        super("HavaiianPoliwag",
                Type.GHOST, Type.WATER,
                new Stats(40,
                        50,
                        40,
                        40,
                        40,
                        90),
                List.of(Ability.SWIFT_SWIM,Ability.CLEAR_BODY,Ability.INFILTRATOR), Ability.INFILTRATOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Active during nights, these mysterious lake inhabitants swim to the surface to seek for food. Many late night swimmers have reported of these Poliwag nibbling at them."),
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
           setLangFileName("Poliwag");

    }


}
