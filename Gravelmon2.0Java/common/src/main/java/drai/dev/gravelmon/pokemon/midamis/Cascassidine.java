package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Cascassidine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cascassidine() {
        super("Cascassidine",
                Type.WATER,Type.FLYING,
                new Stats(95,
                        105,
                        90,
                        75,
                        85,
                        85),
                List.of(Ability.SWIFT_SWIM), Ability.OVERCOAT,
                8, 165,
                new Stats(1,3,0,0,0,0), 0,
                0.75,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.MONSTER),
                List.of("A feared underwater being that feeds by plucking Flying-types from the surface, drowning them before feeding on them. They are fearsome battlers and not to be taken lightly. Their plumage is water-resistant to increase speed in water, also working to repel Water-type attacks during battle."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AIR_SLASH,1),
                        new MoveLearnSetEntry(Move.CRUNCH,47),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,54),
                        new MoveLearnSetEntry(Move.THRASH,62),
                        new MoveLearnSetEntry(Move.MIST,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cascassidine");

    }


}
