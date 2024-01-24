package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Enduron extends drai.dev.gravelmon.pokemon.Pokemon {
    public Enduron() {
        super("Enduron",
                Type.DRAGON,Type.PSYCHIC,
                new Stats(50,
                        55,
                        100,
                        60,
                        80,
                        65),
                List.of(Ability.MARVEL_SCALE), Ability.FILTER,
                8, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("It collects shiny objects and uses them to build up its shell, slowly strengthening its weak body. It wears the first object it ever found on its forehead, and uses it to magnify its psychic power to intense levels."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CRYSTALDEFENSE,1),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Enduron");

    }


}
