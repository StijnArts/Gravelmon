package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chickaring extends drai.dev.data.pokemon.Pokemon {
    public Chickaring() {
        super("Chickaring",
                Type.FLYING, Type.WATER,
                new Stats(50,
                        55,
                        40,
                        50,
                        45,
                        60),
                List.of(Ability.GALE_WINGS,Ability.TANGLED_FEET), Ability.WATER_ABSORB,
                3, 77,
                new Stats(0,1,0,0,0,0), 200,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Chickaring live along the coast in huge nests in palm trees around the Orbis region where they bask in the sun. They do not catch their own food but rather rely on Seadeek gathering fish for them. Their necks puff up similar to a rubber ring to help them stay afloat in the ocean."),
                List.of(new EvolutionEntry("seadeek", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(                      ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BEACH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        setCanWalkOnWater(true);
           setLangFileName("Chickaring");

    }


}
