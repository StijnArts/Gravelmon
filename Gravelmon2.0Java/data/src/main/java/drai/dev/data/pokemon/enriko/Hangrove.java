package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hangrove extends drai.dev.data.pokemon.Pokemon {
    public Hangrove() {
        super("Hangrove",
                Type.GRASS,
                new Stats(50,
                        90,
                        65,
                        40,
                        125,
                        80),
                List.of(Ability.CHLOROPHYLL,Ability.LONG_REACH,Ability.ROUGH_SKIN), Ability.ROUGH_SKIN,
                23, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                199, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It hides in a tree, coils of its body hanging low to create a deadly trap. The spikes on its back have a thin hole at the tip it uses to drain the blood of anything that falls onto it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,33),
                        new MoveLearnSetEntry(Move.FLYTRAPFANG,35),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,41),
                        new MoveLearnSetEntry(Move.COIL,45),
                        new MoveLearnSetEntry(Move.SYNTHESIS,50),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,54)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 28, 45, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hangrove");

    }


}
