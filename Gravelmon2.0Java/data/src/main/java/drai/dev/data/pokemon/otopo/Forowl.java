package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Forowl extends drai.dev.data.pokemon.Pokemon {
    public Forowl(Stats stats) {
        super("Forowl",
                Type.GRASS, Type.FLYING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Forowl is an expert at catching prey in the dark. This Pokémon's success is due to its exceptional vision, which helps it to see in low light, and its delicate, supple wings, which fly silently."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                .setMinLevel(26).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                .setContext(SpawnContext.GROUNDED)
                .setBiomes(Biome.IS_BIRCH).canSeeSky()
                .setSpawnPreset(SpawnPreset.TREE_TOP).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Forowl");

    }


}
