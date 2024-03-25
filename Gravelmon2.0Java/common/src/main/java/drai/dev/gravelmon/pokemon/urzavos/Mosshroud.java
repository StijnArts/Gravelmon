package drai.dev.gravelmon.pokemon.urzavos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Mosshroud extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mosshroud() {
        super("Mosshroud",
                Type.DARK,Type.GRASS,
                new Stats(46,
                        42,
                        32,
                        44,
                        42,
                        64),
                List.of(Ability.INTIMIDATE), Ability.ADAPTABILITY,
                3, 204,
                new Stats(0,1,0,0,0,1), 120,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("These 'Mons lie motionless in the dark depths of caves, hoping for prey to step on them. Their bite is strong enough to break through most common metals and metal alloys."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.PURSUIT,10),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,15),
                        new MoveLearnSetEntry(Move.SLAM,20),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,35),
                        new MoveLearnSetEntry(Move.POWER_WHIP,45)                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mosshroud");

    }


}
