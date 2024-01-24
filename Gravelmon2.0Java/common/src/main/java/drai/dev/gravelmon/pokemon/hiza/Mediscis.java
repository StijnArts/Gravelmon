package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mediscis extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mediscis() {
        super("Mediscis",
                Type.WATER,Type.POISON,
                new Stats(75,
                        90,
                        75,
                        80,
                        75,
                        90),
                List.of(Ability.POISON_POINT), Ability.WEAK_ARMOR,
                8, 165,
                new Stats(0,1,0,0,0,1), 50,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Its hollow body is full of venom which it injects on those it stabs with its snout. While this venom by itself is dangerous, it can be used to treat other kinds of venomous bites."),
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
           setLangFileName("Mediscis");

    }


}
