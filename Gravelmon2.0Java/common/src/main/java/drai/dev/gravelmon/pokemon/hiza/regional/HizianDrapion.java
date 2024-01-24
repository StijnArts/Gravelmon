package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianDrapion extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianDrapion() {
        super("Drapion",
                Type.GROUND,Type.DARK,
                new Stats(70,
                        105,
                        105,
                        60,
                        80,
                        80),
                List.of(Ability.IMMUNITY), Ability.TECHNICIAN,
                8, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of("What it lacks in venom it makes up in strength. Drapion is capable of tossing a rock twice its own size, using nothing but its tail."),
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
           setLangFileName("Drapion");

    }


}
