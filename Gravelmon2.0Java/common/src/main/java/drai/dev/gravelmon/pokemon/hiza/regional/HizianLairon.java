package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianLairon extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianLairon() {
        super("Lairon",
                Type.GROUND,Type.ROCK,
                new Stats(60,
                        100,
                        130,
                        50,
                        50,
                        40),
                List.of(Ability.SHEER_FORCE), Ability.BATTLE_ARMOR,
                8, 165,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                151, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Other Pokémon refrain from attacking Lairon due to its large intimidating horns. Because of that, it usually ends up growing lazy and unfazed by danger."),
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
           setLangFileName("Lairon");

    }


}
