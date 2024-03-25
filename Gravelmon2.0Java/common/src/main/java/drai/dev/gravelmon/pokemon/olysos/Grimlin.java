package drai.dev.gravelmon.pokemon.olysos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Grimlin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grimlin() {
        super("Grimlin",
                Type.DARK,
                new Stats(45,
                        40,
                        35,
                        40,
                        35,
                        60),
                List.of(Ability.PICKPOCKET,Ability.MOODY), Ability.RIVALRY,
                5, 50,
                new Stats(0,0,0,0,0,1), 200,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Its oversized nose is a keen sensor, allowing it to sniff out potential prey or hidden treasures. Known for its aggressive nature, Grimlin is often spotted ambushing unsuspecting targets, stealing items, or playfully hurling rocks at travelers and reveling in their reactions."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grimlin");

    }


}
