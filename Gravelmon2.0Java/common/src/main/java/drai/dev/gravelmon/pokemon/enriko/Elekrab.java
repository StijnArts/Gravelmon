package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Elekrab extends drai.dev.gravelmon.pokemon.Pokemon {
    public Elekrab() {
        super("Elekrab",
                Type.ELECTRIC,
                new Stats(40,
                        65,
                        60,
                        50,
                        55,
                        35),
                List.of(Ability.POISON_TOUCH,Ability.SYNCHRONIZE,Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("It has two anemone Pokemon attached to its otherwise unimpressive claws. The anemones protect Elekrab with their paralyzing sting. (ability 1 - stinging cells. the pokemon's contact moves may paralyze)"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.ARM_THRUST,7),
                        new MoveLearnSetEntry(Move.ENDURE,10),
                        new MoveLearnSetEntry(Move.MUDSLAP,13),
                        new MoveLearnSetEntry(Move.SPARK,17),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,21),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,25),
                        new MoveLearnSetEntry(Move.BULK_UP,29),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,33),
                        new MoveLearnSetEntry(Move.DIG,37),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,40),
                        new MoveLearnSetEntry(Move.AMNESIA,46),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,51),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,56)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Elekrab");

    }


}
