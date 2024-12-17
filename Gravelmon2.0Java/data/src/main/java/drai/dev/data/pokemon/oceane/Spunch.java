package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Spunch extends drai.dev.data.pokemon.Pokemon {
    public Spunch() {
        super("Spunch",
                Type.FIGHTING,
                new Stats(46,
                        45,
                        62,
                        36,
                        56,
                        45),
                List.of(Ability.WATER_ABSORB), Ability.REFLEXSTRIKE,
                5, 165,
                new Stats(1,1,0,0,0,0), 100,
                1.0,
                58, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("By filling its fists with water, it can expand its punches to incredible proportions. Unfortunately, they still cause little damage. It's true power lies in absorbing damage within its springy body."),
                List.of(new EvolutionEntry("upporecut", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"29")))),
                List.of(         new MoveLearnSetEntry(Move.HEAD_CHARGE,1),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,1),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,1),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,1),
                        new MoveLearnSetEntry(Move.HYDRO_PUNCH,1),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,1),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,1),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,1),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,1),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,1),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,1),
                        new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.RECOVER,1),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,1),
                        new MoveLearnSetEntry(Move.BULK_UP,1)),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 3, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
