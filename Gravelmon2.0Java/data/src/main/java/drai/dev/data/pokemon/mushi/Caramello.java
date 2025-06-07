package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Caramello extends drai.dev.data.pokemon.Pokemon {
    public Caramello() {
        super("Caramello",
                Type.FAIRY,
                new Stats(71,
                        60,
                        86,
                        60,
                        90,
                        23),
                List.of(Ability.GOOEY,Ability.STICKY_HOLD), Ability.UNAWARE,
                11, 0,
                new Stats(0,0,0,0,1,0), 120,
                0.5,
                138, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(new EvolutionEntry("goopest", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male"))),
                        new EvolutionEntry("shugatrix", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female")))),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(20).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MAGICAL).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Caramello");

    }


}
