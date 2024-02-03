package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Polynett extends drai.dev.gravelmon.pokemon.Pokemon {
    public Polynett() {
        super("Polynett",
                Type.WATER,
                new Stats(40,
                        55,
                        75,
                        50,
                        65,
                        40),
                List.of(Ability.DAMP), Ability.REELIN,
                6, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It drifts languidly in the ocean in big groups. When a small Pokemon approaches it quickly captures it with its tentacles."),
                List.of(new EvolutionEntry("polyzap", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,5),
                        new MoveLearnSetEntry(Move.BIND,8),
                        new MoveLearnSetEntry(Move.DISABLE,12),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,15),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,19),
                        new MoveLearnSetEntry(Move.ELECTROWEB,23),
                        new MoveLearnSetEntry(Move.WATER_PULSE,26),
                        new MoveLearnSetEntry(Move.AQUA_RING,29),
                        new MoveLearnSetEntry(Move.ENSNARE,33),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,36),
                        new MoveLearnSetEntry(Move.RECYCLE,40),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,45),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,52),
                        new MoveLearnSetEntry(Move.WRING_OUT,59),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 3, 22, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
