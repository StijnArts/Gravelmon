package drai.dev.data.pokemon.novrai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Neurymph extends drai.dev.data.pokemon.Pokemon {
    public Neurymph() {
        super("Neurymph",
                Type.BUG,
                new Stats(35,
                        20,
                        40,
                        40,
                        45,
                        30),
                List.of(Ability.UNNERVE,Ability.TELEPATHY,Ability.RATTLED), Ability.RATTLED,
                1, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                42, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It sends signals to others by emitting subtle psychic pulses. Neurymph eggs are commonly laid upon the back of a Cascarapace."),
                List.of(new EvolutionEntry("cognisalis", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,1),
                        new MoveLearnSetEntry(Move.FLAIL,5),
                        new MoveLearnSetEntry(Move.BUG_BITE,15)                        ),
                List.of(Label.NOVRAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	
           setLangFileName("Neurymph");

    }


}
