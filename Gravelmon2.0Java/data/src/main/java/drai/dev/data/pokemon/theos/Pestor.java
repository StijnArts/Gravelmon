package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pestor extends drai.dev.data.pokemon.Pokemon {
    public Pestor() {
        super("Pestor",
                Type.DARK,
                new Stats(60,
                        50,
                        30,
                        40,
                        30,
                        70),
                List.of(Ability.PICKPOCKET), Ability.PRANKSTER,
                11, 12,
                new Stats(0,0,0,0,0,1), 200,
                0.5,
                56, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pestor are known for their pranks and traps. Quite often they'll play dead so when trainers go to help, they can ambush them and steal from their bags."),
                List.of(new EvolutionEntry("punkosom", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Pestor");

    }


}
