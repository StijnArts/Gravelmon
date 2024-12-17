package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tentpest extends drai.dev.data.pokemon.Pokemon {
    public Tentpest() {
        super("Tentpest",
                Type.FLYING, Type.ELECTRIC,
                new Stats(65,
                        45,
                        56,
                        89,
                        98,
                        87),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tentpest are a plague upon the music-loving citizens of Lonava, frequently disrupting the annual Tonbury Festival with their nasty winds and storm-conjuring habits. Anyone willing to raise one is considered bad luck and banned from entering the Festival grounds."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDERBOLT,1),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,1),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,1),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,1),
                        new MoveLearnSetEntry(Move.GUST,2),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.CHARGE,6),
                        new MoveLearnSetEntry(Move.SPARK,9),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,15),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,20),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,20),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,26),
                        new MoveLearnSetEntry(Move.CALM_MIND,30),
                        new MoveLearnSetEntry(Move.MIST,34),
                        new MoveLearnSetEntry(Move.HAZE,35),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,39),
                        new MoveLearnSetEntry(Move.DISCHARGE,46),
                        new MoveLearnSetEntry(Move.THUNDER,52),
                        new MoveLearnSetEntry(Move.HURRICANE,60)
                ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 36, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Tentpest");

    }


}
