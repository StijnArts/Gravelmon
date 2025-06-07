package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Blockodile extends drai.dev.data.pokemon.Pokemon {
    public Blockodile(Stats stats) {
        super("Blockodile",
                Type.ROCK, Type.GROUND,
                stats,
                List.of(Ability.DRY_SKIN,Ability.ROCK_HEAD), Ability.STRONG_JAW,
                10, 153,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("To protect itself from direct sunlight it covers its body with dirt and debris from the jungle floor. It can stand still for so long that it looks like an old statue."),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(25).setPool(SpawnPool.RARE).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MOUNTAIN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Blockodile");

    }


}
