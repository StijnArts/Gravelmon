package drai.dev.data.pokemon.borazul;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Paradivia extends drai.dev.data.pokemon.Pokemon {
    public Paradivia() {
        super("Paradivia",
                Type.FAIRY,Type.FLYING,
                new Stats(64,
                        64,
                        79,
                        60,
                        64,
                        134),
                List.of(), null,
                8, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.BORAZUL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 21, 43, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Paradivia");

    }


}
