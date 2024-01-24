package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Twoolepin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Twoolepin() {
        super("Twoolepin",
                Type.GRASS,Type.FLYING,
                new Stats(60,
                        72,
                        55,
                        90,
                        58,
                        60),
                List.of(Ability.TANGLED_FEET,Ability.PINWHEEL,Ability.OWN_TEMPO), Ability.OWN_TEMPO,
                8, 165,
                new Stats(0,0,0,2,0,0), 120,
                0.5,
                138, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Their big heavy feet keep them grounded on the floor as they spin the petals on their heads. Some fields can contain a hundred Twoolepin of different colours."),
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
           setLangFileName("Twoolepin");

    }


}
