package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Newcleaur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Newcleaur() {
        super("Newcleaur",
                Type.DRAGON,
                new Stats(71,
                        173,
                        53,
                        161,
                        41,
                        71),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                0, 0,
                new Stats(0,0,0,3,0,0), 45,
                0.0,
                231, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Codename: UB-29 Destruction. A member of an Ultra Beast, it's said that it's in a perpetual state of anger that's only stopped by fainting. When aggravated enough, it's believed that being near it distorts time and space itself."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_ENERGY,1)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Newcleaur");

    }


}
