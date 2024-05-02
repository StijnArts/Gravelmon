package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Floink extends drai.dev.gravelmon.pokemon.Pokemon {
    public Floink() {
        super("Floink",
                Type.FLYING,
                new Stats(140,
                        45,
                        45,
                        85,
                        75,
                        40),
                List.of(Ability.DRY_SKIN), Ability.DRY_SKIN,
                6, 165,
                new Stats(2,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.FIELD),
                List.of("It's body is squishy and light, and completely defenceless. Were it not for their popularity with children, they would probably long be extinct. A Floink preservation society exists to ensure the survival of their species."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WINDBLAST,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,1),
                        new MoveLearnSetEntry(Move.WHIRLWIND,1),
                        new MoveLearnSetEntry(Move.AIR_BUBBLE,1),
                        new MoveLearnSetEntry(Move.SWALLOW,1),
                        new MoveLearnSetEntry(Move.STOCKPILE,1),
                        new MoveLearnSetEntry(Move.SPIT_UP,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,1),
                        new MoveLearnSetEntry(Move.RECOVER,1),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,1),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,1),
                        new MoveLearnSetEntry(Move.SQUALL,1),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,1),
                        new MoveLearnSetEntry(Move.DEFOG,1),
                        new MoveLearnSetEntry(Move.OVERHEAT,1),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.TICKLE,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 13, 41, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Floink");

    }


}
