package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Tyragaan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tyragaan() {
        super("Tyragaan",
                Type.GRASS, Type.LIGHT,
                new Stats(91,
                        124,
                        90,
                        85,
                        64,
                        101),
                List.of(Ability.FLUORESCENCE), Ability.FLUORESCENCE,
                36, 1032,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                221, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.GRASS),
                List.of(""),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.BULLET_SEED,12),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,22),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,25),
                        new MoveLearnSetEntry(Move.NATURE_POWER,27),
                        new MoveLearnSetEntry(Move.ENDEAVOR,33),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,37),
                        new MoveLearnSetEntry(Move.LEAF_STORM,42),
                        new MoveLearnSetEntry(Move.POWER_WHIP,49)                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 31, 46, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tyragaan");

    }


}
