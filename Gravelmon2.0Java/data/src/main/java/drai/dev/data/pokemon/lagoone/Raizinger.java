package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Raizinger extends drai.dev.data.pokemon.Pokemon {
    public Raizinger() {
        super("Raizinger",
                Type.ELECTRIC, Type.WATER,
                new Stats(50,
                        40,
                        90,
                        100,
                        100,
                        100),
                List.of(Ability.LEVITATE), Ability.DRIZZLE,
                11, 350,
                new Stats(0,0,0,1,0,1), 75,
                0.5,
                161, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,5),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,8),
                        new MoveLearnSetEntry(Move.CHARGE,12),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,16),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,20),
                        new MoveLearnSetEntry(Move.SOLARCHARGER,24),
                        new MoveLearnSetEntry(Move.BEACHTIDE,31),
                        new MoveLearnSetEntry(Move.AMNESIA,33),
                        new MoveLearnSetEntry(Move.DISCHARGE,37),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,41),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,45),
                        new MoveLearnSetEntry(Move.AQUA_RING,52),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,58)          ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Raizinger");

    }


}
