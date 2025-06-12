package drai.dev.data.pokemon.norheim.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class NorheimanUnown extends drai.dev.data.pokemon.Pokemon {
    public NorheimanUnown(String name, Aspect aspect) {
        super(name, aspect, "Unown",
                Type.PSYCHIC, Type.ROCK,
                new Stats(48,
                        48,
                        72,
                        72,
                        48,
                        48),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                5, 165,
                new Stats(0,0,0,0,0,0), 225,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,1),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,21),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,41),
                        new MoveLearnSetEntry(Move.STORED_POWER,61)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .setSpawnPreset(SpawnPreset.RUINED_PORTAL)
    .build(), List.of());
	
           setLangFileName("Unown");
    }


}
