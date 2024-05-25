package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Manecore extends drai.dev.gravelmon.pokemon.Pokemon {
    public Manecore() {
        super("Manecore",
                Type.POISON, Type.FLYING,
                new Stats(60,
                        100,
                        70,
                        95,
                        90,
                        80),
                List.of(Ability.POISON_TOUCH,Ability.SHEER_FORCE,Ability.SNIPER), Ability.SNIPER,
                16, 165,
                new Stats(0,2,0,1,0,0), 45,
                0.5,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It slowly soars under the moonlight to heal its wounds. Manecore's venom has different symptoms with each and every sting."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.POISON_STING,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,13),
                        new MoveLearnSetEntry(Move.POISON_TAIL,17),
                        new MoveLearnSetEntry(Move.ROAR,21),
                        new MoveLearnSetEntry(Move.ASSIST,25),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,28),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,33),
                        new MoveLearnSetEntry(Move.POISON_JAB,37),
                        new MoveLearnSetEntry(Move.EMBARGO,41),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,45)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 55, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Manecore");

    }


}
