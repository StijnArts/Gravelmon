package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Conedian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Conedian() {
        super("Conedian",
                Type.ICE, Type.FAIRY,
                new Stats(76,
                        34,
                        67,
                        89,
                        99,
                        78),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Scientists have studied Conedian's biological make-up extensively in order to find out why its ice cream body and chocolate arms never melt, even under the most extreme of temperatures."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PIXIEDUST,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,8),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,13),
                        new MoveLearnSetEntry(Move.MIST,18),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,22),
                        new MoveLearnSetEntry(Move.REFLECT,26),
                        new MoveLearnSetEntry(Move.HAZE,31),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,37),
                        new MoveLearnSetEntry(Move.FREEZEDRY,42),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,47),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,51),
                        new MoveLearnSetEntry(Move.BLIZZARD,56),
                        new MoveLearnSetEntry(Move.RECOVER,61)
                ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 51, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Conedian");

    }


}
