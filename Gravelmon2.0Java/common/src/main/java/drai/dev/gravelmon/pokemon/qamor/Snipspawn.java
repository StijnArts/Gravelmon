package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Snipspawn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snipspawn() {
        super("Snipspawn",
                Type.DRAGON,
                new Stats(46,
                        83,
                        20,
                        45,
                        60,
                        88),
                List.of(Ability.CORROSION), Ability.STRONG_JAW,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Locals say that Snipspawn literally tastes like vomit however you try preparing it, as a result they have very little predators and are usually avoided by fishermen."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snipspawn");

    }


}
