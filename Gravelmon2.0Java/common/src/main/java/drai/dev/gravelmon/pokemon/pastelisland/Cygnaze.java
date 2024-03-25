package drai.dev.gravelmon.pokemon.pastelisland;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cygnaze extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cygnaze() {
        super("Cygnaze",
                Type.FIRE,
                new Stats(60,
                        90,
                        60,
                        60,
                        50,
                        85),
                List.of(Ability.BLAZE), Ability.DAZZLING,
                24, 154,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("Anascorch have a quiet demeanor, liking to sit alone on shores. But they can be very loud and thrashing when threatened."),
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
           setLangFileName("Cygnaze");

    }


}
