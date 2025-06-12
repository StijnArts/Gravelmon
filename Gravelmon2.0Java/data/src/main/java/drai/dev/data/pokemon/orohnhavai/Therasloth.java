package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Therasloth extends drai.dev.data.pokemon.Pokemon {
    public Therasloth() {
        super("Therasloth",
                Type.ROCK, Type.NORMAL,
                new Stats(77,
                        68,
                        57,
                        51,
                        57,
                        40),
                List.of(Ability.TOUGH_CLAWS,Ability.RUN_AWAY,Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                8, 165,
                new Stats(1,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Therasloth are awfully lazy, and never lift a finger unless their life is threatened. They can sleep for an upwards of 20 hours. With their tough claws, they hallow out trees to store their food in preparation for scarce winters."),
                List.of(new EvolutionEntry("slotherror", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"43")))),
                List.of(       new MoveLearnSetEntry(Move.CRUSH_CLAW,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.HARDEN,4),
                        new MoveLearnSetEntry(Move.LICK,7),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,10),
                        new MoveLearnSetEntry(Move.MUDSLAP,14),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,17),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,20),
                        new MoveLearnSetEntry(Move.BUG_BITE,24),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,24),
                        new MoveLearnSetEntry(Move.MUDSLIDE,28),
                        new MoveLearnSetEntry(Move.SLASH,32),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,37),
                        new MoveLearnSetEntry(Move.DIG,41),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,45),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,50),
                        new MoveLearnSetEntry(Move.CURSE,54),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,58)                 ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Therasloth");

    }


}
