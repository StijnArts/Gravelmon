package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Dodonut extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dodonut() {
        super("Dodonut",
                Type.GRASS,Type.FLYING,
                new Stats(41,
                        40,
                        55,
                        55,
                        40,
                        74),
                List.of(Ability.NATURAL_CURE), Ability.SOLAR_POWER,
                5, 53,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("They migrate to remote islands after reaching a certain age. Since they are poor fliers to soar over the sea, they use their shells to float across the water."),
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
           setLangFileName("Dodonut");

    }


}
