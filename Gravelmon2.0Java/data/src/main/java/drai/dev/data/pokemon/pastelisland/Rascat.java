package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rascat extends drai.dev.data.pokemon.Pokemon {
    public Rascat() {
        super("Rascat",
                Type.DARK,
                new Stats(43,
                        35,
                        30,
                        45,
                        35,
                        95),
                List.of(Ability.LIMBER,Ability.PICKUP), Ability.SUPER_LUCK,
                16, 98,
                new Stats(0,0,0,0,0,0), 0,
                0.4,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("These sly Pokémon sneak around, believing themselves to be invisible, when they are actually very much visible and adorable. Some people believe them to be omens of bad luck, but this is just superstition."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Rascat");

    }


}
