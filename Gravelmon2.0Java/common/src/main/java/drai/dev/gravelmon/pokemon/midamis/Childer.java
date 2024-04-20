package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Childer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Childer() {
        super("Childer",
                Type.ICE, Type.FLYING,
                new Stats(40,
                        35,
                        65,
                        65,
                        55,
                        55),
                List.of(Ability.EARLY_BIRD), Ability.REGENERATOR,
                4, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Sweet, chirpy Pokemon that are seen only at winter in the cold snow where they nestle together in straw nests high up in trees. Small enough to perch on your hand, Childer are great pets and love nothing better than sitting by a fire in the winter cold."),
                List.of(new EvolutionEntry("norewin", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.GUST,10),
                        new MoveLearnSetEntry(Move.ICY_WIND,13),
                        new MoveLearnSetEntry(Move.SING,17),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,22),
                        new MoveLearnSetEntry(Move.FROST_BREATH,26),
                        new MoveLearnSetEntry(Move.WING_ATTACK,30),
                        new MoveLearnSetEntry(Move.ROOST,35),
                        new MoveLearnSetEntry(Move.AVALANCHE,40),
                        new MoveLearnSetEntry(Move.SCREECH,43),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,49),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,53)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 4, 26, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
