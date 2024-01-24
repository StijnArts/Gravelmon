package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Chompal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chompal() {
        super("Chompal",
                Type.WATER,
                new Stats(60,
                        100,
                        80,
                        75,
                        75,
                        100),
                List.of(Ability.INTIMIDATE), Ability.INTIMIDATE,
                8, 165,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                172, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("It's huge sharp teeth tend to scare people away, but its actually very docile. Whenever it sees people or Pokémon drowning it will urge to help them."),
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
           setLangFileName("Chompal");

    }


}
