package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nocthorne extends drai.dev.data.pokemon.Pokemon {
    public Nocthorne() {
        super("Nocthorne",
                Type.GRASS, Type.DARK,
                new Stats(95,
                        115,
                        74,
                        85,
                        62,
                        97),
                List.of(Ability.NOCTURNAL,Ability.GRASS_PELT), Ability.MOXIE,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                238, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Nocthorne are secretive Pokemon that can only be discovered in the furthest reaches of the wilderness. Nocthorne, the leaders of Beoleaf packs, are expelled after assaulting one of their own. The spiky thorns function as a deterrent to pursuing Pokémon."),
                List.of(),
                List.of(                     ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(34).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Nocthorne");

    }


}
