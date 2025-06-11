package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Knightmor extends drai.dev.data.pokemon.Pokemon {
    public Knightmor() {
        super("Knightmor",
                Type.GHOST, Type.STEEL,
                new Stats(80,
                        109,
                        100,
                        70,
                        130,
                        60),
                List.of(Ability.IRON_FIST), Ability.MIRROR_ARMOR,
                17, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The body of Knightmor is nothing more than a vessel, a home for a wandering spirit; lost in time, lost at war. It is believed that this armor once belonged to a Pokémon over 3,000 years ago. The armature itself may be found in armories inside great castles. Examples are extremely rare however and a matching set is nearly impossible to find."),
                List.of(),
                List.of(
                                              ),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(42)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setSpawnPreset(SpawnPreset.TRAIL_RUINS)
    .build(), List.of());
	
           setLangFileName("Knightmor");

    }


}
