package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Delflauge extends drai.dev.gravelmon.pokemon.Pokemon {
    public Delflauge() {
        super("Delflauge",
                Type.WATER, Type.PSYCHIC,
                new Stats(80,
                        80,
                        80,
                        80,
                        80,
                        80),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 0,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("delfraxion", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(           new MoveLearnSetEntry(Move.FLIP_TURN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,11),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.ECHOLOCATE,20),
                        new MoveLearnSetEntry(Move.FROST_BREATH,26),
                        new MoveLearnSetEntry(Move.LIQUIDATION,31),
                        new MoveLearnSetEntry(Move.BODY_SLAM,37),
                        new MoveLearnSetEntry(Move.SAFEGUARD,42),
                        new MoveLearnSetEntry(Move.SUPERPOWER,48),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,52)            ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 19, 31, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COAST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_BEACH))),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);

    }


}
