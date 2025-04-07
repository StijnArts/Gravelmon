package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Prickity extends drai.dev.data.pokemon.Pokemon {
    public Prickity() {
        super("Prickity",
                Type.GRASS,
                new Stats(51,
                        81,
                        31,
                        41,
                        41,
                        51),
                List.of(Ability.ROUGH_SKIN,Ability.WATER_ABSORB), Ability.INNER_FOCUS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Name Help: kaijumon Name Meaning: Prick/prickly + kit, baby rabbit "),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Prickity");

    }


}
