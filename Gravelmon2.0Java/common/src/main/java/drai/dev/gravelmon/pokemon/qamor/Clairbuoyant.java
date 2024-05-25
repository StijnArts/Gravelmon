package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Clairbuoyant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Clairbuoyant() {
        super("Clairbuoyant",
                Type.PSYCHIC, Type.WATER,
                new Stats(110,
                        50,
                        60,
                        110,
                        105,
                        67),
                List.of(Ability.FOREWARN), Ability.GALE_WINGS,
                22, 165,
                new Stats(1,0,0,1,0,0), 75,
                0.5,
                180, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Clairbuoyant are able to hypnotize Pokemon by moving their bodies in mysterious ways. Maritime legends say that Clairbuoyant would often mesmerize onlooking sailors to jump overboard."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYCHO_BOOST,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,5),
                        new MoveLearnSetEntry(Move.LIFE_DEW,8),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,10),
                        new MoveLearnSetEntry(Move.WING_ATTACK,13),
                        new MoveLearnSetEntry(Move.CONFUSION,19),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,24),
                        new MoveLearnSetEntry(Move.AQUA_RING,30),
                        new MoveLearnSetEntry(Move.PSYCHIC,34),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,37),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,41),
                        new MoveLearnSetEntry(Move.CAPTIVATE,45),
                        new MoveLearnSetEntry(Move.HURRICANE,50),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,62),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 29, 43, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
