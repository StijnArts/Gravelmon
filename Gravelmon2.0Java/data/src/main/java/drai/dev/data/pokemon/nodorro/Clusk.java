package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Clusk extends drai.dev.data.pokemon.Pokemon {
    public Clusk() {
        super("Clusk",
                Type.FLYING,
                new Stats(32,
                        29,
                        36,
                        68,
                        40,
                        45),
                List.of(Ability.STATIC), Ability.VOLT_ABSORB,
                6, 0,
                new Stats(0,0,0,0,0,0), 210,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- GustSTAB Flying 3 Smokescreen Normal 5 Thunder Shock Electric 9 Charge Electric 10 Spark Electric 13 Smog Poison 17 Shock Wave Electric 20 Rain Dance Water 20 Snowscape Ice 25 Charge Beam Electric 30 Calm Mind Psychic 35 Discharge Electric 39 Soak Water 45 Defog Flying 55 HurricaneSTAB Flying"),
                List.of(new EvolutionEntry("nimbusk", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,3),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.CHARGE,9),
                        new MoveLearnSetEntry(Move.SPARK,10),
                        new MoveLearnSetEntry(Move.SMOG,13),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,17),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,20),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,20),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,25),
                        new MoveLearnSetEntry(Move.CALM_MIND,30),
                        new MoveLearnSetEntry(Move.DISCHARGE,35),
                        new MoveLearnSetEntry(Move.SOAK,39),
                        new MoveLearnSetEntry(Move.DEFOG,45),
                        new MoveLearnSetEntry(Move.HURRICANE,55),
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
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN).isNotRaining()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Clusk");

    }


}
