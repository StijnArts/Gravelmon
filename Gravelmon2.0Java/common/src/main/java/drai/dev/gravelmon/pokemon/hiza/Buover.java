package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Buover extends drai.dev.gravelmon.pokemon.Pokemon {
    public Buover() {
        super("Buover",
                Type.GRASS,Type.WATER,
                new Stats(55,
                        40,
                        40,
                        45,
                        30,
                        70),
                List.of(Ability.HYDRATION), Ability.CHEEK_POUCH,
                8, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("They live around rivers but aren't good swimmers, they use driftwood to carry them around the water."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
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
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,49)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Buover");

    }


}
