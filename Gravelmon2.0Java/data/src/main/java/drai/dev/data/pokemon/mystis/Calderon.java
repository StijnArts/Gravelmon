package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Calderon extends drai.dev.data.pokemon.Pokemon {
    public Calderon() {
        super("Calderon",
                Type.FIRE, Type.STEEL,
                new Stats(80,
                        60,
                        80,
                        60,
                        70,
                        40),
                List.of(Ability.FLAME_BODY,Ability.FLASH_FIRE), Ability.MAGIC_GUARD,
                9, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("People should be cautious when handling a Calderon! When tipped over, most of its contents will spill out and begin melting the ground."),
                List.of(new EvolutionEntry("boilord", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.ILLAGER_STRUCTURES).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Calderon");

    }


}
