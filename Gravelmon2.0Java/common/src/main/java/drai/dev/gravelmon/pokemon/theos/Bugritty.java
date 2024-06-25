package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Bugritty extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bugritty() {
        super("Bugritty",
                Type.BUG,
                new Stats(70,
                        70,
                        60,
                        40,
                        40,
                        60),
                List.of(Ability.ADAPTABILITY), Ability.CORROSION,
                8, 40,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Upon evolution Bugritty gains a hard shell somewhat resembling a Pokèball. This allows them to sneak into the bags of trainers undetected and eat all that’s inside."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bugritty");

    }


}
