package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squibble extends drai.dev.data.pokemon.Pokemon {
    public Squibble() {
        super("Squibble",
                Type.NORMAL,
                new Stats(40,
                        65,
                        40,
                        65,
                        40,
                        65),
                List.of(Ability.STEADFAST), Ability.FRISK,
                4, 36,
                new Stats(0,1,0,0,0,0), 200,
                0.5,
                63, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Squibble never stay still and are always on the look out for berries to store in trees. When startled, they will bite onto their attacker with their strong front teeth."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Squibble");

    }


}
