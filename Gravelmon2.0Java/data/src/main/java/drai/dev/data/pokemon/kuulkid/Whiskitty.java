package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Whiskitty extends drai.dev.data.pokemon.Pokemon {
    public Whiskitty() {
        super("Whiskitty",
                Type.STEEL,
                new Stats(40,
                        46,
                        57,
                        22,
                        35,
                        45),
                List.of(Ability.GOURMAND), Ability.GOURMAND,
                6, 0,
                new Stats(0,0,1,0,0,0), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("gourmeow", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"210")))),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Whiskitty");

    }


}
