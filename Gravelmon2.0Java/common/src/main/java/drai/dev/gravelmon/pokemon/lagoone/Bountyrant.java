package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Bountyrant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bountyrant() {
        super("Bountyrant",
                Type.WATER,Type.STEEL,
                new Stats(70,
                        90,
                        150,
                        60,
                        80,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 1420,
                new Stats(0,0,3,0,0,0), 45,
                0.5,
                260, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("It is believed that the most beautiful pearl is hidden inside its shell, but nobody was ever able to take it. As the sunlight hits the right angle, its sometimes possible to see a bit of its reflection."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bountyrant");

    }


}
