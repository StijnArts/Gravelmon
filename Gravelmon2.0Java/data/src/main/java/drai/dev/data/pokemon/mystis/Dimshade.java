package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dimshade extends drai.dev.data.pokemon.Pokemon {
    public Dimshade() {
        super("Dimwraith",
                Type.DARK, Type.GHOST,
                new Stats(60,
                        80,
                        60,
                        40,
                        10,
                        90),
                List.of(Ability.INTIMIDATE,Ability.UNNERVE), Ability.STAKEOUT,
                5, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dimwraith like to play pranks to scare people. According to researchers, there are theoretically unlimited ways to evolve Dimwraith, although only a few have been discovered."),
                List.of(new EvolutionEntry("vertighoul", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"minecraft:ender_eye")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DEEP_DARK).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Dimwraith");

    }


}
