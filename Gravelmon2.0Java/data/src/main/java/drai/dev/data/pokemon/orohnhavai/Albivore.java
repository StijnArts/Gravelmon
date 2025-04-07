package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Albivore extends drai.dev.data.pokemon.Pokemon {
    public Albivore() {
        super("Albivore",
                Type.NORMAL, Type.FLYING,
                new Stats(64,
                        90,
                        62,
                        35,
                        50,
                        64),
                List.of(Ability.KEEN_EYE,Ability.INTIMIDATE,Ability.RIVALRY), Ability.RIVALRY,
                8, 165,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                122, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Albivore are known to be great hunters, due to their keen eyesight. They often perch high on treetops and cliffs, waiting to spot their next prey."),
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
           setLangFileName("Albivore");

    }


}
