package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shaginny extends drai.dev.data.pokemon.Pokemon {
    public Shaginny() {
        super("Shaginny",
                Type.NORMAL,
                new Stats(50,
                        55,
                        35,
                        30,
                        35,
                        60),
                List.of(Ability.RUN_AWAY), Ability.RUN_AWAY,
                3, 0,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("The tangled, upkept formation of their fur makes Shaginnies exceedingly hard to groom. These pokemon are often prone to skin problems because of their inability to access the skin underneath their hair."),
                List.of(new EvolutionEntry("cavicurl", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 8, 28, 4.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shaginny");

    }


}
