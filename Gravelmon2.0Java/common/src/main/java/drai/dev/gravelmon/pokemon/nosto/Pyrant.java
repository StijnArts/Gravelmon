package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pyrant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pyrant() {
        super("Pyrant",
                Type.BUG,Type.FIRE,
                new Stats(35,
                        45,
                        38,
                        38,
                        42,
                        42),
                List.of(Ability.SWARM), Ability.FLASH_FIRE,
                8, 165,
                new Stats(0,1,0,0,0,0), 235,
                0.5,
                48, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pyrant");

    }


}
