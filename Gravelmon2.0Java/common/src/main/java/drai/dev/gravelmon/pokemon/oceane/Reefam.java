package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Reefam extends drai.dev.gravelmon.pokemon.Pokemon {
    public Reefam() {
        super("Reefam",
                Type.WATER,
                new Stats(40,
                        50,
                        30,
                        45,
                        35,
                        60),
                List.of(Ability.SWIFT_SWIM), Ability.RATTLED,
                8, 165,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                52, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("There is always one leader and two followers. The followers are completely dependant - should they lose their leader, they will wander aimlessly and starve. Two forms have been discovered in the Oceane region."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Reefam");

    }


}
