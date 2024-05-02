package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Chantarule extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chantarule() {
        super("Chantarule",
                Type.STEEL, Type.GRASS,
                new Stats(65,
                        86,
                        65,
                        92,
                        75,
                        95),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,5),
                        new MoveLearnSetEntry(Move.VINE_WHIP,10),
                        new MoveLearnSetEntry(Move.SPORE,15),
                        new MoveLearnSetEntry(Move.METAL_CLAW,18),
                        new MoveLearnSetEntry(Move.INGRAIN,21),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,24),
                        new MoveLearnSetEntry(Move.GROWTH,27),
                        new MoveLearnSetEntry(Move.DIG,30),
                        new MoveLearnSetEntry(Move.IRON_HEAD,35),
                        new MoveLearnSetEntry(Move.LOCKON,39),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,42)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 37, 57, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chantarule");

    }


}
