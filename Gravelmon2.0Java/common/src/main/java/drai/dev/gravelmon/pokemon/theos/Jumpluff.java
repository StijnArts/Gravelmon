package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Jumpluff extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jumpluff() {
        super("Jumpluff",
                Type.GROUND,Type.GRASS,
                new Stats(110,
                        55,
                        70,
                        55,
                        95,
                        75),
                List.of(Ability.HARVEST), Ability.DRY_SKIN,
                16, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Jumpluff spend their time watching over fields by standing on their wood like tail. They do this to keep away bird Pokémon from feeding on the harvest."),
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
           setLangFileName("Jumpluff");

    }


}
