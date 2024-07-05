package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tortorge extends drai.dev.data.pokemon.Pokemon {
    public Tortorge() {
        super("Tortorge",
                Type.FIRE, Type.STEEL,
                new Stats(80,
                        70,
                        120,
                        105,
                        130,
                        35),
                List.of(Ability.WHITE_SMOKE,Ability.DROUGHT), Ability.SHELL_ARMOR,
                21, 3402,
                new Stats(1,0,2,0,0,0), 60,
                0.5,
                200, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.MINERAL),
                List.of("The steel forge atop its shell blazes with the intensity of a forge at full operation, emitting molten steel that can leave scorching burns on its opponents. Despite its fearsome appearance, Tortorge is a gentle giant, utilizing its molten steel attacks only as a last resort."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tortorge");

    }


}
