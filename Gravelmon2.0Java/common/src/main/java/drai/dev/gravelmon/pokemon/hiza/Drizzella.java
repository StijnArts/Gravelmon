package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Drizzella extends drai.dev.gravelmon.pokemon.Pokemon {
    public Drizzella() {
        super("Drizzella",
                Type.WATER,Type.ELECTRIC,
                new Stats(93,
                        71,
                        57,
                        126,
                        93,
                        60),
                List.of(Ability.STATIC), Ability.DRIZZLE,
                8, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                224, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("They can be seem floating above the sea during stormy days. Their watery veil allows them to breath outside the water."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,1)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Drizzella");

    }


}
