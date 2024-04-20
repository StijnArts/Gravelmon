package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Swallop extends drai.dev.gravelmon.pokemon.Pokemon {
    public Swallop() {
        super("Swallop",
                Type.NORMAL, Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("These waterbirds mate for life, only settling down with a Swallop of equal strength. They battle relentlessly to pick their partner, resulting in the creation of the Lonavan Society for the Protection of Birds — or the LSPB — whose members hide near lakes, waiting to jump in and apply medical aid to injured Swallop."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CALM_MIND,1)                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Swallop");

    }


}
