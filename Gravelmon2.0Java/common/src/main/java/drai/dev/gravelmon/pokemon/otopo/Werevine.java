package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Werevine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Werevine() {
        super("Werevine",
                Type.GRASS, Type.DARK,
                new Stats(50,
                        90,
                        43,
                        60,
                        30,
                        73),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                121, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("It sharpens its claws on Sycanopy's bark. Their claws are so keen that they've been known to effortlessly slice through metal."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Werevine");

    }


}
