package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Minicoo extends drai.dev.data.pokemon.Pokemon {
    public Minicoo() {
        super("Minicoo",
                Type.NORMAL,Type.BUG,
                new Stats(45,
                        30,
                        55,
                        30,
                        40,
                        30),
                List.of(Ability.SHIELD_DUST,Ability.HUSTLE), Ability.OVERCOAT,
                3, 0,
                new Stats(0,0,1,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("nimbuzz", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(2)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_TAIGA, Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Minicoo");

    }


}
