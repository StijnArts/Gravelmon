package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranLopunny extends Pokemon {
    public CefiranLopunny(String name, Aspect aspect, Stats stats) {
        super(name, aspect,"CefiranBuneary",
                Type.ICE,
                stats,
                List.of(Ability.SLUSH_RUSH), Ability.SNOW_CLOAK,
                17, 505,
                new Stats(0,1,0,0,0,1), 60,
                0.5,
                67, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(
                ),
                List.of(),
                List.of(Label.GEN4,Label.OPAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 23, 45, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.2, 0.3,
                List.of());
    }
}
