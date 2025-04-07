package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranOshawott extends drai.dev.data.pokemon.Pokemon {
    public NodorranOshawott(String name, Aspect aspect) {
        super(name, aspect, "Oshawott",
                Type.WATER, Type.GHOST,
                new Stats(58,
                        50,
                        43,
                        66,
                        51,
                        40),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("nodorrandewott", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_COLD_OCEAN).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setCanFly(true);
           setLangFileName("Oshawott");

    }


}
