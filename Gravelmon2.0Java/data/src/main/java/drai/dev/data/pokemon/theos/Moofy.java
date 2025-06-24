package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Moofy extends drai.dev.data.pokemon.Pokemon {
    public Moofy() {
        super("Moofy",
                Type.NORMAL,
                new Stats(55,
                        65,
                        65,
                        30,
                        50,
                        65),
                List.of(Ability.VITAL_SPIRIT), Ability.SIMPLE,
                11, 340,
                new Stats(0,0,0,0,0,1), 150,
                0.5,
                58, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Moofy are very curious and will gather in groups roadside to stare at the people going by. They often use their heads to break down their pens if they run out of grass to graze upon."),
                List.of(new EvolutionEntry("theossiantauros", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male"))),
                        new EvolutionEntry("theossianmiltank", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Moofy");

    }


}
