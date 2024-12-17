package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kermite extends drai.dev.data.pokemon.Pokemon {
    public Kermite() {
        super("Kermite",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SOILFLIPPING), null,
                4, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Solmite", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_gem"),
                        new EvolutionEntry("Wingmite", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:flying_gem"),
                        new EvolutionEntry("Mitequeen", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY, "gender=female")),
                                List.of(),"cobblemon:dragon_gem"),
                        new EvolutionEntry("Miteking", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY, "gender=male")),
                                List.of(),"cobblemon:steel_gem")),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 1, 20, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kermite");

    }


}
