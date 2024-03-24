package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Fifii extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fifii() {
        super("Fifii",
                Type.FAIRY,Type.FIGHTING,
                new Stats(88,
                        120,
                        95,
                        70,
                        85,
                        102),
                List.of(Ability.LONG_REACH), Ability.LONG_REACH,
                12, 165,
                new Stats(0,2,0,0,0,1), 3,
                0.0,
                270, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("The spirit of a solitary but joyful girl. Fifii brings happiness among both children and Pokemon. She is incredibly strong and can carry a Sleepnir with her braid-like arms."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.WORK_UP,14),
                        new MoveLearnSetEntry(Move.WRING_OUT,24),
                        new MoveLearnSetEntry(Move.ACROBATICS,30),
                        new MoveLearnSetEntry(Move.PLAY_NICE,36),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,42),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,52),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,62),
                        new MoveLearnSetEntry(Move.SUPERPOWER,72)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fifii");

    }


}
