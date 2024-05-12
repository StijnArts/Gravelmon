package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Bombull extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bombull() {
        super("Bombull",
                Type.FIRE, Type.STEEL,
                new Stats(80,
                        70,
                        95,
                        55,
                        75,
                        45),
                List.of(Ability.BLAZE), Ability.HEAVY_METAL,
                14, 520,
                new Stats(0,0,2,0,0,0), 45,
                0.75,
                142, ExperienceGroup.MEDIUM_SLOW,
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
           setLangFileName("Bombull");

    }


}
