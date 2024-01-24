package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Merluscious extends drai.dev.gravelmon.pokemon.Pokemon {
    public Merluscious() {
        super("Merluscious",
                Type.ROCK,Type.POISON,
                new Stats(61,
                        104,
                        64,
                        99,
                        59,
                        83),
                List.of(Ability.DISGUISE), Ability.DISGUISE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                165, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("- Poison StingSTAB Poison - Harden Normal 15 Fury Attack Normal 20 Acid Armor Poison 30 Draining Kiss Fairy 35 Reef Barrier Rock 40 VenoshockSTAB Poison"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,20),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,30),
                        new MoveLearnSetEntry(Move.REEFBARRIER,35),
                        new MoveLearnSetEntry(Move.VENOSHOCK,40),
                        new MoveLearnSetEntry(Move.LIQUEFACTION,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Merluscious");

    }


}
