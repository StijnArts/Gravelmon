package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Penumbillar extends drai.dev.data.pokemon.Pokemon {
    public Penumbillar() {
        super("Penumbillar",
                Type.BUG,
                new Stats(50,
                        40,
                        43,
                        60,
                        57,
                        50),
                List.of(Ability.SHIELD_DUST,Ability.INNER_FOCUS), Ability.SWARM,
                3, 104,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
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
           setLangFileName("Penumbillar");

    }


}
