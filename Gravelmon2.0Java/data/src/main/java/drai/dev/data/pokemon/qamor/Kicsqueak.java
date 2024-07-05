package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Kicsqueak extends drai.dev.data.pokemon.Pokemon {
    public Kicsqueak() {
        super("Kicsqueak",
                Type.GROUND, Type.FIGHTING,
                new Stats(43,
                        35,
                        46,
                        20,
                        36,
                        68),
                List.of(Ability.GUTS), Ability.JUMPIN,
                5, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Kicsqueak have incredibly powerful legs that allow them to jump over 10 meters horizontally with a single kick- which comes in handy for quick getaways when they are confronted by predators."),
                List.of(new EvolutionEntry("aggroroo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.STOMP,9),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,15),
                        new MoveLearnSetEntry(Move.BLOCK,17),
                        new MoveLearnSetEntry(Move.HYPER_FANG,20),
                        new MoveLearnSetEntry(Move.WORK_UP,24),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,26),
                        new MoveLearnSetEntry(Move.TRIPLE_KICK,30),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,34),
                        new MoveLearnSetEntry(Move.MEGA_KICK,40),
                        new MoveLearnSetEntry(Move.JUMP_KICK,45),
                        new MoveLearnSetEntry(Move.BOUNCE,48),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BLAZE_KICK,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 22, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT, Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kicsqueak");

    }


}
