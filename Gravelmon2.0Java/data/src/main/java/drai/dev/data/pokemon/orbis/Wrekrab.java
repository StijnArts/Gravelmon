package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wrekrab extends drai.dev.data.pokemon.Pokemon {
    public Wrekrab() {
        super("Wrekrab",
                Type.STEEL,
                new Stats(60,
                        130,
                        115,
                        40,
                        80,
                        85),
                List.of(Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                32, 14061,
                new Stats(0,2,0,0,0,0), 30,
                0.5,
                215, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Wrekrab reside in huge scrapyards where they consume the thrown away metal. They carry huge vehicles on their backs, the bigger the vehicle the bigger the Wrekrab's rank in its colony."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.GEAR_UP,1),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,1),
                        new MoveLearnSetEntry(Move.SHIFT_GEAR,1),
                        new MoveLearnSetEntry(Move.DOUBLE_IRON_BASH,1),
                        new MoveLearnSetEntry(Move.GEAR_GRIND,1),
                        new MoveLearnSetEntry(Move.CRABHAMMER,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wrekrab");

    }


}
