package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dralytra extends drai.dev.data.pokemon.Pokemon {
    public Dralytra() {
        super("Dralytra",
                Type.BUG,Type.DRAGON,
                new Stats(70,
                        68,
                        84,
                        138,
                        89,
                        101),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 132,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 45, 58, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Dralytra");

    }


}
