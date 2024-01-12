package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Meraculisk extends Pokemon {
    public Meraculisk() {
        super("Meraculisk",
                Type.STEEL, Type.POISON,
                new Stats(125,
                        70,
                        80,
                        105,
                        80,
                        80),
                List.of(Ability.CORROSION, Ability.POWER_OF_ALCHEMY), Ability.POWER_WITHIN,
                23, 1718,
                new Stats(3,0,0,0,0,0), 30,
                0.5,
                267, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("This Pokemon has gone under rigorous training to overcome even it's darkest fears and has mastered the manipulation of it's poison."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.TAUNT,7),
                        new MoveLearnSetEntry(Move.ASSURANCE,10),
                        new MoveLearnSetEntry(Move.SLUDGE,13),
                        new MoveLearnSetEntry(Move.GYRO_BALL,17),
                        new MoveLearnSetEntry(Move.HEADBUTT,21),
                        new MoveLearnSetEntry(Move.SCREECH,25),
                        new MoveLearnSetEntry(Move.IRON_HEAD,28),
                        new MoveLearnSetEntry(Move.SWAGGER,32),
                        new MoveLearnSetEntry(Move.POISON_JAB,36),
                        new MoveLearnSetEntry(Move.UPROAR,41),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,50),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.TOXIC,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 47, 67, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false"),
                        new SpawnCondition(SpawnConditionType.MAXY,"-20")
                ), List.of(),
                List.of(SpawnPreset.UNDERGROUND),
                0.28, 0.3,
                List.of());
    }
}
