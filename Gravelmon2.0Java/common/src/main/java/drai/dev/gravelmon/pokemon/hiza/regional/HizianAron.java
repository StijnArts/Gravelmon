package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianAron extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianAron() {
        super("Aron",
                Type.GROUND,Type.ROCK,
                new Stats(50,
                        70,
                        100,
                        40,
                        40,
                        30),
                List.of(Ability.SHEER_FORCE), Ability.BATTLE_ARMOR,
                8, 165,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                66, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Its horns are used to defend itself since it doesn't live in groups unlike its mountain counterparts. When the night comes, it buries itself in the sand to avoid the freezing temperatures."),
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
           setLangFileName("Aron");

    }


}
