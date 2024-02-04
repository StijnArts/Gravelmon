package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Draftbee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Draftbee() {
        super("Draftbee",
                Type.BUG,Type.FLYING,
                new Stats(50,
                        75,
                        92,
                        55,
                        65,
                        80),
                List.of(Ability.HEATPROOF,Ability.SWARM,Ability.HUSTLE), Ability.HUSTLE,
                13, 165,
                new Stats(0,0,0,0,0,0), 190,
                1.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Loyal to their queen, Draftbee works in great numbers to protect their hive. When gathered in large quantities, their body temperature may rise and burn their foe. They used to be enemies of Beedrill; until they were driven to extinction in all of Norheim."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,8),
                        new MoveLearnSetEntry(Move.FELL_STINGER,12),
                        new MoveLearnSetEntry(Move.SWAGGER,20),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,24),
                        new MoveLearnSetEntry(Move.ACROBATICS,28),
                        new MoveLearnSetEntry(Move.SEED_BOMB,32),
                        new MoveLearnSetEntry(Move.TAUNT,36),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,40),
                        new MoveLearnSetEntry(Move.LUNGE,44),
                        new MoveLearnSetEntry(Move.MEMENTO,50)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Draftbee");
setCanFly(true);
    }


}
