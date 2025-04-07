package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shelliphant extends drai.dev.data.pokemon.Pokemon {
    public Shelliphant() {
        super("Shelliphant",
                Type.GRASS,
                new Stats(70,
                        50,
                        65,
                        40,
                        50,
                        40),
                List.of(Ability.OVERGROW), Ability.SOLID_ROCK,
                8, 0,
                new Stats(1,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("This pokemon uses its long, flexible trunk to forage for nuts and berries on the ground and in small bushes. This pokemon has a certain fondness for peanuts and will become extra friendly when gifted one as a treat."),
                List.of(new EvolutionEntry("tusknut", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 32, 6.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shelliphant");

    }


}
