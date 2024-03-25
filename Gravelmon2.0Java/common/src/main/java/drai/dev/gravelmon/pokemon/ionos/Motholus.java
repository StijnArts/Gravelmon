package drai.dev.gravelmon.pokemon.ionos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Motholus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Motholus() {
        super("Motholus",
                Type.BUG,Type.GHOST,
                new Stats(80,
                        71,
                        50,
                        102,
                        99,
                        79),
                List.of(Ability.INTIMIDATE,Ability.SWARM), Ability.SHADOW_TAG,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite being primarily a nocturnal Pokémon, Motholus is awake during any time of the day. The forest floor in the dark and dense forests where it resides has never seen the light of day. Traveling through the very same forests will certainly make you go astray and eyes will be watching you as you loose your sense of direction."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Motholus");

    }


}
