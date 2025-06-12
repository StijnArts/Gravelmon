package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Zerebro extends drai.dev.data.pokemon.Pokemon {
    public Zerebro() {
        super("Zerebro",
                Type.ICE,Type.PSYCHIC,
                new Stats(62,
                        60,
                        65,
                        95,
                        120,
                        59),
                List.of(Ability.ANTICIPATION,Ability.ICE_BODY), Ability.SNOW_WARNING,
                12, 0,
                new Stats(0,0,0,0,2,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Zerebros have harnessed the headaches caused by the ice-cold syrup that secretes from their heads to fire off powerful psychic attacks. Migrating Zerebros leave a distinct red trail behind them wherever they go."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Zerebro");

    }


}
