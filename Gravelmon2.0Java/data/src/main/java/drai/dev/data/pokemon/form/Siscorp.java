package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Siscorp extends drai.dev.data.pokemon.Pokemon {
    public Siscorp() {
        super("Siscorp",
                Type.WATER,Type.POISON,
                new Stats(84,
                        124,
                        72,
                        44,
                        80,
                        72),
                List.of(Ability.POISON_POINT), null,
                15, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 25, 45, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Siscorp");

    }


}
