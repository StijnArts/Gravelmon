package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Swondola extends drai.dev.gravelmon.pokemon.Pokemon {
    public Swondola() {
        super("Swondola",
                Type.GRASS,Type.WATER,
                new Stats(76,
                        50,
                        75,
                        85,
                        80,
                        119),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,5),
                        new MoveLearnSetEntry(Move.WATER_GUN,8),
                        new MoveLearnSetEntry(Move.AQUA_RING,17),
                        new MoveLearnSetEntry(Move.BRINE,21),
                        new MoveLearnSetEntry(Move.HYPER_FANG,25),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,29),
                        new MoveLearnSetEntry(Move.SUPER_FANG,33),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,37),
                        new MoveLearnSetEntry(Move.WATERFALL,41),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,45),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,49)        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.UNCOMMON, 25, 45, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.WATER_SURFACE, SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
