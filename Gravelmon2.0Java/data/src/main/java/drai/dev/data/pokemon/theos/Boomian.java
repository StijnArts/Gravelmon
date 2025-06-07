package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Boomian extends drai.dev.data.pokemon.Pokemon {
    public Boomian() {
        super("Boomian",
                Type.FIGHTING,
                new Stats(60,
                        105,
                        70,
                        120,
                        70,
                        75),
                List.of(Ability.SOUNDPROOF,Ability.RIVALRY), Ability.COMPETITIVE,
                22, 800,
                new Stats(0,0,0,2,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Upon evolution, Boomian immediately challenge the Alpha of their tribe. If they win, they leave their tribe and live in solidarity deeming them as too weak to be around."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Boomian");

    }


}
