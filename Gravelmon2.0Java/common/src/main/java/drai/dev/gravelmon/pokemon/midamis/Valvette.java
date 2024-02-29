package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Valvette extends drai.dev.gravelmon.pokemon.Pokemon {
    public Valvette() {
        super("Valvette",
                Type.FIRE,Type.ELECTRIC,
                new Stats(95,
                        100,
                        75,
                        110,
                        75,
                        95),
                List.of(Ability.FLASH_FIRE), Ability.MOTOR_DRIVE,
                16, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.FIRE_SPIN,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.GROWL,9),
                        new MoveLearnSetEntry(Move.SPARK,12),
                        new MoveLearnSetEntry(Move.INCINERATE,16),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,19),
                        new MoveLearnSetEntry(Move.BLOCK,21),
                        new MoveLearnSetEntry(Move.FLAME_BURST,25),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,28),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,30),
                        new MoveLearnSetEntry(Move.POISON_JAB,33),
                        new MoveLearnSetEntry(Move.SHELL_TRAP,37),
                        new MoveLearnSetEntry(Move.DISCHARGE,41),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,46),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,50),
                        new MoveLearnSetEntry(Move.THUNDER,55)                  ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Valvette");

    }


}
