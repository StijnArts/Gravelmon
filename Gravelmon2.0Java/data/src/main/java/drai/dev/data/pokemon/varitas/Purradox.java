package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Purradox extends drai.dev.data.pokemon.Pokemon {
    public Purradox(Stats stats) {
        super("Purradox",
                Type.NORMAL, Type.GHOST,
                stats,
                List.of(Ability.CONTRARY,Ability.CURSED_BODY,Ability.SCRAPPY), Ability.SCRAPPY,
                12, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Purradox were originally created as an artificial domestic companion pokemon. However at some point, the data used to create them became corrupted and the project was abandoned. They eventually escaped and multiplied, exhibiting very strange and erratic behavior due to the corruption like inexplicably vanishing in an instant."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.TORMENT,4),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,8),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,12),
                        new MoveLearnSetEntry(Move.CURSE,16),
                        new MoveLearnSetEntry(Move.TAUNT,20),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,24),
                        new MoveLearnSetEntry(Move.SPITE,28),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,36),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,40),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,44)
                ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 32, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Purradox");

    }


}
