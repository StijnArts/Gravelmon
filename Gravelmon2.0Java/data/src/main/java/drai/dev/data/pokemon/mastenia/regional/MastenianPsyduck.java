package drai.dev.data.pokemon.mastenia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MastenianPsyduck extends drai.dev.data.pokemon.Pokemon {
    public MastenianPsyduck(String name, Aspect aspect) {
        super(name, aspect, "Psyduck",
                Type.POISON,Type.PSYCHIC,
                new Stats(50,
                        62,
                        48,
                        55,
                        55,
                        50),
                List.of(Ability.POISON_TOUCH,Ability.TELEPATHY), Ability.CONTAMINATE,
                11, 0,
                new Stats(0,0,0,0,0,0), 230,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("masteniangolduck", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Psyduck");

    }


}
