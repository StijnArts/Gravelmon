package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dustmighty extends drai.dev.data.pokemon.Pokemon {
    public Dustmighty(Stats stats) {
        super("Dustmighty",
                Type.POISON, Type.BUG,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                7, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Even its own nose is affected by the cloud of filth that wafts under it. It commands Mustmites as if they were an extension of itself."),
                List.of(),
                List.of(                        ),
                List.of(Label.GOETIA, Label.JOKE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 25, 42, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dustmighty");

    }


}
