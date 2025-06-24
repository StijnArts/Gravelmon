package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Quackle extends drai.dev.data.pokemon.Pokemon {
    public Quackle() {
        super("Quackle",
                Type.FLYING,
                new Stats(40,
                        30,
                        30,
                        60,
                        40,
                        70),
                List.of(Ability.RAIN_DISH,Ability.OWN_TEMPO), Ability.OVERCOAT,
                9, 100,
                new Stats(0,0,0,0,0,1), 250,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Quackle are care-free Pokemon that spend their time lazily floating in ponds and lakes."),
                List.of(new EvolutionEntry("paraduck", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SURFACE)
                        .setBiomes(Biome.IS_FRESHWATER).canSeeSky()
                        .setSpawnPreset(SpawnPreset.WATER_SURFACE).build(),
                List.of());
        setCanWalkOnWater(true);
           setLangFileName("Quackle");

    }


}
