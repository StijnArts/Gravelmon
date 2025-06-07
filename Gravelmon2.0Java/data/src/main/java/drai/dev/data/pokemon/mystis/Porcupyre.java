package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Porcupyre extends drai.dev.data.pokemon.Pokemon {
    public Porcupyre() {
        super("Porcupyre",
                Type.FIRE, Type.GRASS,
                new Stats(90,
                        80,
                        120,
                        80,
                        60,
                        50),
                List.of(Ability.FLASH_FIRE,Ability.FLAME_BODY), Ability.IRON_BARBS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The barbs that cover Porcupyre's body can be extremely painful, causing immediate 1st degree burns. It cools down its flame for people it trusts, however."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Porcupyre");

    }


}
