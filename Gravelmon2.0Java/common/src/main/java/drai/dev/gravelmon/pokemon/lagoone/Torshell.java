package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Torshell extends drai.dev.gravelmon.pokemon.Pokemon {
    public Torshell() {
        super("Torshell",
                Type.FIRE,
                new Stats(50,
                        47,
                        56,
                        59,
                        43,
                        60),
                List.of(Ability.BLAZE), Ability.BLAZE,
                5, 35,
                new Stats(0,0,0,0,0,1), 45,
                0.875,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Their high body temperatures causes the sand in their nests to turn into glass. The flames on its head change into various patterns according to their emotions."),
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
           setLangFileName("Torshell");

    }


}
