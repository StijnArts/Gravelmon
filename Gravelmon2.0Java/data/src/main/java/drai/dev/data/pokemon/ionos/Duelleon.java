package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Duelleon extends drai.dev.data.pokemon.Pokemon {
    public Duelleon(Stats stats) {
        super("Duelleon",
                Type.FIGHTING, Type.STEEL,
                stats,
                List.of(Ability.DEFIANT), Ability.SHEER_FORCE,
                9, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Duelleon was raised for battle and stood on the front lines during the great Ionian war. Its weapon and armor is one with its body. The cause of this is unknown but legends say that Duelleon evolved next to human elite soldiers during the time of war."),
                List.of(),
                List.of(
                                                ),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.DESERT_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Duelleon");

    }


}
