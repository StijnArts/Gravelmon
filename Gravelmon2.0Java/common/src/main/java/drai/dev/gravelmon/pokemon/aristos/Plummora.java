package drai.dev.gravelmon.pokemon.aristos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Plummora extends drai.dev.gravelmon.pokemon.Pokemon {
    public Plummora() {
        super("Plummora",
                Type.FAIRY,Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.OWN_TEMPO,Ability.DAZZLING,Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("When it spreads out the feathers around its neck, they refract light to create a brilliant bluish green glow. It uses this ability mainly for elaborate mating dances. This flower-like orientation of feathers is oddly similar to Glimmora which gave it its name."),
                List.of(),
                List.of(                        ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Plummora");

    }


}
