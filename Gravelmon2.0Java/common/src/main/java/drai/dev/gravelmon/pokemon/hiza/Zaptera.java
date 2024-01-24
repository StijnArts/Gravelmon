package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Zaptera extends drai.dev.gravelmon.pokemon.Pokemon {
    public Zaptera() {
        super("Zaptera",
                Type.ELECTRIC,Type.FLYING,
                new Stats(72,
                        70,
                        84,
                        120,
                        54,
                        100),
                List.of(Ability.MAGNET_PULL), Ability.ELECTRIC_SURGE,
                8, 165,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                182, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("As it flies above the sea it strikes fish with powerful lightning bolts, its long sharp beak lets it pick them up without touching the water"),
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
           setLangFileName("Zaptera");

    }


}
