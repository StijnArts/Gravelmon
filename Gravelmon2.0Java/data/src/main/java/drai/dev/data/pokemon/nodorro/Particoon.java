package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Particoon extends drai.dev.data.pokemon.Pokemon {
    public Particoon() {
        super("Particoon",
                Type.BUG,
                new Stats(75,
                        50,
                        95,
                        70,
                        95,
                        20),
                List.of(Ability.SHED_SKIN), Ability.SHED_SKIN,
                4, 400,
                new Stats(0,0,1,0,1,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It has always been believed that this Pokemon has strong connections to the moon. As such, ancient cultures would keep and praise these Pokemon in hopes of appeasing the god of night."),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Particoon");

    }


}
