package drai.dev.gravelmon.pokemon.mastenia;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Flyterror extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flyterror() {
        super("Flyterror",
                Type.BUG, Type.FLYING,
                new Stats(79,
                        116,
                        75,
                        80,
                        75,
                        75),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("45 Dual WingbeatSTAB Flying"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,45)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flyterror");

    }


}
