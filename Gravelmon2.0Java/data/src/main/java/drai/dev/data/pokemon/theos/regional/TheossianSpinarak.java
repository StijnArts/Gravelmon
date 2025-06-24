package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianSpinarak extends drai.dev.data.pokemon.Pokemon {
    public TheossianSpinarak(String name, Aspect aspect) {
        super(name, aspect, "Spinarak",
                Type.BUG, Type.DARK,
                new Stats(40,
                        60,
                        40,
                        40,
                        40,
                        30),
                List.of(Ability.UNNERVE,Ability.INSOMNIA), Ability.SUPER_LUCK,
                5, 85,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                50, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Spinarak hide out in fields camouflaged as pumpkins. At night, they raid farmer's crops and eat all they can find."),
                List.of(new EvolutionEntry("theossianariados", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Spinarak");

    }


}
