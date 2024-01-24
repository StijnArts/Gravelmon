package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Celluler extends drai.dev.gravelmon.pokemon.Pokemon {
    public Celluler() {
        super("Celluler",
                Type.NORMAL,
                new Stats(40,
                        50,
                        20,
                        30,
                        20,
                        60),
                List.of(Ability.WEAK_ARMOR), Ability.STEADFAST,
                8, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                44, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
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
           setLangFileName("Celluler");

    }


}
