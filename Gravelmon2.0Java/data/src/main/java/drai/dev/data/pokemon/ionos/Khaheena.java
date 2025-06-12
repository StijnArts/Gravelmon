package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Khaheena extends drai.dev.data.pokemon.Pokemon {
    public Khaheena() {
        super("Khaheena",
                Type.GROUND, Type.FIGHTING,
                new Stats(79,
                        100,
                        88,
                        88,
                        60,
                        100),
                List.of(Ability.SAND_RUSH,Ability.KEEN_EYE), Ability.MOXIE,
                15, 0,
                new Stats(0,0,0,0,0,0), 150,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Unlike its pre-evolution Spothyena and its male counterpart Gormhyena, Khaheena are solitary hunters. Even though they blend in perfectly in a sandstorm, Khaheena thrives during full moon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.DUST_KICK,5),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,8),
                        new MoveLearnSetEntry(Move.HELPING_HAND,13),
                        new MoveLearnSetEntry(Move.BULLDOZE,15),
                        new MoveLearnSetEntry(Move.STORM_THROW,20),
                        new MoveLearnSetEntry(Move.DETECT,22),
                        new MoveLearnSetEntry(Move.BONE_RUSH,27),
                        new MoveLearnSetEntry(Move.MOONLIGHT,29),
                        new MoveLearnSetEntry(Move.DIG,34),
                        new MoveLearnSetEntry(Move.BULK_UP,36),
                        new MoveLearnSetEntry(Move.BODY_SLAM,41),
                        new MoveLearnSetEntry(Move.REVERSAL,43),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,48),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,50),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,55),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,57)
                ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 47, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Khaheena");

    }


}
