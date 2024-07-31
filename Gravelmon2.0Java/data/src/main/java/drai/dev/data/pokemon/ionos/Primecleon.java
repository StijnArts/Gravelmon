package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Primecleon extends drai.dev.data.pokemon.Pokemon {
    public Primecleon(Stats stats) {
        super("Primecleon",
                Type.ROCK, Type.NORMAL,
                stats,
                List.of(Ability.COLOR_CHANGE), Ability.PROTEAN,
                15, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        addAdditionalEvolution("kecleon", new EvolutionEntry("primecleon", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"gravelmon:astral_stone"));
           setLangFileName("Primecleon");

    }


}
