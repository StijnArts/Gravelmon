package drai.dev.gravelmon.pokemon.otopo;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Geonigma extends drai.dev.gravelmon.pokemon.Pokemon {
    public Geonigma() {
        super("Geonigma",
                Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.ACCLIMATIZE), Ability.ACCLIMATIZE,
                0, 0,
                new Stats(0,0,0,0,0,0), 35,
                0.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Geonigma comes from an experiment where Ditto was subjected to the harshest of environments. Its body instead morphed into a black silhouette, allowing it to merge seamlessly into its environment whilst taking on its properties."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.SWARMINGTERRAIN,1),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.FILTHY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,1),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Geonigma");

    }


}
