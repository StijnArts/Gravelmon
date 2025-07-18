package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fountier extends drai.dev.data.pokemon.Pokemon {
    public Fountier() {
        super("Fountier",
                Type.WATER,
                new Stats(54,
                        35,
                        57,
                        96,
                        82,
                        47),
                List.of(Ability.RAIN_DISH), Ability.DRIZZLE,
                11, 320,
                new Stats(0,0,0,2,0,0), 120,
                0.0,
                130, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("Fountier are able to control their waterflow much easier than before; allowing it to focus harder on battling."),
                List.of(new EvolutionEntry("fonsdame", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(22).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Fountier");

    }


}
