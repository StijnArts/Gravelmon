package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Caimarune extends drai.dev.data.pokemon.Pokemon {
    public Caimarune() {
        super("Caimarune",
                Type.PSYCHIC,Type.DARK,
                new Stats(90,
                        100,
                        80,
                        100,
                        80,
                        85),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 850,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                187, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 41, 54, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Caimarune");

    }


}
