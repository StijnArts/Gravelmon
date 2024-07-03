package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Crynorawst extends Pokemon {
    public Crynorawst() {
        super("Crynorawst",
                Type.ICE, Type.ROCK,
                new Stats(110,
                        100,
                        100,
                        70,
                        60,
                        90),
                List.of(Ability.ABSOLUTE_ZERO, Ability.ROCK_HEAD), Ability.RECKLESS,
                19, 1200,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Crynorawst are selfless, thinking only of others in a time of need. In Kaskadian mythology, a herd of Crynorawst were said to have moved mountains using their impressive horns."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,1),
                        new MoveLearnSetEntry(Move.SMOG,4),
                        new MoveLearnSetEntry(Move.TAUNT,7),
                        new MoveLearnSetEntry(Move.ASSURANCE,10),
                        new MoveLearnSetEntry(Move.ICE_BALL,13),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,17),
                        new MoveLearnSetEntry(Move.HEADBUTT,21),
                        new MoveLearnSetEntry(Move.SCREECH,25),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,28),
                        new MoveLearnSetEntry(Move.MEGAHORN,32),
                        new MoveLearnSetEntry(Move.BLIZZARD,36),
                        new MoveLearnSetEntry(Move.STONE_EDGE,41),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,50),
                        new MoveLearnSetEntry(Move.SANDSTORM,"egg"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"egg")
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 30, 49, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
