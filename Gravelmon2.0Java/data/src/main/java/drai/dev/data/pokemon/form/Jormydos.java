package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Jormydos extends drai.dev.data.pokemon.Pokemon {
    public Jormydos() {
        super("Jormydos",
                Type.ICE,Type.POISON,
                new Stats(77,
                        41,
                        81,
                        139,
                        81,
                        117),
                List.of(Ability.ABSOLUTEFREEZE), null,
                38, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 36, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FROZEN_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Jormydos");

    }


}
