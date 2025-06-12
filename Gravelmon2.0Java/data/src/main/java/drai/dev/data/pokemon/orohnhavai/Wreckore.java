package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Wreckore extends drai.dev.data.pokemon.Pokemon {
    public Wreckore() {
        super("Wreckore",
                Type.DARK, Type.FIGHTING,
                new Stats(95,
                        130,
                        80,
                        65,
                        80,
                        55),
                List.of(Ability.RIVALRY,Ability.NO_GUARD,Ability.IRON_FIST), Ability.IRON_FIST,
                15, 165,
                new Stats(1,2,0,0,0,0), 45,
                0.75,
                227, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Wreckore are one of the bravest, daring Pokemon out there and are very protective of its allies and trainers. They easily knockout their foes with a strike from their powerful arms. They still have anger issues."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,1),
                        new MoveLearnSetEntry(Move.BIDE,4),
                        new MoveLearnSetEntry(Move.LOW_KICK,8),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,11),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,14),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,18),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,22),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,27),
                        new MoveLearnSetEntry(Move.BULK_UP,30),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,34),
                        new MoveLearnSetEntry(Move.ENDURE,37),
                        new MoveLearnSetEntry(Move.MAT_BLOCK,39),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,43),
                        new MoveLearnSetEntry(Move.FAKE_OUT,46),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,50),
                        new MoveLearnSetEntry(Move.THRASH,52),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,57),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.REVENGE,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(39)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HIGHLANDS)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Wreckore");

    }


}
