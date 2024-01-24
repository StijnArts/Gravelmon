package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Atomix extends drai.dev.gravelmon.pokemon.Pokemon {
    public Atomix() {
        super("Atomix",
                Type.ELECTRIC,Type.GHOST,
                new Stats(60,
                        50,
                        50,
                        125,
                        90,
                        110),
                List.of(Ability.GALVANIZE), Ability.AFTERMATH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("After evolution, Atomix often exhibit strange, unstable behavior such as vanishing into thin air, phasing through solid objects and even spontaneously exploding in some cases."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MAGNET_RISE,1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,5),
                        new MoveLearnSetEntry(Move.PSYWAVE,7),
                        new MoveLearnSetEntry(Move.CHARGE,10),
                        new MoveLearnSetEntry(Move.ION_DELUGE,13),
                        new MoveLearnSetEntry(Move.GYRO_BALL,15),
                        new MoveLearnSetEntry(Move.PARABOLIC_CHARGE,18),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,21),
                        new MoveLearnSetEntry(Move.GRAVITY,25),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,27),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,29),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,35),
                        new MoveLearnSetEntry(Move.DISCHARGE,40),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,45),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,48),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,52),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,55),
                        new MoveLearnSetEntry(Move.MEMENTO,60)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Atomix");

    }


}
