package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Figurina extends drai.dev.data.pokemon.Pokemon {
    public Figurina(Stats stats) {
        super("Figurina",
                Type.GHOST, Type.GRASS,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 23, 45, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER, SpawnPreset.SHIP_WRECK),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Figurina");

    }


}
