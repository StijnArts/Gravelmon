package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Whirlamari extends drai.dev.gravelmon.pokemon.Pokemon {
    public Whirlamari() {
        super("Whirlamari",
                Type.WATER,
                new Stats(72,
                        47,
                        66,
                        80,
                        79,
                        61),
                List.of(Ability.TORRENT), Ability.TRACE,
                10, 123,
                new Stats(0,0,0,1,1,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("It creates small whirlpools in the water with its tentacles as it propels itself forward. It is able to change the patterns of its body to resemble powerful Pokémon and intimidate predators."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Whirlamari");

    }


}
