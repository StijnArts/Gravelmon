package drai.dev.gravelmon.pokemon.nodorro;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Scaelicius extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scaelicius() {
        super("Scaelicius",
                Type.FLYING, Type.DRAGON,
                new Stats(80,
                        130,
                        95,
                        145,
                        100,
                        120),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                73, 2000,
                new Stats(0,1,0,2,0,0), 5,
                0.0,
                300, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("- Smite Light - Holy Blessing Light"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HOLYBLESSING,1),
                        new MoveLearnSetEntry(Move.SMITE,1)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scaelicius");

    }


}
