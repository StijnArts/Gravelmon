package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Primecleon extends drai.dev.data.pokemon.Pokemon {
    public Primecleon(Stats stats) {
        super("Primecleon",
                Type.ROCK, Type.NORMAL,
                stats,
                List.of(Ability.COLOR_CHANGE), Ability.PROTEAN,
                15, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        addAdditionalEvolution("kecleon", new EvolutionEntry("primecleon", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"gravelmon:astral_stone"));
           setLangFileName("Primecleon");

    }


}
