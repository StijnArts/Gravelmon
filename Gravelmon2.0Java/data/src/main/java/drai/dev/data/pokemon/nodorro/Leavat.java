package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Leavat extends drai.dev.data.pokemon.Pokemon {
    public Leavat() {
        super("Leavat",
                Type.GRASS, Type.FLYING,
                new Stats(35,
                        45,
                        50,
                        30,
                        40,
                        40),
                List.of(Ability.INNER_FOCUS,Ability.SAP_SIPPER), Ability.INSOMNIA,
                5, 41,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Leavat");

    }


}
