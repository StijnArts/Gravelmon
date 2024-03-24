package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Albacross extends drai.dev.gravelmon.pokemon.Pokemon {
    public Albacross() {
        super("Albacross",
                Type.WATER,Type.FLYING,
                new Stats(100,
                        70,
                        68,
                        122,
                        70,
                        95),
                List.of(Ability.LIGHTNING_ROD), Ability.LIGHTNING_ROD,
                19, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.PECK,6),
                        new MoveLearnSetEntry(Move.WATER_GUN,10),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,15),
                        new MoveLearnSetEntry(Move.AQUA_JET,19),
                        new MoveLearnSetEntry(Move.BITE,24),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,28),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,33),
                        new MoveLearnSetEntry(Move.GLARE,37),
                        new MoveLearnSetEntry(Move.CRUNCH,42)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.RARE, 33, 49, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setCanFly(true);

    }


}
