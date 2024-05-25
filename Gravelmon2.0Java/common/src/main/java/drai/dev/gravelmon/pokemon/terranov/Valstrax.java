package drai.dev.gravelmon.pokemon.terranov;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Valstrax extends drai.dev.gravelmon.pokemon.Pokemon {
    public Valstrax() {
        super("Valstrax",
                Type.DRAGON, Type.FLYING,
                new Stats(75,
                        100,
                        100,
                        80,
                        45,
                        200),
                List.of(Ability.OUTBURST), Ability.OUTBURST,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Valstrax");

    }


}
