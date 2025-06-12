package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Spacteel extends drai.dev.data.pokemon.Pokemon {
    public Spacteel() {
        super("Spacteel",
                Type.WATER,Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.TORRENT), null,
                9, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Whaleist", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36"))),
                        new EvolutionEntry("Tecnophin", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:electirizer")),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 16, 40, 3.6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Spacteel");

    }


}
