package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Salwig extends drai.dev.data.pokemon.Pokemon {
    public Salwig() {
        super("Salwig",
                Type.POISON,Type.WATER,
                new Stats(63,
                        63,
                        62,
                        41,
                        34,
                        42),
                List.of(Ability.HEATPROOF), Ability.MOLD_BREAKER,
                7, 153,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MONSTER),
                List.of("Capable of spraying boiling sulfuric water from its body as fast as a bullet. some believe that small Salwigs can crawl into ears and pinch your brain, but their pincers are in fact just for show and can barely grasp."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Salwig");

    }


}
