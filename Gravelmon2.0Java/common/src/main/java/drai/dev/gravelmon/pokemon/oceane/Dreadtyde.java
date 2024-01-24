package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Dreadtyde extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dreadtyde() {
        super("Dreadtyde",
                Type.POISON,Type.GHOST,
                new Stats(105,
                        90,
                        100,
                        125,
                        160,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Feared throughout history as the cause for all mass extinctions, it seeps a red algae from its spines that dyes entire oceans red and deprives everything of life. It slumbers, biding its time until the next extinction."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FATALTIDE,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dreadtyde");

    }


}
