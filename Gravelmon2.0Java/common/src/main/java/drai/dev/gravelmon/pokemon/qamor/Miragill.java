package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Miragill extends drai.dev.gravelmon.pokemon.Pokemon {
    public Miragill() {
        super("Miragill",
                Type.WATER,
                new Stats(72,
                        60,
                        73,
                        78,
                        62,
                        78),
                List.of(Ability.MARVEL_SCALE,Ability.RIVALRY,Ability.WATER_VEIL), Ability.WATER_VEIL,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Miragill are very pompous, flashy Pokemon. They swim through the coral reefs showing off the color pallets of their vivid fins. But when they aren't comparing who's fin colors are more saturated, they are fighting tooth and nail- sometimes to the death."),
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
           setLangFileName("Miragill");

    }


}
