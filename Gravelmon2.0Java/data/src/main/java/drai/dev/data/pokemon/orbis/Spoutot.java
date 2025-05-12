package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Spoutot extends drai.dev.data.pokemon.Pokemon {
    public Spoutot() {
        super("Spoutot",
                Type.WATER,
                new Stats(44,
                        38,
                        49,
                        79,
                        61,
                        32),
                List.of(Ability.RAIN_DISH), Ability.TANGLED_FEET,
                4, 150,
                new Stats(0,0,0,1,0,0), 225,
                0.0,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("Unable to control its waterflow, it consistently tries to keep balance and not allow its water to spill out. It waits until rain to refill its dish."),
                List.of(new EvolutionEntry("fountier", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(11).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Spoutot");

    }


}
