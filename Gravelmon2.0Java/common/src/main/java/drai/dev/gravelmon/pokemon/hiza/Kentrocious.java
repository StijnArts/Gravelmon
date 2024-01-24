package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Kentrocious extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kentrocious() {
        super("Kentrocious",
                Type.FIRE,Type.ROCK,
                new Stats(120,
                        87,
                        62,
                        101,
                        110,
                        20),
                List.of(Ability.DROUGHT), Ability.STURDY,
                8, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                182, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Its huge back plates detonate when struck too hard, this defense mechanism protected them from large Pokémon who hunted them down in the past."),
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
           setLangFileName("Kentrocious");

    }


}
