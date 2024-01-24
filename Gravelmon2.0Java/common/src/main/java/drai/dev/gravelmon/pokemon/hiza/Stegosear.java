package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Stegosear extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stegosear() {
        super("Stegosear",
                Type.FIRE,Type.ROCK,
                new Stats(90,
                        40,
                        50,
                        50,
                        100,
                        30),
                List.of(Ability.DROUGHT), Ability.STURDY,
                8, 165,
                new Stats(1,0,0,0,0,0), 70,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Believed to have lived in harsh environments thousands of years ago. The plates on its back regulate the extreme heat of its body."),
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
           setLangFileName("Stegosear");

    }


}
