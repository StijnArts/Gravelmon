package drai.dev.gravelmon.pokemon.rica;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Larmidge extends drai.dev.gravelmon.pokemon.Pokemon {
    public Larmidge() {
        super("Larmidge",
                Type.BUG,Type.WATER,
                new Stats(40,
                        35,
                        20,
                        35,
                        20,
                        50),
                List.of(Ability.SWARM), Ability.ADAPTABILITY,
                3, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                40, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Larmidge eat algae and leaves that have sunk to the bottoms of shallow ponds. They breathe through the gills on their rear."),
                List.of(new EvolutionEntry("dormidge", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUBBLE,7),
                        new MoveLearnSetEntry(Move.BUG_BITE,9),
                        new MoveLearnSetEntry(Move.WATER_SPORT,12),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,20),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,23),
                        new MoveLearnSetEntry(Move.ENDURE,26),
                        new MoveLearnSetEntry(Move.MUD_BOMB,35),
                        new MoveLearnSetEntry(Move.STICKY_WEB,45),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 1, 11, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FRESHWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
