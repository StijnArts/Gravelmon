package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Phrynotoad extends drai.dev.data.pokemon.Pokemon {
    public Phrynotoad(Stats stats) {
        super("Phrynotoad",
                Type.FIRE, Type.ROCK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When threatened, Phrynotoad fires off a terrible red liquid, coming from its eyes. Nothing like it has ever been witnessed in the world of Pokémon before."),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 59, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SUMMER, Biome.IS_VOLCANIC, Biome.IS_NETHER))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Phrynotoad");

    }


}
