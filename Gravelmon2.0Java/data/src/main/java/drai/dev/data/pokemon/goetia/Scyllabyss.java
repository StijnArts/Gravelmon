package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scyllabyss extends drai.dev.data.pokemon.Pokemon {
    public Scyllabyss(Stats stats) {
        super("Scyllabyss",
                Type.POISON, Type.DRAGON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It has an insatiable appetite that causes it to destroy and devour anything that comes near it. It becomes so blinded with hunger that its heads even attack eachother, only to regenerate moments later. Together with Charybyss, they are called “The Disasters”"),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 41, 61, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scyllabyss");

    }


}
