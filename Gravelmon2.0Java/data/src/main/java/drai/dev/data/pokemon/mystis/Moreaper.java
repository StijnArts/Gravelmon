package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Moreaper extends drai.dev.data.pokemon.Pokemon {
    public Moreaper() {
        super("Moreaper",
                Type.GHOST, Type.GRASS,
                new Stats(70,
                        60,
                        50,
                        110,
                        60,
                        70),
                List.of(Ability.EFFECT_SPORE,Ability.INTIMIDATE), Ability.INFILTRATOR,
                8, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It will often play pranks on unsuspecting passerby by mimicking the voices of loved ones, giggling creepily when it succeeds. / It is said that the patterns on its cap are victims of its curse. Beware the forest's mushrooms, for you may never return."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPORE,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(24).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MUSHROOM, Biome.IS_SPOOKY)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Moreaper");

    }


}
