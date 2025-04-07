package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Chainect extends drai.dev.data.pokemon.Pokemon {
    public Chainect() {
        super("Chainect",
                Type.ELECTRIC,
                new Stats(40,
                        30,
                        30,
                        70,
                        65,
                        60),
                List.of(Ability.PLUS,Ability.MINUS,Ability.BATTERY), Ability.BATTERY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("These Pokemon are being used to run small facilities and are used in tests regarding space-flight products. They feed on electricity by draining them from many sources. Chainect connect with other Chainect to transfer electricity."),
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
           setLangFileName("Chainect");

    }


}
