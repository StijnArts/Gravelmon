package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Ribikun extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ribikun() {
        super("Ribikun",
                Type.GROUND,
                new Stats(60,
                        55,
                        55,
                        60,
                        70,
                        45),
                List.of(Ability.DRY_SKIN,Ability.RAINBOON), Ability.ADAPTABILITY,
                6, 64,
                new Stats(0,0,0,0,1,0), 45,
                0.0,
                69, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.MONSTER),
                List.of("It can sit for days waiting for prey. When demoisturized, its body becomes rigid like a statue. It prefers shade, suggesting the dry environment it dwells in was once upon a time more lush."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ribikun");

    }


}
