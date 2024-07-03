package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Zentipreeze extends drai.dev.gravelmon.pokemon.Pokemon {
    public Zentipreeze() {
        super("Zentipreeze",
                Type.ICE, Type.BUG,
                new Stats(80,
                        95,
                        50,
                        100,
                        75,
                        115),
                List.of(Ability.ICE_BODY), Ability.SNOWPLOW,
                8, 165,
                new Stats(0,0,0,0,0,3), 15,
                0.5,
                222, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Zentipreeze are wise and clever Pokemon, due to their time as Glacyte. They hide beneath the snow or on cave walls, and use these vantage points to capture prey. The length of their beard-like feelers show their age."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FREEZEDRY,1),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,10),
                        new MoveLearnSetEntry(Move.ICE_BALL,20),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,30),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,40),
                        new MoveLearnSetEntry(Move.FROST_BREATH,50),
                        new MoveLearnSetEntry(Move.CALM_MIND,60),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,70),
                        new MoveLearnSetEntry(Move.FREEZEDRY,80),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,90),
                        new MoveLearnSetEntry(Move.BLIZZARD,100),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"tm"),
                        new MoveLearnSetEntry(Move.DETECT,"tm"),
                        new MoveLearnSetEntry(Move.STEAMROLLER,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Zentipreeze");

    }


}
