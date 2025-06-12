package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pidgoblast extends drai.dev.data.pokemon.Pokemon {
    public Pidgoblast() {
        super("Pidgoblast",
                Type.FIRE,Type.FLYING,
                new Stats(64,
                        34,
                        68,
                        116,
                        68,
                        98),
                List.of(Ability.FLASH_FIRE), null,
                16, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 33, 47, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_VOLCANIC)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Pidgoblast");

    }


}
