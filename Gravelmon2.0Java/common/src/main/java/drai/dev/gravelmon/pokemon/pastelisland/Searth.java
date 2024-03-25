package drai.dev.gravelmon.pokemon.pastelisland;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Searth extends drai.dev.gravelmon.pokemon.Pokemon {
    public Searth() {
        super("Searth",
                Type.GROUND,
                new Stats(30,
                        40,
                        25,
                        35,
                        25,
                        30),
                List.of(Ability.DRY_SKIN,Ability.MOXIE), Ability.MARVEL_SCALE,
                3, 2,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                37, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.MINERAL),
                List.of(""),
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
           setLangFileName("Searth");

    }


}
