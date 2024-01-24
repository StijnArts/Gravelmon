package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Orbitalon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Orbitalon() {
        super("Orbitalon",
                Type.DRAGON,Type.STEEL,
                new Stats(50,
                        70,
                        60,
                        80,
                        60,
                        80),
                List.of(Ability.LIGHT_METAL), Ability.LIGHT_METAL,
                8, 165,
                new Stats(0,0,0,2,0,0), 25,
                0.5,
                147, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MINERAL),
                List.of("It is surprisingly intelligent and adaptive, being able to survive in practically any kind of known environment."),
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
           setLangFileName("Orbitalon");

    }


}
