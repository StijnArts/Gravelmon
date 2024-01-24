package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Drizzlen extends drai.dev.gravelmon.pokemon.Pokemon {
    public Drizzlen() {
        super("Drizzlen",
                Type.GHOST,Type.FLYING,
                new Stats(62,
                        30,
                        40,
                        53,
                        70,
                        45),
                List.of(Ability.CLOUD_NINE), Ability.DRIZZLE,
                8, 165,
                new Stats(0,0,0,0,1,0), 0,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("- AstonishSTAB Ghost - Minimize Normal 6 GustSTAB Flying 11 Thunder Shock Electric 14 Growth Normal 17 Disable Normal 22 HexSTAB Ghost 27 Mist Ice 30 Memento Dark 33 Ominous WindSTAB Ghost 38 Cotton Guard Grass 43 Thunderbolt Electric 46 Tailwind Flying 51 HurricaneSTAB Flying"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MINIMIZE,1),
                        new MoveLearnSetEntry(Move.GUST,6),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,11),
                        new MoveLearnSetEntry(Move.GROWTH,14),
                        new MoveLearnSetEntry(Move.DISABLE,17),
                        new MoveLearnSetEntry(Move.HEX,22),
                        new MoveLearnSetEntry(Move.MIST,27),
                        new MoveLearnSetEntry(Move.MEMENTO,30),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,33),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,38),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,43),
                        new MoveLearnSetEntry(Move.TAILWIND,46),
                        new MoveLearnSetEntry(Move.HURRICANE,51)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Drizzlen");

    }


}
