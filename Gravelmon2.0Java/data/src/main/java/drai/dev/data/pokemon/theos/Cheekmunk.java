package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cheekmunk extends drai.dev.data.pokemon.Pokemon {
    public Cheekmunk() {
        super("Cheekmunk",
                Type.NORMAL,
                new Stats(50,
                        60,
                        50,
                        30,
                        45,
                        65),
                List.of(Ability.CHEEK_POUCH), Ability.GLUTTONY,
                4, 50,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("chippunch", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(7).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Cheekmunk");

    }


}
