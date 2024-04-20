package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Exoroknid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Exoroknid() {
        super("Exoroknid",
                Type.ROCK, Type.BUG,
                new Stats(60,
                        100,
                        80,
                        65,
                        90,
                        100),
                List.of(Ability.TECHNICIAN,Ability.STURDY,Ability.COMPOUND_EYES), Ability.COMPOUND_EYES,
                18, 165,
                new Stats(0,1,0,0,0,1), 45,
                0.5,
                177, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Exoroknid dwell deep in caves. Their eyes are very well adapted to the dark which allows them to hunt stealthily. They drill holes to hide in or make traps on the cave floor for prey to fall in."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,6),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,13),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,17),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,22),
                        new MoveLearnSetEntry(Move.BUG_BITE,25),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,30),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,34),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,36),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,41),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46),
                        new MoveLearnSetEntry(Move.UTURN,52),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,57),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"tm"),
                        new MoveLearnSetEntry(Move.HEMODRAIN,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.TOMBSTONER,"tm")                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 40, 64, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Exoroknid");

    }


}
