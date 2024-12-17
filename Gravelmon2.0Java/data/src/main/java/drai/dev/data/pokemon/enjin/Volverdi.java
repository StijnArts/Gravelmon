package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Volverdi extends drai.dev.data.pokemon.Pokemon {
    public Volverdi(Stats stats) {
        super("Volverdi",
                Type.PSYCHIC,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                2, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Added Oct 27 2021 Etymology: volvox (a kind of green algae) + verde"),
                List.of(),
                List.of(),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 13, 41, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FOLIAGE, SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Volverdi");

    }


}
