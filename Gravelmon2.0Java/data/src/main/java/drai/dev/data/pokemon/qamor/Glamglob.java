package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Glamglob extends drai.dev.data.pokemon.Pokemon {
    public Glamglob() {
        super("Glamglob",
                Type.WATER,
                new Stats(80,
                        98,
                        88,
                        80,
                        80,
                        54),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Glamglob Grotesque Form are used to living under immense ocean pressure, so when its removed from these situations it will completely dissociate with itself and flop into a flimsy and slimy mess loosing almost all of it's psychic potential and ability."),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,6),
                        new MoveLearnSetEntry(Move.SUPERSONIC,8),
                        new MoveLearnSetEntry(Move.AQUA_JET,11),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.ECHOLOCATE,18),
                        new MoveLearnSetEntry(Move.FROST_BREATH,22),
                        new MoveLearnSetEntry(Move.LIQUIDATION,25),
                        new MoveLearnSetEntry(Move.BODY_SLAM,29),
                        new MoveLearnSetEntry(Move.SAFEGUARD,32),
                        new MoveLearnSetEntry(Move.SUPERPOWER,36)             ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 13, 34, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glamglob");

    }


}
