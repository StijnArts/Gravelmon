package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Bullit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bullit() {
        super("Bullit",
                Type.FIRE,
                new Stats(60,
                        55,
                        65,
                        50,
                        55,
                        40),
                List.of(Ability.BLAZE), Ability.ANGER_POINT,
                6, 60,
                new Stats(0,0,1,0,0,0), 45,
                0.75,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bullit");

    }


}
