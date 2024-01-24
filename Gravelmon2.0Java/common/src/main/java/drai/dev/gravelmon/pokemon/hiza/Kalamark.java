package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Kalamark extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kalamark() {
        super("Kalamark",
                Type.GHOST,Type.WATER,
                new Stats(65,
                        125,
                        60,
                        100,
                        70,
                        70),
                List.of(Ability.WONDER_SKIN), Ability.SHADOW_TAG,
                8, 165,
                new Stats(0,1,0,1,0,0), 60,
                0.5,
                177, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It strikes the eyes of its foes trying to blind them with ink, it then happily watches its blinded victims struggle in panic."),
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
           setLangFileName("Kalamark");

    }


}
