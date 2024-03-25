package drai.dev.gravelmon.pokemon.terranov;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Gravios extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gravios() {
        super("Gravios",
                Type.ROCK,Type.FIRE,
                new Stats(105,
                        100,
                        150,
                        90,
                        75,
                        45),
                List.of(Ability.STURDY), Ability.STURDY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite having large wings its only capable of limited flight due to its weight. Its stone armor deflects most blows and allows it to swim freely inside molten magma."),
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
           setLangFileName("Gravios");

    }


}
