package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Lampent extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lampent(int dex) {
        super(dex, "Lampent",
                Type.FIRE, Type.GHOST,
                new Stats(75,
                        45,
                        65,
                        95,
                        65,
                        65),
                List.of(Ability.FLASH_FIRE,Ability.FLAME_BODY), Ability.INFILTRATOR,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.35,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("In the cities of Nodorro Lampent can be found instead of regular lampposts. Lampent live in full harmony with the inhabitants of that city."),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lampent");

    }


}
