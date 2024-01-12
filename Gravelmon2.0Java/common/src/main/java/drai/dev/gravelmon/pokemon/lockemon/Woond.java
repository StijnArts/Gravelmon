package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Woond extends Pokemon {
    public Woond() {
        super("Woond",
                Type.FIGHTING, Type.GHOST,
                new Stats(75,
                        115,
                        60,
                        85,
                        90,
                        100),
                List.of(Ability.SCRAPPY, Ability.JUSTIFIED), Ability.HAUNTING,
                15, 1255,
                new Stats(0,2,0,0,0,0), 190,
                0.5,
                160, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Back before the current era, a group of Woond saved many Kaskadian, Alolan, and Unovian soldiers in the Continental War. They are known for their bravery and intense perseverance."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENDURE,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.FEINT,4),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.COUNTER,12),
                        new MoveLearnSetEntry(Move.ICE_FANG,16),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,16),
                        new MoveLearnSetEntry(Move.FIRE_FANG,16),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,20),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,24),
                        new MoveLearnSetEntry(Move.SCREECH,28),
                        new MoveLearnSetEntry(Move.SHADOW_FORCE,32),
                        new MoveLearnSetEntry(Move.FORCE_PALM,36),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,40),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,44),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,48),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,52),
                        new MoveLearnSetEntry(Move.REVERSAL,56),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,"egg"),
                        new MoveLearnSetEntry(Move.DETECT,"egg"),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,"egg"),
                        new MoveLearnSetEntry(Move.HOWL,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 30, 58, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
