package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Fleetade extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fleetade() {
        super("Fleetade",
                Type.WATER,
                new Stats(100,
                        60,
                        65,
                        50,
                        50,
                        65),
                List.of(Ability.TRIAGE), Ability.TELEPATHY,
                11, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("valiade", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:dawn_stone")),
                List.of(           new MoveLearnSetEntry(Move.DRAGON_PULSE,1),
                        new MoveLearnSetEntry(Move.HOWL,3),
                        new MoveLearnSetEntry(Move.ASTONISH,6),
                        new MoveLearnSetEntry(Move.WATER_GUN,12),
                        new MoveLearnSetEntry(Move.MIST,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,18),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,21),
                        new MoveLearnSetEntry(Move.BRINE,24),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,27),
                        new MoveLearnSetEntry(Move.DIVE,30),
                        new MoveLearnSetEntry(Move.BOUNCE,33),
                        new MoveLearnSetEntry(Move.BODY_SLAM,36),
                        new MoveLearnSetEntry(Move.REST,39),
                        new MoveLearnSetEntry(Move.AMNESIA,42),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,45),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,48)),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.RARE, 21, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
