package drai.dev.data.pokemon.enjin.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EnjinnianDrowzee extends drai.dev.data.pokemon.Pokemon {
    public EnjinnianDrowzee(String name, Aspect aspect) {
        super(name, aspect, "Drowzee",
                Type.PSYCHIC,
                new Stats(60,
                        48,
                        45,
                        43,
                        90,
                        42),
                List.of(Ability.INSOMNIA,Ability.FOREWARN), Ability.INNER_FOCUS,
                10, 288,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(new EvolutionEntry("enjinnianhypno", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "night")))),
                List.of(                       ),
                List.of(Label.ENJIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(8)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Drowzee");

    }


}
