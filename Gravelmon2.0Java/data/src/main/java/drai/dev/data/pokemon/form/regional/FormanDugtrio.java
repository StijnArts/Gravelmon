package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanDugtrio extends drai.dev.data.pokemon.Pokemon {
    public FormanDugtrio(String name, Aspect aspect) {
        super(name, aspect, "FormanDugtrio",
                Type.GROUND,Type.WATER,
                new Stats(92,
                        32,
                        109,
                        92,
                        78,
                        18),
                List.of(Ability.WATER_ABSORB), null,
                13, 0,
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
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 26, 54, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER, SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Dugtrio");

    }


}
