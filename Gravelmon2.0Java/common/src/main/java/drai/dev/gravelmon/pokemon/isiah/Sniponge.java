package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sniponge extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sniponge() {
        super("Sniponge",
                Type.WATER,
                new Stats(71,
                        114,
                        93,
                        82,
                        61,
                        71),
                List.of(Ability.SNIPER,Ability.WATER_ABSORB,Ability.WATER_VEIL), Ability.WATER_VEIL,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                221, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.WATER_1),
                List.of("Its shell is covered by a very versatile spongy material: it is very soft if it is swollen with water, while it is very compact if dry."),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sniponge");

    }


}
