package drai.dev.gravelmon.pokemon.terranov;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Lunagaron extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lunagaron() {
        super("Lunagaron",
                Type.ICE,Type.DARK,
                new Stats(75,
                        115,
                        100,
                        60,
                        80,
                        115),
                List.of(Ability.SHARPNESS), Ability.WEAK_ARMOR,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They usually walk on all fours, but can stand on two legs by shutting down their cooling mechanism, spiking their body temp to expand their muscles."),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lunagaron");

    }


}
