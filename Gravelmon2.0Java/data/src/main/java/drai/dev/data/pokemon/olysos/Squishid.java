package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squishid extends drai.dev.data.pokemon.Pokemon {
    public Squishid() {
        super("Squishid",
                Type.WATER,
                new Stats(40,
                        30,
                        40,
                        60,
                        60,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 23,
                new Stats(0,0,0,1,1,0), 200,
                0.5,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Squishid's small size and white coloration help it to blend into the ocean floor, making it difficult to spot by predators. Its unique fins on its head enable it to swim quickly through the water and maneuver with ease. It's red-marked tentacles are often used to attract prey or ward off enemies. Squishid is known for its mischievous behavior and enjoys playing pranks on other Pokemon."),
                List.of(new EvolutionEntry("squidgeist", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(6).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_COLD_OCEAN, Biome.IS_FROZEN_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Squishid");

    }


}
