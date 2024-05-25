package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cumucloud extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cumucloud() {
        super("Cumucloud",
                Type.GHOST, Type.FLYING,
                new Stats(95,
                        50,
                        60,
                        77,
                        112,
                        66),
                List.of(Ability.CLOUD_NINE), Ability.DRIZZLE,
                12, 165,
                new Stats(0,0,0,0,2,0), 60,
                0.5,
                161, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.GUST,6),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,11),
                        new MoveLearnSetEntry(Move.GROWTH,14),
                        new MoveLearnSetEntry(Move.DISABLE,17),
                        new MoveLearnSetEntry(Move.HEX,22),
                        new MoveLearnSetEntry(Move.MIST,27),
                        new MoveLearnSetEntry(Move.MEMENTO,32),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,37),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,44),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,51),
                        new MoveLearnSetEntry(Move.TAILWIND,56),
                        new MoveLearnSetEntry(Move.HURRICANE,60)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 29, 48, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
