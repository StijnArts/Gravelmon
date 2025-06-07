package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pomdan extends drai.dev.data.pokemon.Pokemon {
    public Pomdan() {
        super("Pompuff",
                Type.FIGHTING, Type.FAIRY,
                new Stats(50,
                        65,
                        30,
                        40,
                        50,
                        60),
                List.of(Ability.COSTAR), Ability.DANCER,
                4, 100,
                new Stats(0,1,0,0,0,0), 190,
                0.25,
                68, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(new EvolutionEntry("pufflepom", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Pompuff");

    }


}
