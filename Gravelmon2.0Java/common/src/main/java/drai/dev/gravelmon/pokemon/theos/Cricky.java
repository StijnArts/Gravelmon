package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cricky extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cricky() {
        super("Cricky",
                Type.BUG,
                new Stats(30,
                        60,
                        50,
                        35,
                        40,
                        60),
                List.of(Ability.SWARM), Ability.RATTLED,
                4, 6,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                55, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Cricky can jump very high and far, causing them to often get carried by the wind. Their legs are extremely quick, able to kick an average of 10 times per second."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cricky");

    }


}
