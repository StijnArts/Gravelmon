package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianYanma extends drai.dev.data.pokemon.Pokemon {
    public TheossianYanma(String name, Aspect aspect) {
        super(name, aspect, "Yanma",
                Type.BUG, Type.DRAGON,
                new Stats(65,
                        75,
                        45,
                        65,
                        45,
                        95),
                List.of(Ability.PRESSURE,Ability.TINTED_LENS), Ability.ADAPTABILITY,
                12, 380,
                new Stats(0,0,0,0,0,1), 75,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Yanma are quiet rare to find in the wild. It's said only experienced trainers can handle them."),
                List.of(new EvolutionEntry("theossianyanmega", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanWalkOnWater(true);
        setCanFly(true);
           setLangFileName("Yanma");

    }


}
