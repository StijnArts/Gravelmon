package drai.dev.gravelmon.pokemon.olysos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Maanzagaro extends drai.dev.gravelmon.pokemon.Pokemon {
    public Maanzagaro() {
        super("Maanzagaro",
                Type.GRASS, Type.DARK,
                new Stats(80,
                        145,
                        70,
                        90,
                        50,
                        90),
                List.of(Ability.OVERGROW), Ability.WATER_ABSORB,
                20, 1445,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                236, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("Grizzlash have affection for their friends and fury for their enemies. One fierce punch can lead to major injuries and destruction."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maanzagaro");

    }


}
