package drai.dev.gravelmon.pokemon.orohnhavai.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class HavaiianGengar extends drai.dev.gravelmon.pokemon.Pokemon {
    public HavaiianGengar() {
        super("Gengar",
                Type.GHOST,Type.FIRE,
                new Stats(60,
                        60,
                        75,
                        130,
                        65,
                        110),
                List.of(Ability.FLAME_BODY), Ability.FLAME_BODY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("If you suddenly feel an intense heat rushing through your body, it may be this variant of Gengar hiding in your shadow, stealing your life force. You may feel chilled afterward. It constantly feeds on energy to keep the fire on its head burning. This is their life force. With no energy to feed on, the fire will weaken and eventually die out. Gengar will cease to exist."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gengar");

    }


}
