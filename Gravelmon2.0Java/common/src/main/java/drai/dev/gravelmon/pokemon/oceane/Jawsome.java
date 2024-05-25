package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Jawsome extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jawsome() {
        super("Jawsome",
                Type.WATER,
                new Stats(56,
                        92,
                        70,
                        78,
                        92,
                        57),
                List.of(Ability.STRONG_JAW), Ability.INTIMIDATE,
                7, 165,
                new Stats(0,1,0,0,1,0), 90,
                0.5,
                156, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Its strength lies in its jaws. It can retract its head inside its body to bite with its outer jaws."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATERFALL,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1),
                        new MoveLearnSetEntry(Move.ICE_FANG,1),
                        new MoveLearnSetEntry(Move.FIRE_FANG,1),
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.BUBBLE,5),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.CRUNCH,37)
                        ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 14, 33, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN, Biome.IS_WARM_OCEAN))),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
