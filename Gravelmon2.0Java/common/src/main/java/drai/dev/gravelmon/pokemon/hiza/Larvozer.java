package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Larvozer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Larvozer() {
        super("Larvozer",
                Type.BUG,
                new Stats(80,
                        50,
                        120,
                        30,
                        50,
                        20),
                List.of(Ability.BULLETPROOF,Ability.HEAVY_METAL,Ability.SKILL_LINK), Ability.SKILL_LINK,
                8, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                77, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Larvozer's body has atleast 3 layers of armor protecting its body, the armor is so hard it can shrug off a direct hit from a cannonball."),
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
           setLangFileName("Larvozer");

    }


}
