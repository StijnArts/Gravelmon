package drai.dev.gravelmon.pokemon.mystis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Lamprobe extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lamprobe() {
        super("Lamprobe",
                Type.GRASS, Type.PSYCHIC,
                new Stats(140,
                        60,
                        65,
                        115,
                        100,
                        25),
                List.of(Ability.STICKY_HOLD), Ability.GOOEY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Wood HammerSTAB Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lamprobe");

    }


}
