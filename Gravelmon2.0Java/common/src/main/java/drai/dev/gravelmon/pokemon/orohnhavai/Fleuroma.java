package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Fleuroma extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fleuroma() {
        super("Fleuroma",
                Type.GRASS,
                new Stats(100,
                        60,
                        90,
                        60,
                        75,
                        75),
                List.of(Ability.LEAF_GUARD,Ability.CHLOROPHYLL,Ability.NATURAL_CURE), Ability.NATURAL_CURE,
                11, 165,
                new Stats(2,0,0,0,0,0), 75,
                0.5,
                113, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.GRASS),
                List.of("When threatened it has the ability to alter the aroma into a less pleasant one that causes dizzyness. Flowers tended by Fleuroma have a strong, pleasant aroma that can be detected from miles away."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,1),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,41),
                        new MoveLearnSetEntry(Move.LEAF_STORM,46),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,53),
                        new MoveLearnSetEntry(Move.TICKLE,"tm"),
                        new MoveLearnSetEntry(Move.COVET,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FLOWER_SHIELD,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 45, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of( new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA))),
                List.of(SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Fleuroma");

    }


}
