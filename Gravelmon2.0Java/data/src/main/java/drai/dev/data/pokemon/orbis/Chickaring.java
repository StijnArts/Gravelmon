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
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROOST,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,3)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Chickaring");

    }


}
