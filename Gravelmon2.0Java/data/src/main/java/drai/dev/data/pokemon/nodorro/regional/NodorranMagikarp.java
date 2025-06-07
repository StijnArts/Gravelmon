package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranMagikarp extends drai.dev.data.pokemon.Pokemon {
    public NodorranMagikarp(String name, Aspect aspect) {
        super(name, aspect, "Magikarp",
                Type.POISON, Type.WATER,
                new Stats(30,
                        30,
                        40,
                        20,
                        20,
                        60),
                List.of(Ability.POISON_POINT,Ability.SWIFT_SWIM), Ability.ANGER_POINT,
                12, 45,
                new Stats(0,0,1,0,0,0), 150,
                0.5,
                40, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of(""),
                List.of(new EvolutionEntry("nodorrangyarados", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(1).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_WARM_OCEAN)
                        .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.REEF).build(),
                List.of());
           setLangFileName("Magikarp");
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);

    }


}
