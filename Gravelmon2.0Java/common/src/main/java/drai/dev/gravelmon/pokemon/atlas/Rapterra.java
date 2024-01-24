package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Rapterra extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rapterra() {
        super("Rapterra",
                Type.DRAGON,Type.ROCK,
                new Stats(60,
                        115,
                        75,
                        65,
                        55,
                        80),
                List.of(Ability.ROCK_HEAD,Ability.STURDY,Ability.SHEER_FORCE), Ability.SHEER_FORCE,
                8, 165,
                new Stats(0,0,0,0,0,0), 75,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Quick on it's feet, Rapterra can bash into things to deal major damage. They eat twice as much as their previous evolution."),
                List.of(),
                List.of(                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rapterra");

    }


}
