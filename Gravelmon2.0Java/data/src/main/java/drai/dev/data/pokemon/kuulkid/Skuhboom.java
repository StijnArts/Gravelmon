package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Skuhboom extends drai.dev.data.pokemon.Pokemon {
    public Skuhboom() {
        super("Skuhboom",
                Type.POISON,Type.FIGHTING,
                new Stats(65,
                        86,
                        67,
                        96,
                        68,
                        75),
                List.of(Ability.STENCH,Ability.AFTERMATH), Ability.TOXIC_DEBRIS,
                12, 0,
                new Stats(0,0,0,1,0,0), 110,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Skuhbooms store lethal amounts of stinky chemicals in their tails. When threatened, This pokemon sprays those chemicals at its foes."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Skuhboom");

    }


}
