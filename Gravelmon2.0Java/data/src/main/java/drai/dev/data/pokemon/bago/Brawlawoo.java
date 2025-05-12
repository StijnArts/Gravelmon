package drai.dev.data.pokemon.bago;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Brawlawoo extends drai.dev.data.pokemon.Pokemon {
    public Brawlawoo() {
        super("Brawlawoo",
                Type.FIGHTING,
                new Stats(88,
                        129,
                        75,
                        46,
                        84,
                        75),
                List.of(), null,
                UnitConverter.feetToMeters(4, 6), 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.BAGO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 34, 51, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Brawlawoo");

    }


}
