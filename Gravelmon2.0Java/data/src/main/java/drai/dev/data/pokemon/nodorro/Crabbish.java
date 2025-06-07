package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crabbish extends drai.dev.data.pokemon.Pokemon {
    public Crabbish() {
        super("Crabbish",
                Type.POISON, Type.BUG,
                new Stats(50,
                        85,
                        110,
                        60,
                        75,
                        75),
                List.of(Ability.SWARM,Ability.POISON_TOUCH), Ability.LIQUID_OOZE,
                10, 280,
                new Stats(0,1,2,0,0,0), 60,
                0.5,
                183, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(28).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DEEP_DARK).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Crabbish");

    }


}
