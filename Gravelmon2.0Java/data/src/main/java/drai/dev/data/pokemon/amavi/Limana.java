package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Limana extends drai.dev.data.pokemon.Pokemon {
    public Limana() {
        super("Limana",
                Type.BUG,
                new Stats(80,
                        25,
                        40,
                        40,
                        50,
                        30),
                List.of(Ability.HARVEST,Ability.GLUTTONY), Ability.UNBURDEN,
                3, 24,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                50, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("snellow", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.RATIO,"DEFENCE_HIGHER"))),
                        new EvolutionEntry("tanana", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.RATIO,"ATTACK_HIGHER"))),
                        new EvolutionEntry("florange", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"220")))),
                List.of(  new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.INFESTATION,6),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,10),
                        new MoveLearnSetEntry(Move.BUG_BITE,14)                      ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Limana");

    }


}
