package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Piedow extends drai.dev.data.pokemon.Pokemon {
    public Piedow() {
        super("Piedow",
                Type.ICE, Type.NORMAL,
                new Stats(60,
                        65,
                        50,
                        45,
                        50,
                        70),
                List.of(Ability.CUTE_CHARM,Ability.SNOW_CLOAK), Ability.SERENE_GRACE,
                6, 145,
                new Stats(0,1,0,0,0,1), 120,
                0.5,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The coat of Piedoe is very soft, dense and usually colored in a light brown tone. It often headbutts trees to strengthen it's head."),
                List.of(new EvolutionEntry("ceryneer", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(6).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TUNDRA, Biome.IS_SNOWY).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Piedow");

    }


}
