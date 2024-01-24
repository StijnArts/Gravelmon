package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Rivestic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rivestic() {
        super("Rivestic",
                Type.WATER,
                new Stats(66,
                        62,
                        62,
                        80,
                        76,
                        74),
                List.of(Ability.TORRENT), Ability.WATER_ABSORB,
                8, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                147, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.WATER_1),
                List.of("It can be seem at river mouths or wetlands. Its sole presence will calm down the water torrents."),
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
           setLangFileName("Rivestic");

    }


}
