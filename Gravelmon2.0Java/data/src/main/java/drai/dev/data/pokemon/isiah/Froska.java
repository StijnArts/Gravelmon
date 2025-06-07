package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Froska extends drai.dev.data.pokemon.Pokemon {
    public Froska() {
        super("Froska",
                Type.ICE, Type.PSYCHIC,
                new Stats(53,
                        42,
                        67,
                        75,
                        90,
                        63),
                List.of(Ability.FOREWARN,Ability.SNOW_WARNING,Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(0,0,0,0,1,0), 135,
                0.0,
                78, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.HUMAN_LIKE),
                List.of("Froska enjoy spending their time making small snowmen whenever they can, making each one have at least one thing unique to them. Whenever they make similar ones, they topple over the older ones instead."),
                List.of(),
                List.of(),
                List.of(Label.ISIAH),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Froska");

    }


}
