package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Julimese extends drai.dev.gravelmon.pokemon.Pokemon {
    public Julimese() {
        super("Julimese",
                Type.GRASS,Type.ELECTRIC,
                new Stats(71,
                        59,
                        71,
                        89,
                        167,
                        83),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                0, 0,
                new Stats(0,0,0,0,3,0), 30,
                0.0,
                231, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Codename: UB-028 Twin. A member of an Ultra Beast family. It's said that if it were to be separated from its twin body for long enough, it would erupt into a burst so destructive it'd be enough to erase matter."),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Julimese");

    }


}
