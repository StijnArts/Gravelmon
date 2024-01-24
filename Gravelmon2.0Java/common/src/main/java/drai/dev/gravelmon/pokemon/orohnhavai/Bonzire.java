package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Bonzire extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bonzire() {
        super("Bonzire",
                Type.FIRE,Type.ELECTRIC,
                new Stats(75,
                        75,
                        60,
                        100,
                        60,
                        90),
                List.of(Ability.FLASH_FIRE,Ability.VOLT_ABSORB,Ability.MOTOR_DRIVE), Ability.MOTOR_DRIVE,
                8, 165,
                new Stats(0,0,0,2,0,0), 75,
                0.5,
                113, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Bonzire are always heated up for a battle. With the addition of its Electric-type, it is able to deliver powerful attacks onto its foes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.INCINERATE,1),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,41),
                        new MoveLearnSetEntry(Move.ELECTRO_BALL,46),
                        new MoveLearnSetEntry(Move.THUNDER,53),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.TICKLE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"tm")                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bonzire");

    }


}
