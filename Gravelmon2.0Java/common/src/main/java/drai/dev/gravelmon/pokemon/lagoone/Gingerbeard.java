package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Gingerbeard extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gingerbeard() {
        super("Gingerbeard",
                Type.FAIRY,Type.DARK,
                new Stats(70,
                        105,
                        75,
                        55,
                        110,
                        95),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 50,
                new Stats(0,1,0,0,0,1), 60,
                0.0,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gingerbeard");

    }


}
