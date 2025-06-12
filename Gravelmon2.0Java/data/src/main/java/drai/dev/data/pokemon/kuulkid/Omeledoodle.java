package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Omeledoodle extends drai.dev.data.pokemon.Pokemon {
    public Omeledoodle() {
        super("Omeledoodle",
                Type.FIRE,Type.FLYING,
                new Stats(110,
                        90,
                        75,
                        80,
                        60,
                        80),
                List.of(Ability.EARLY_BIRD), Ability.FLUFFY,
                16, 0,
                new Stats(3,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("The call of this pokemon can awake a pokemon from even the deepest of slumbers. For this reason, farmers keep this pokemon around to make sure they wake up on time."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(34)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Omeledoodle");

    }


}
