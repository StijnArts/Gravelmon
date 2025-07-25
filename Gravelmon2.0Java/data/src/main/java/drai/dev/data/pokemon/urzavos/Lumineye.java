package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lumineye extends drai.dev.data.pokemon.Pokemon {
    public Lumineye() {
        super("Lumineye",
                Type.ROCK,Type.ELECTRIC,
                new Stats(70,
                        70,
                        115,
                        130,
                        90,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                24, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When enough Luminlite and Luminlux gather, they form Lumineye - A giant colony that thinks as one entity. Their harsh beam of light stuns any unfortunate enough to be caught in it. It can see through walls and solid stone for miles."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(45).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CAVE).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERGROUND).build(),
                List.of());
           setLangFileName("Lumineye");

    }


}
