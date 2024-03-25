package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Hoppercut extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hoppercut() {
        super("Hoppercut",
                Type.BUG,Type.FIGHTING,
                new Stats(70,
                        120,
                        65,
                        50,
                        64,
                        117),
                List.of(Ability.JUSTIFIED,Ability.QUICK_FEET), Ability.VITAL_SPIRIT,
                14, 375,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                173, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Hoppercut never sleep and are always on the lookout for foes that they can challenge. Quite often, these targets end up being evil, making many consider it a hero."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hoppercut");

    }


}
