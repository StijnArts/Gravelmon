package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Spothyena extends drai.dev.data.pokemon.Pokemon {
    public Spothyena() {
        super("Spothyena",
                Type.GROUND,
                new Stats(59,
                        76,
                        65,
                        50,
                        50,
                        60),
                List.of(Ability.GLUTTONY,Ability.PICKUP), Ability.MOXIE,
                6, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.97,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Spothyena hunt in moderately sized packs. They are usually impatient and fight with each other over the smallest of things, mainly food."),
                List.of(new EvolutionEntry("khaheena", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY, "\"gender=female\"")),
                        List.of(),"cobblemon:moon_stone"),
                        new EvolutionEntry("gormhyena", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,4),
                        new MoveLearnSetEntry(Move.MAGNITUDE,7),
                        new MoveLearnSetEntry(Move.ROAR,10),
                        new MoveLearnSetEntry(Move.DIG,14),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,21),
                        new MoveLearnSetEntry(Move.SAND_TOMB,27),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.SANDSHOT,37),
                        new MoveLearnSetEntry(Move.REST,39),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,44),
                        new MoveLearnSetEntry(Move.FISSURE,51)
                ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 27, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spothyena");

    }


}
