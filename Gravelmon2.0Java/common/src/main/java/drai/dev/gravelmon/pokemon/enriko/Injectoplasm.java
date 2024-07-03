package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Injectoplasm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Injectoplasm() {
        super("Injectoplasm",
                Type.POISON, Type.GHOST,
                new Stats(65,
                        100,
                        35,
                        130,
                        90,
                        60),
                List.of(Ability.POISON_POINT), Ability.CLEAR_BODY,
                13, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.6,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its body contains a woopertail of hideous bloodborne illnesses. Entire towns can be shut down because of Injectoplasm sightings."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,7),
                        new MoveLearnSetEntry(Move.PECK,10),
                        new MoveLearnSetEntry(Move.ACID,12),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,20),
                        new MoveLearnSetEntry(Move.GLARE,24),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,26),
                        new MoveLearnSetEntry(Move.SLUDGE,30),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,36),
                        new MoveLearnSetEntry(Move.VENOSHOCK,40),
                        new MoveLearnSetEntry(Move.MEGAHORN,44),
                        new MoveLearnSetEntry(Move.HORN_DRILL,50)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 32, 56, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
