package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Akrovern extends drai.dev.data.pokemon.Pokemon {
    public Akrovern() {
        super("Akrovern",
                Type.DRAGON, Type.STEEL,
                new Stats(90,
                        120,
                        110,
                        85,
                        85,
                        60),
                List.of(Ability.RIVALRY,Ability.BATTLE_ARMOR,Ability.STURDY), Ability.STURDY,
                8, 165,
                new Stats(0,2,1,0,0,0), 30,
                0.667,
                243, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Akrovern are vicious and aggressive towards anyone in their way and are so hard to tame hardly anyone has one, but those able to control this powerful beast should be honored and respected for their achievement. During the medieval times of the Pokemon world, Akrovern was known to be one of the most powerful Dragon-type Pokemon in the world and could destroy an entire kingdom by itself when angered."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JAW_LOCK,1),
                        new MoveLearnSetEntry(Move.METAL_CLAW,6),
                        new MoveLearnSetEntry(Move.METAL_SOUND,10),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,14),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.ROAR,23),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,28),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,33),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,38),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,43),
                        new MoveLearnSetEntry(Move.CRUNCH,48),
                        new MoveLearnSetEntry(Move.IRON_TAIL,50),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,54),
                        new MoveLearnSetEntry(Move.OUTRAGE,59),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,65),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.METAL_BURST,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,"tm"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Akrovern");

    }


}
