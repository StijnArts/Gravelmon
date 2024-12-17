package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Orotolas extends drai.dev.data.pokemon.Pokemon {
    public Orotolas() {
        super("Orotolas",
                Type.BUG, Type.DRAGON,
                new Stats(121,
                        120,
                        130,
                        50,
                        100,
                        99),
                List.of(Ability.GOLDRUSH), Ability.GOLDRUSH,
                8, 165,
                new Stats(0,2,1,0,0,0), 25,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("This Pokemon appears in legends, where it's said to have ripped the wings from another legendary Pokemon. It sleeps in a pile of gold, in a mountain deep within the Atlas Region."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GILDEDSPEAR,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,7),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,11),
                        new MoveLearnSetEntry(Move.UPROAR,16),
                        new MoveLearnSetEntry(Move.SILVER_WIND,22),
                        new MoveLearnSetEntry(Move.STOMP,24),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,30),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,38),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,42),
                        new MoveLearnSetEntry(Move.MEGAHORN,50),
                        new MoveLearnSetEntry(Move.IRON_HEAD,58),
                        new MoveLearnSetEntry(Move.EARTH_POWER,66),
                        new MoveLearnSetEntry(Move.STONE_EDGE,72),
                        new MoveLearnSetEntry(Move.GILDEDSPEAR,85)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 50, 65, .00002, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HILLS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Orotolas");

    }


}
