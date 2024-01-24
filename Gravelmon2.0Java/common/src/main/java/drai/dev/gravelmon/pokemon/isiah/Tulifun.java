package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tulifun extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tulifun() {
        super("Tulifun",
                Type.GRASS,
                new Stats(45,
                        50,
                        35,
                        70,
                        40,
                        40),
                List.of(Ability.TANGLED_FEET,Ability.LEAF_GUARD,Ability.OWN_TEMPO), Ability.OWN_TEMPO,
                8, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("With a rapid spin of its leaves, it is able to produce winds anywhere from faint to strong in power. It is known to often make itself dizzy quite easily when doing this."),
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
           setLangFileName("Tulifun");

    }


}
