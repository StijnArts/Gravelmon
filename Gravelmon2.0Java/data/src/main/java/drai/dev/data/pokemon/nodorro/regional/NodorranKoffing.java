package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranKoffing extends drai.dev.data.pokemon.Pokemon {
    public NodorranKoffing(String name, Aspect aspect) {
        super(name, aspect, "Koffing",
                Type.ROCK,Type.FIRE,
                new Stats(40,
                        64,
                        101,
                        45,
                        60,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,1,1,0,0,0), 190,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("nodorranweezing", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky().belowY(0)
                        .setSpawnPreset(SpawnPreset.NEAR_LAVA).build(),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Koffing");

    }


}
