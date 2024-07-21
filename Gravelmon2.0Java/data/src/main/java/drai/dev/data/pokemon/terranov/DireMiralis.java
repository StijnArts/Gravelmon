package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class DireMiralis extends drai.dev.data.pokemon.Pokemon {
    public DireMiralis(Stats stats) {
        super("DireMiralis",
                Type.FIRE, Type.WATER,
                stats,
                List.of(Ability.REGENERATOR), Ability.REGENERATOR,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Some legends consider this great dragon to be the devil fated to destroy the world, while others claim it is the giant who birthed creation. Is there any way for mere humans to quell its unending rage?"),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dire Miralis");

    }


}
