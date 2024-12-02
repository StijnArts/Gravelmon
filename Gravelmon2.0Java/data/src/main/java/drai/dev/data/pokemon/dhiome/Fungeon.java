package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fungeon extends drai.dev.data.pokemon.Pokemon {
    public Fungeon(Stats stats) {
        super("Fungeon",
                Type.POISON,
                stats,
                List.of(Ability.EFFECT_SPORE), Ability.EFFECT_SPORE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It has been exposed to humidity and as a result it inhaled fungi that led to its evolution. Its mushrooms are used for medicinal purposes."),
                List.of(),
                List.of(                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 44, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        addAdditionalEvolution("eevee", new EvolutionEntry("fungeon", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"minecraft:red_mushroom"));
           setLangFileName("Fungeon");

    }


}
