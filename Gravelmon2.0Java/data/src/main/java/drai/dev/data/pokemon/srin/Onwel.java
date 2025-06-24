package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Onwel extends drai.dev.data.pokemon.Pokemon {
    public Onwel(Stats stats) {
        super("Onwel",
                Type.WATER,Type.FIGHTING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.SHIP_WRECK).build(),
                List.of());

        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Onīwel");

    }


}
