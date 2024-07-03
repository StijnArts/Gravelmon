package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Valecred extends drai.dev.gravelmon.pokemon.Pokemon {
    public Valecred() {
        super("Valecred",
                Type.GRASS, Type.DRAGON,
                new Stats(80,
                        100,
                        70,
                        110,
                        90,
                        130),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                23, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It is known to be a guardian to a sacred valley in the Orohn Division. It kept the land rich and healthy. When it disappeared the vegetation began dying and the Pokemon fled the valley."),
                List.of(),
                List.of(         new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.GUST,5),
                        new MoveLearnSetEntry(Move.TWISTER,12),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,17),
                        new MoveLearnSetEntry(Move.PROTECT,20),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,24),
                        new MoveLearnSetEntry(Move.SYNTHESIS,28),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,34),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,38),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,42),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,46),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,56),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,65)               ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Valecred");

    }


}
