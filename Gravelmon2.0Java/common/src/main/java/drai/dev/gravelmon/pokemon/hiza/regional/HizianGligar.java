package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianGligar extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianGligar() {
        super("Gligar",
                Type.ICE,Type.FLYING,
                new Stats(65,
                        75,
                        105,
                        35,
                        65,
                        85),
                List.of(Ability.ICE_SCALES), Ability.ICE_SCALES,
                8, 165,
                new Stats(0,0,1,0,0,0), 60,
                0.5,
                86, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("As it glides through the air, the floor bellow it is covered with rime. Its long icy claws allow it to pick up slippery frozen objects with ease."),
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
           setLangFileName("Gligar");

    }


}
