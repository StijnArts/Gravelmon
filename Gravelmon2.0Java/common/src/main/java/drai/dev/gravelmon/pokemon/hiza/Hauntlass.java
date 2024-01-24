package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Hauntlass extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hauntlass() {
        super("Hauntlass",
                Type.GHOST,Type.PSYCHIC,
                new Stats(62,
                        103,
                        32,
                        72,
                        116,
                        112),
                List.of(Ability.CLEAR_BODY), Ability.ILLUSION,
                8, 165,
                new Stats(0,1,0,0,1,0), 90,
                0.0,
                185, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("The broken mirror displays a distorted version of those who stare at it, bringing life to their worst nightmares."),
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
           setLangFileName("Hauntlass");

    }


}
