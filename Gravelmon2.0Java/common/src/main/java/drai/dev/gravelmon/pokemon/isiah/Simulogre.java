package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Simulogre extends drai.dev.gravelmon.pokemon.Pokemon {
    public Simulogre() {
        super("Simulogre",
                Type.GROUND,Type.GRASS,
                new Stats(80,
                        80,
                        120,
                        90,
                        60,
                        70),
                List.of(Ability.BATTLE_ARMOR), Ability.NATURAL_CURE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Simulogre");

    }


}
