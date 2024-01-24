package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Fauxmingo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fauxmingo() {
        super("Fauxmingo",
                Type.NORMAL,Type.WATER,
                new Stats(53,
                        34,
                        55,
                        66,
                        55,
                        42),
                List.of(Ability.RUBBERBODY), Ability.SWIFT_SWIM,
                8, 165,
                new Stats(0,0,0,2,0,0), 0,
                0.5,
                107, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1),
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
           setLangFileName("Fauxmingo");

    }


}
