package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Charpy extends drai.dev.data.pokemon.Pokemon {
    public Charpy() {
        super("Charpy",
                Type.FIRE, Type.FLYING,
                new Stats(50,
                        70,
                        45,
                        30,
                        45,
                        80),
                List.of(Ability.BLAZE), Ability.MOUNTAINEER,
                9, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FLYING),
                List.of("Whenever this Pokémon and Lavat meet, they have duels to show off their prowess. This applies to their evolved forms, too."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Charpy");

    }


}
