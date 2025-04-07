package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class DaimyoHermitaur extends drai.dev.data.pokemon.Pokemon {
    public DaimyoHermitaur() {
        super("DaimyoHermitaur",
                Type.WATER, Type.GROUND,
                new Stats(85,
                        60,
                        120,
                        90,
                        75,
                        60),
                List.of(Ability.SHELL_ARMOR), Ability.SHELL_ARMOR,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It defends itself by protecting its face with with its huge hard claws, deflecting any move thrown at it. It utilizes the skull of other large creatures it finds buried as its shell, its favorite being Monoblos'."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Daimyo Hermitaur");

    }


}
