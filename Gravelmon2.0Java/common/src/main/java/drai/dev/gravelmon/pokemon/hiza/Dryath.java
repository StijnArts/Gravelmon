package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Dryath extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dryath() {
        super("Dryath",
                Type.GRASS,Type.DARK,
                new Stats(50,
                        65,
                        50,
                        75,
                        85,
                        75),
                List.of(Ability.CUTE_CHARM), Ability.CHLOROPHYLL,
                8, 165,
                new Stats(0,0,0,0,2,0), 120,
                0.0,
                137, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("It mimics a little girl who is lost in the forest to lure kind hearted people. Those who try to help it end up lost in the forest too."),
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
           setLangFileName("Dryath");

    }


}
