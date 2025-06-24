package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nibblit extends drai.dev.data.pokemon.Pokemon {
    public Nibblit() {
        super("Nibblit",
                Type.NORMAL,
                new Stats(60,
                        65,
                        65,
                        30,
                        45,
                        55),
                List.of(Ability.SAP_SIPPER), Ability.STRONG_JAW,
                8, 90,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Nibblit are constantly looking for something to chew, forcing Trainers to carry sticks with them in order to avoid Nibblit destroying their belongings."),
                List.of(new EvolutionEntry("lumbash", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(7).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER).build(),
                List.of());
           setLangFileName("Nibblit");

    }


}
