package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Segnapod extends drai.dev.data.pokemon.Pokemon {
    public Segnapod() {
        super("Segnapod",
                Type.POISON,
                new Stats(102,
                        50,
                        73,
                        68,
                        88,
                        64),
                List.of(Ability.DRY_SKIN,Ability.STICKY_HOLD), Ability.REGENERATOR,
                9, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.CYARE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 32, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Segnapod");

    }


}
