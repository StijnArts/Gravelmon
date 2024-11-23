package drai.dev.data.pokemon.enjin.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EnjinnianHypno extends drai.dev.data.pokemon.Pokemon {
    public EnjinnianHypno(String name, Aspect aspect) {
        super(name, aspect, "Hypno",
                Type.PSYCHIC, Type.DARK,
                new Stats(83,
                        77,
                        70,
                        115,
                        73,
                        65),
                List.of(Ability.INSOMNIA,Ability.FOREWARN), Ability.INNER_FOCUS,
                18, 756,
                new Stats(0,0,0,0,2,0), 75,
                0.5,
                169, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Despite this Pokémon's looks, it's very kind and has been found cutting and 'knitting' its hair into a variety of things to give as gifts to people and Pokémon. Hypno with shorter hair are generally thought to be kinder."),
                List.of(),
                List.of(),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 26, 51, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hypno");

    }


}
