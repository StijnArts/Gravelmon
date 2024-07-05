package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trypagnet extends drai.dev.data.pokemon.Pokemon {
    public Trypagnet() {
        super("Trypagnet",
                Type.ROCK, Type.STEEL,
                new Stats(60,
                        80,
                        120,
                        40,
                        80,
                        20),
                List.of(Ability.STURDY,Ability.LEVITATE), Ability.MAGNET_PULL,
                11, 998,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                165, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Despite its slow levitation, Trypagnet's increased size and magnetic prowess make it a force to be reckoned with in its underground habitat. These Pokémon are known to form intricate formations, working together to create magnetic fields that aid in navigation and communication across expansive subterranean networks. With its evolved capabilities, Trypagnet becomes a cornerstone of the underground ecosystem, contributing to the delicate balance of magnetic forces that shape its hidden world."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Trypagnet");

    }


}
