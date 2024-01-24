package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mouskrow extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mouskrow() {
        super("Mouskrow",
                Type.NORMAL,
                new Stats(62,
                        51,
                        55,
                        35,
                        45,
                        32),
                List.of(Ability.OVERCOAT), Ability.MOUNTAINEER,
                8, 165,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Stumbling upon a Mouskrow community, you will find burrows in which they live in. To avoid getting lost, they create trails around their area. They have trails leading to other Mouskrow communities to assist each other with delivering food and supplies. Their thick coats turn white in the winter so they can blend in with the snow to hide from enemies."),
                List.of(),
                List.of(                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mouskrow");

    }


}
