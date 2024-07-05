package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tendurse extends drai.dev.data.pokemon.Pokemon {
    public Tendurse() {
        super("Tendurse",
                Type.PSYCHIC, Type.POISON,
                new Stats(120,
                        20,
                        20,
                        35,
                        30,
                        48),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("charmacist", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(     new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,11),
                        new MoveLearnSetEntry(Move.DISABLE,13),
                        new MoveLearnSetEntry(Move.PSYBEAM,16),
                        new MoveLearnSetEntry(Move.SLUDGE,19),
                        new MoveLearnSetEntry(Move.TELEPORT,23),
                        new MoveLearnSetEntry(Move.TRICK,27),
                        new MoveLearnSetEntry(Move.EXPANDING_FORCE,29),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,34),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,37),
                        new MoveLearnSetEntry(Move.SPOTLIGHT,40),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,42),
                        new MoveLearnSetEntry(Move.STORED_POWER,46),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,49),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,54)                   ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Tendurse");

    }


}
