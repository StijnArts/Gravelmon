package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Muffairy extends drai.dev.data.pokemon.Pokemon {
    public Muffairy() {
        super("Muffairy",
                Type.GROUND, Type.FAIRY,
                new Stats(60,
                        10,
                        10,
                        50,
                        20,
                        50),
                List.of(Ability.SUGARCOAT,Ability.SWEET_VEIL), Ability.TOPPINGS,
                3, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.25,
                40, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It's very small and pretty weak, but due to them sticking in groups, they aren't often attacked."),
                List.of(new EvolutionEntry("pastrella", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"day")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(9).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MAGICAL).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Muffairy");

    }


}
