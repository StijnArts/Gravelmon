package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Slickle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Slickle() {
        super("Slickle",
                Type.FIGHTING,
                new Stats(55,
                        75,
                        75,
                        55,
                        35,
                        45),
                List.of(Ability.RATTLED,Ability.SHED_SKIN,Ability.STEELWORKER), Ability.STEELWORKER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("When frightened, Slickle looses its tail. Over time, the tail will grow back. However, it will become fragile during the recovery process; risking experiencing hypothermia."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,4),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,8),
                        new MoveLearnSetEntry(Move.MUDSLAP,12),
                        new MoveLearnSetEntry(Move.DETECT,16),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,22),
                        new MoveLearnSetEntry(Move.COIL,26),
                        new MoveLearnSetEntry(Move.COUNTER,32),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,38),
                        new MoveLearnSetEntry(Move.IRON_TAIL,44),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,50),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SUBMISSION,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Slickle");

    }


}
