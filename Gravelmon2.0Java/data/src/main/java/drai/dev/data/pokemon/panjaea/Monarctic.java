package drai.dev.data.pokemon.panjaea;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Monarctic extends drai.dev.data.pokemon.Pokemon {
    public Monarctic(Stats stats) {
        super("Monarctic",
                Type.BUG, Type.ICE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PANJAEA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(22).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY_FOREST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.WILD).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Monarctic");

    }


}
