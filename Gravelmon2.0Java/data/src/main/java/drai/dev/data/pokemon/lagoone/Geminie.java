package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Geminie extends drai.dev.data.pokemon.Pokemon {
    public Geminie() {
        super("Geminie",
                Type.PSYCHIC,Type.ROCK,
                new Stats(70,
                        102,
                        122,
                        53,
                        65,
                        88),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 167,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                172, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 35, 57, .8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

        setLangFileName("Geminie");

    }


}
