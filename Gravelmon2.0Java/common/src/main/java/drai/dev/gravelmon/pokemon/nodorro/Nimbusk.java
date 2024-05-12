package drai.dev.gravelmon.pokemon.nodorro;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Nimbusk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nimbusk() {
        super("Nimbusk",
                Type.FLYING, Type.ELECTRIC,
                new Stats(84,
                        110,
                        60,
                        110,
                        76,
                        95),
                List.of(Ability.STATIC), Ability.VOLT_ABSORB,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Thunder PunchSTAB Electric - Ice Punch Ice - Fire Punch Fire - ThunderboltSTAB Electric 2 GustSTAB Flying 5 Thunder ShockSTAB Electric 6 Charge Electric 9 SparkSTAB Electric 15 Shock WaveSTAB Electric 20 Rain Dance Water 20 Snowscape Ice 26 Charge BeamSTAB Electric 30 Calm Mind Psychic 34 Mist Ice 35 Haze Ice 39 Swords Dance Normal 46 DischargeSTAB Electric 52 ThunderSTAB Electric 60 HurricaneSTAB Flying"),
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
                        new MoveLearnSetEntry(Move.HURRICANE,60),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ENCORE,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.ASTONISH,"tm"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nimbusk");

    }


}
