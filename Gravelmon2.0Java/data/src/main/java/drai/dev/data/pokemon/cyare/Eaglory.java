package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Eaglory extends drai.dev.data.pokemon.Pokemon {
    public Eaglory(Stats stats) {
        super("Eaglory",
                Type.NORMAL, Type.FLYING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Putting honor first before anything else, Eaglory defend their nests with valor and justice. Eaglory were almost decided to be a mascot of a region before being told that a regular flag might be a better idea."),
                List.of(),
                List.of(),
                List.of(Label.CYARE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 53, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COAST, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Eaglory");

    }


}
