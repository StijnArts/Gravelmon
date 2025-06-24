package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Parrate extends drai.dev.data.pokemon.Pokemon {
    public Parrate() {
        super("Parrate",
                Type.FLYING, Type.WATER,
                new Stats(80,
                        100,
                        60,
                        100,
                        60,
                        95),
                List.of(Ability.PICKPOCKET), Ability.WIND_RIDER,
                15, 600,
                new Stats(0,2,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A single Parrate often leads a crew of a dozen Gulling. They patrol beaches and boardwalks snatching anything shiny they can find."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_COAST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Parrate");

    }


}
