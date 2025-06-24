package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Toxipine extends drai.dev.data.pokemon.Pokemon {
    public Toxipine() {
        super("Toxipine",
                Type.POISON,
                new Stats(60,
                        40,
                        50,
                        30,
                        45,
                        50),
                List.of(Ability.POISON_POINT,Ability.RUN_AWAY), Ability.TOXIC_BOOST,
                5, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                55, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It glides around the woodland floor, gathering up berries as it goes. Despite its little size, its toxin is quite lethal."),
                List.of(new EvolutionEntry("venetreme", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(               ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Toxipine");

    }


}
