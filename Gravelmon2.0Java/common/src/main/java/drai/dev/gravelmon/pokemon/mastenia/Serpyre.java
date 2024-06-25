package drai.dev.gravelmon.pokemon.mastenia;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Serpyre extends drai.dev.gravelmon.pokemon.Pokemon {
    public Serpyre() {
        super("Serpyre",
                Type.FIRE, Type.DRAGON,
                new Stats(75,
                        80,
                        75,
                        125,
                        85,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,2,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Serpyre thrives in boiling hot volcanic springs. It can shoot everything from a geiser to a flamethrower from its beak-like mouth."),
                List.of(),
                List.of(                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Serpyre");

    }


}
