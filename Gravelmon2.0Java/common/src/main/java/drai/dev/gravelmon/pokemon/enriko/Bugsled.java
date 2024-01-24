package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bugsled extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bugsled() {
        super("Bugsled",
                Type.BUG,Type.ICE,
                new Stats(120,
                        100,
                        80,
                        10,
                        60,
                        110),
                List.of(Ability.SPEED_BOOST), Ability.REFRIGERATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is trapped in a cocoon from which it will never hatch. By gaining momentum, it can accelerate to almost 180 miles per hour in search of a mate."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bugsled");

    }


}
