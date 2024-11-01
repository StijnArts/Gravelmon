package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Skuhboom extends drai.dev.data.pokemon.Pokemon {
    public Skuhboom() {
        super("Skuhboom",
                Type.POISON,Type.FIGHTING,
                new Stats(65,
                        86,
                        67,
                        96,
                        68,
                        75),
                List.of(Ability.STENCH,Ability.AFTERMATH), Ability.TOXIC_DEBRIS,
                12, 0,
                new Stats(0,0,0,1,0,0), 110,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Skuhbooms store lethal amounts of stinky chemicals in their tails. When threatened, This pokemon sprays those chemicals at its foes."),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 26, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Skuhboom");

    }


}
