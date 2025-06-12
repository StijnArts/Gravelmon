package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Swabear extends drai.dev.data.pokemon.Pokemon {
    public Swabear() {
        super("Swabear",
                Type.WATER,Type.GROUND,
                new Stats(129,
                        92,
                        109,
                        38,
                        84,
                        46),
                List.of(Ability.WATER_ABSORB), null,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 51, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MANGROVE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Swabear");

    }


}
