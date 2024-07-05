package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Miragtra extends drai.dev.data.pokemon.Pokemon {
    public Miragtra() {
        super("Miragtra",
                Type.POISON, Type.PSYCHIC,
                new Stats(200,
                        45,
                        75,
                        75,
                        75,
                        5),
                List.of(Ability.ARENA_TRAP), Ability.ARENA_TRAP,
                16, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PSYCRUSH,1),
                        new MoveLearnSetEntry(Move.CROSS_POISON,1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.SONIC_BOOM,1),
                        new MoveLearnSetEntry(Move.PRISM_ATTACK,1),
                        new MoveLearnSetEntry(Move.DISABLE,6),
                        new MoveLearnSetEntry(Move.PSYWAVE,9),
                        new MoveLearnSetEntry(Move.SLUDGE,12),
                        new MoveLearnSetEntry(Move.DARK_HAND,17),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,20),
                        new MoveLearnSetEntry(Move.SHARPSHOOT,23),
                        new MoveLearnSetEntry(Move.COUNTER,28),
                        new MoveLearnSetEntry(Move.HYPNOPULSE,31),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,34),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,39),
                        new MoveLearnSetEntry(Move.VILE_VENOM,42),
                        new MoveLearnSetEntry(Move.MEDITATE,45),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50),
                        new MoveLearnSetEntry(Move.MARVEL_TRICK,53),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,56),
                        new MoveLearnSetEntry(Move.GRIMEBUSTER,61)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 35, 45, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Miragétra");

    }


}
