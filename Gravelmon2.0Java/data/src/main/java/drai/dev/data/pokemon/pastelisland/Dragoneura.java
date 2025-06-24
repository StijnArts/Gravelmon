package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dragoneura extends drai.dev.data.pokemon.Pokemon {
    public Dragoneura() {
        super("Dragoneura",
                Type.BUG, Type.DRAGON,
                new Stats(80,
                        78,
                        80,
                        90,
                        80,
                        86),
                List.of(Ability.SHIELD_DUST), Ability.BERSERK,
                26, 210,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                222, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.DRAGON),
                List.of("Dragoneura have a tough shell and powerful jaws, making them ferocious predators, on top of powerful wings means these Pokémon are a force to reckoned with."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(30).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Dragoneura");

    }


}
