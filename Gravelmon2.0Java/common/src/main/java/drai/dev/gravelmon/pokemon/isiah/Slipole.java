package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Slipole extends drai.dev.gravelmon.pokemon.Pokemon {
    public Slipole() {
        super("Slipole",
                Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("As soon as they feel their home heating up, these Pokemon will migrate marching in a row until they reach a colder home."),
                List.of(new EvolutionEntry("pengoof", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.TICKLE,1),
                        new MoveLearnSetEntry(Move.PECK,4),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,7),
                        new MoveLearnSetEntry(Move.SWIFT,11),
                        new MoveLearnSetEntry(Move.ICY_WIND,14),
                        new MoveLearnSetEntry(Move.MIST,17),
                        new MoveLearnSetEntry(Move.TEMPEST,21),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,24),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,27),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,31),
                        new MoveLearnSetEntry(Move.TAILWIND,34),
                        new MoveLearnSetEntry(Move.DRILL_PECK,37),
                        new MoveLearnSetEntry(Move.ROOST,41),
                        new MoveLearnSetEntry(Move.BLIZZARD,44),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,47)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FROZEN_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Slipole");

    }


}
