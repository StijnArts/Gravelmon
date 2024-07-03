package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Glacyte extends drai.dev.gravelmon.pokemon.Pokemon {
    public Glacyte() {
        super("Glacyte",
                Type.ICE, Type.BUG,
                new Stats(65,
                        55,
                        95,
                        50,
                        75,
                        20),
                List.of(Ability.ICE_BODY), Ability.STURDY,
                8, 165,
                new Stats(0,0,2,0,1,0), 45,
                0.5,
                88, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Frozen within a block of ice, Glacyte can't properly interact with the outside world. It spends its isolation observing opponents and surroundings. They have enough strength to propel themselves by rolling, but can seldom stop once they have built up speed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
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
           setLangFileName("Glacyte");

    }


}
