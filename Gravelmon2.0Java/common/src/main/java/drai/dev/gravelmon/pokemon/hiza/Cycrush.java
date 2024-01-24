package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cycrush extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cycrush() {
        super("Cycrush",
                Type.ROCK,Type.FIGHTING,
                new Stats(68,
                        85,
                        120,
                        30,
                        70,
                        32),
                List.of(Ability.SAND_FORCE,Ability.SOLID_ROCK,Ability.CLEAR_BODY), Ability.CLEAR_BODY,
                8, 165,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Cycrush is known for lifting boulders out of roads to help out travelers. As its muscles get bigger its stone armor will crack."),
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
           setLangFileName("Cycrush");

    }


}
