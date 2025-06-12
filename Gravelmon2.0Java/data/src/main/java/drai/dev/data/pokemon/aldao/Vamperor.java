package drai.dev.data.pokemon.aldao;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vamperor extends drai.dev.data.pokemon.Pokemon {
    public Vamperor() {
        super("Vamperor",
                Type.DARK,Type.FLYING,
                new Stats(65,
                        35,
                        69,
                        118,
                        69,
                        100),
                List.of(), null,
                UnitConverter.feetToMeters(3, 6), 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ALDAO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Vamperor");

    }


}
