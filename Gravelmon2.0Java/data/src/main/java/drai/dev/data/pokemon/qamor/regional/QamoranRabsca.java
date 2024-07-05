package drai.dev.data.pokemon.qamor.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class QamoranRabsca extends drai.dev.data.pokemon.Pokemon {
    public QamoranRabsca(String name, Aspect aspect) {
        super(name, aspect, "Rabsca",
                Type.GROUND, Type.PSYCHIC,
                new Stats(75,
                        50,
                        100,
                        115,
                        85,
                        45),
                List.of(Ability.LEVITATE), Ability.TELEPATHY,
                6, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                165, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Recover Normal Memento Dark Weather Ball Normal Cosmic Power Psychic"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.TELEPORT,1),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,9),
                        new MoveLearnSetEntry(Move.POWER_TRICK,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,15),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,18),
                        new MoveLearnSetEntry(Move.IMPRISON,21),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,24),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,27),
                        new MoveLearnSetEntry(Move.EARTH_POWER,30),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,33),
                        new MoveLearnSetEntry(Move.GUARD_SPLIT,38),
                        new MoveLearnSetEntry(Move.POWER_SPLIT,38),
                        new MoveLearnSetEntry(Move.SANDSTORM,43),
                        new MoveLearnSetEntry(Move.EXPLOSION,48)
                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rabsca");
        addAdditionalEvolution("rellor", new EvolutionEntry("rabsca qamoran", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,"\""+ Biome.IS_SPOOKY.getId() + ":" + Biome.IS_SPOOKY.getName() +"\""),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BLOCKS_TRAVELED,"1000"))));

    }


}
