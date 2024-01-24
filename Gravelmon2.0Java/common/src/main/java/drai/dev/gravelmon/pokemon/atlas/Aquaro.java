package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Aquaro extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aquaro() {
        super("Aquaro",
                Type.WATER,Type.POISON,
                new Stats(57,
                        76,
                        34,
                        62,
                        48,
                        48),
                List.of(Ability.POISON_POINT,Ability.SNIPER,Ability.SHARPSHOOTER), Ability.SHARPSHOOTER,
                8, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                65, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("The spiky barbs on its body are toxic, which it can use to defend itself when singled out. They flash their bright colours to warn others of the danger."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,3),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,12),
                        new MoveLearnSetEntry(Move.LOCKON,16),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.TOXIC,23),
                        new MoveLearnSetEntry(Move.VENOSHOCK,27),
                        new MoveLearnSetEntry(Move.FLING,32),
                        new MoveLearnSetEntry(Move.WATERARROW,36),
                        new MoveLearnSetEntry(Move.POISON_JAB,41),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,45),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,52)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aquaro");

    }


}
