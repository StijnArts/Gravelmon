package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Falpire extends drai.dev.data.pokemon.Pokemon {
    public Falpire() {
        super("Falpire",
                Type.GRASS, Type.FLYING,
                new Stats(70,
                        90,
                        88,
                        87,
                        80,
                        80),
                List.of(Ability.INNER_FOCUS,Ability.SAP_SIPPER), Ability.INSOMNIA,
                12, 158,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                155, ExperienceGroup.MEDIUM_FAST,
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
           setLangFileName("Falpire");

    }


}
