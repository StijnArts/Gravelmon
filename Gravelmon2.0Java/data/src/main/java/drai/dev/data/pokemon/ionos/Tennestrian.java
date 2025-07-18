package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tennestrian extends drai.dev.data.pokemon.Pokemon {
    public Tennestrian() {
        super("Tennestrian",
                Type.GHOST, Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.IRON_FIST), Ability.SAND_VEIL,
                6, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ancient paintings has shown different Pokémon of matching size wearing this kind of armor, such as Machop. Many examples were made long ago, before the Ionian war. It used to be polished and clean but after thousands of years it has gotten rusty and covered in dust and sand. It is said that a restless spirit lives inside the armor itself, perhaps from a Pokémon that once wore the armor in battle."),
                List.of(new EvolutionEntry("knightmor", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setSpawnPreset(SpawnPreset.TRAIL_RUINS)
    .build(), List.of());
	
           setLangFileName("Tennestrian");

    }


}
