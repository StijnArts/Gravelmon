package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Magoo extends drai.dev.data.pokemon.Pokemon {
    public Magoo() {
        super("Magoo",
                Type.BUG,
                new Stats(40,
                        50,
                        30,
                        30,
                        30,
                        40),
                List.of(Ability.ADAPTABILITY), Ability.CORROSION,
                4, 10,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Magoo's saliva can eat through almost anything, allowing them to get into all sorts of places. They like cramped, dark spots where they can gather energy in order to evolve while avoiding predators."),
                List.of(new EvolutionEntry("bugritty", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Magoo");

    }


}
