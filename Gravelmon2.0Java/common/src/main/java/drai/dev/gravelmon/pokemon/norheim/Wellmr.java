package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Wellmr extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wellmr() {
        super("Wellmr",
                Type.PSYCHIC,Type.WATER,
                new Stats(97,
                        93,
                        93,
                        87,
                        187,
                        13),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Wellmír (UB Well) is located under the tree of Silyggdra. It's said to make any wish come true, unless you stumble across its destructive powers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WISH,1),
                        new MoveLearnSetEntry(Move.LOCKON,8),
                        new MoveLearnSetEntry(Move.SCARY_FACE,16),
                        new MoveLearnSetEntry(Move.PSYBEAM,22),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,26),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,36),
                        new MoveLearnSetEntry(Move.STORED_POWER,42),
                        new MoveLearnSetEntry(Move.PSYCHIC,48),
                        new MoveLearnSetEntry(Move.LIFE_DEW,58),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,68),
                        new MoveLearnSetEntry(Move.POWER_WHIP,74)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wellmír");

    }


}
