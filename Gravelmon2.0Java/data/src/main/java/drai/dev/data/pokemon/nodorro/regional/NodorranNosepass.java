package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranNosepass extends drai.dev.data.pokemon.Pokemon {
    public NodorranNosepass(String name, Aspect aspect) {
        super(name, aspect, "Nosepass",
                Type.ROCK, Type.GRASS,
                new Stats(60,
                        50,
                        80,
                        55,
                        105,
                        25),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 1050,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("nodorranprobopass", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"39")))),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setCanWalk(false);
        setLangFileName("Nosepass");

    }


}
