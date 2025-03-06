package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Attawatta extends drai.dev.data.pokemon.Pokemon {
    public Attawatta() {
        super("Attawatta",
                Type.WATER,
                new Stats(62,
                        60,
                        102,
                        90,
                        106,
                        65),
                List.of(Ability.CLEAR_BODY,Ability.WEAK_ARMOR), Ability.WATER_BUBBLE,
                14, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 65, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Attawatta");

    }


}
