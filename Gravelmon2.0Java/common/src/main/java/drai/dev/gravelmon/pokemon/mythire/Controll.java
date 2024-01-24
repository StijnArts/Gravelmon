package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Controll extends drai.dev.gravelmon.pokemon.Pokemon {
    public Controll() {
        super("Controll",
                Type.GROUND,Type.POISON,
                new Stats(75,
                        70,
                        65,
                        65,
                        85,
                        40),
                List.of(Ability.ILLUMINATE), Ability.RIPEN,
                8, 165,
                new Stats(0,0,0,0,2,0), 100,
                0.5,
                140, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.GRASS),
                List.of("The spores from its symbiotic fungus make trees produce more fruit, which it then decomposes to its liking. It glows most brightly after it has devoured as much ripe fruit as it can swallow."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RECYCLE,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Controll");

    }


}
