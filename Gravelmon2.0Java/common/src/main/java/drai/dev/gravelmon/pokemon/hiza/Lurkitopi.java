package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Lurkitopi extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lurkitopi() {
        super("Lurkitopi",
                Type.GHOST,Type.WATER,
                new Stats(45,
                        75,
                        40,
                        65,
                        50,
                        50),
                List.of(Ability.WONDER_SKIN), Ability.SHADOW_TAG,
                8, 165,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("By covers its body with black ink it becomes completely invisible in the dark waters, it's said that those sprayed with this ink will slowly disappear forever."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lurkitopi");

    }


}
