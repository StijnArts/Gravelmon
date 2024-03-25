package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Folida extends drai.dev.gravelmon.pokemon.Pokemon {
    public Folida() {
        super("Folida",
                Type.GRASS,Type.NORMAL,
                new Stats(58,
                        75,
                        50,
                        26,
                        50,
                        55),
                List.of(Ability.UNNERVE,Ability.PICKUP), Ability.VERMILINGUA,
                6, 69,
                new Stats(0,1,0,0,0,0), 45,
                0.75,
                77, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Folida often plays with its food as if it were a toy. Even when hunting for food, it always finds a way to make it fun for itself."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Folida");

    }


}
