package drai.dev.gravelmon.pokemon.pastelisland;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Kelviper extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kelviper() {
        super("Kelviper",
                Type.WATER, Type.ICE,
                new Stats(120,
                        70,
                        115,
                        80,
                        85,
                        60),
                List.of(Ability.TORRENT), Ability.DRIZZLE,
                37, 710,
                new Stats(3,0,0,0,0,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Slow and bulky, Kelviper hunt in the deepest of waters, but on land, can freeze the ground under them to move and hunt faster."),
                List.of(),
                List.of(                        ),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kelviper");

    }


}
