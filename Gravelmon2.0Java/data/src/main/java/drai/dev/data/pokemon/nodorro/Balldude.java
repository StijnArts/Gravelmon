package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Balldude extends drai.dev.data.pokemon.Pokemon {
    public Balldude() {
        super("Balldude",
                Type.POISON, Type.ELECTRIC,
                new Stats(50,
                        55,
                        70,
                        75,
                        60,
                        30),
                List.of(Ability.POISON_TOUCH), Ability.CORROSION,
                0, 0,
                new Stats(0,0,0,1,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
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
           setLangFileName("Ball dude");

    }


}
