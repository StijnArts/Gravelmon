package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Armanzer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Armanzer() {
        super("Armanzer",
                Type.BUG,Type.STEEL,
                new Stats(95,
                        95,
                        195,
                        50,
                        70,
                        20),
                List.of(Ability.BULLETPROOF,Ability.HEAVY_METAL,Ability.SKILL_LINK), Ability.SKILL_LINK,
                8, 165,
                new Stats(0,0,2,0,0,0), 55,
                0.5,
                190, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It can fire rocks out of its cannon horn, those rocks are coated on a grainy substance similar to gunpowder that explodes on heavy impact."),
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
           setLangFileName("Armanzer");

    }


}
