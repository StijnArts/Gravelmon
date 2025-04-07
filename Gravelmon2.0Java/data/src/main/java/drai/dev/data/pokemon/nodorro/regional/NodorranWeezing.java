package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranWeezing extends drai.dev.data.pokemon.Pokemon {
    public NodorranWeezing(String name, Aspect aspect) {
        super(name, aspect, "Weezing",
                Type.ROCK,Type.FIRE,
                new Stats(60,
                        99,
                        120,
                        82,
                        99,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 1000,
                new Stats(0,1,2,0,0,0), 60,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(),
                List.of("- Lava PlumeSTAB Fire - EmberSTAB Fire - Rock TombSTAB Rock - Rock SlideSTAB Rock"),
                List.of(new EvolutionEntry("choaking", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky().belowY(0)
                        .setSpawnPreset(SpawnPreset.NEAR_LAVA).build(),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Weezing");

    }


}
