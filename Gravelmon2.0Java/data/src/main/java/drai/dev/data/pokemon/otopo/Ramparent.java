package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ramparent extends drai.dev.data.pokemon.Pokemon {
    public Ramparent() {
        super("Ramparent",
                Type.NORMAL, Type.STEEL,
                new Stats(70,
                        110,
                        110,
                        50,
                        50,
                        90),
                List.of(Ability.STURDY,Ability.ADAPTABILITY), Ability.NORMALIZE,
                12, 726,
                new Stats(0,2,0,0,0,0), 80,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("A Ramparent is powerful enough to tow heavy automobiles. When threatened, its horn has hardened to a rock-hard condition, and it will charge with full might."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Ramparent");

    }


}
