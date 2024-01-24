package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Maynoon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Maynoon() {
        super("Maynoon",
                Type.BUG,Type.FLYING,
                new Stats(70,
                        70,
                        50,
                        85,
                        50,
                        125),
                List.of(Ability.GALE_WINGS,Ability.CLOUD_NINE,Ability.SWIFTDODGE), Ability.SWIFTDODGE,
                8, 165,
                new Stats(0,0,0,0,0,2), 80,
                0.5,
                158, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It has the shortest period before evolution of any Pokemon. After congregating with others of its kind above the lake it was born in, it becomes dormant and falls into the water, all in the span of an hour."),
                List.of(),
                List.of(                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maynoon");

    }


}
