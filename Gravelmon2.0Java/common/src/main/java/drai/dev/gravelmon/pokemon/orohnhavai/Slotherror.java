package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Slotherror extends drai.dev.gravelmon.pokemon.Pokemon {
    public Slotherror() {
        super("Slotherror",
                Type.ROCK, Type.FIGHTING,
                new Stats(117,
                        108,
                        77,
                        61,
                        77,
                        55),
                List.of(Ability.TOUGH_CLAWS,Ability.ANGER_POINT,Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                17, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Colossloth are still as lazy as their unevolved counterpart, but are particularly vicious when awoken. Their claws can tear through boulders like butter."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.CRUSH_CLAW,1),
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
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 44, 54, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Slotherror");

    }


}
