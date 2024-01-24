package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Stegovore extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stegovore() {
        super("Stegovore",
                Type.ROCK,Type.GROUND,
                new Stats(95,
                        95,
                        125,
                        55,
                        85,
                        40),
                List.of(Ability.STURDY), Ability.BATTLE_ARMOR,
                8, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.875,
                177, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Its skin is extremely tough and contains a certain pigment that absorbs sunlight, providing it with energy. Stegovore need to stay at a certain body temperature to be able to use all of its bodily functions correctly, so it always stands with its plates facing the sun to absorb heat. Great herds of Stegovore would trample across prehistoric Orohn, and as recently discovered, these migrations are the cause of much of modern Orohn's flat grasslands."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.YAWN,5),
                        new MoveLearnSetEntry(Move.HARDEN,9),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,14),
                        new MoveLearnSetEntry(Move.BULLDOZE,19),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,23),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,27),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,32),
                        new MoveLearnSetEntry(Move.SPIKES,36),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,43),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,54),
                        new MoveLearnSetEntry(Move.REST,59),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.MAGNITUDE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,"tm")                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stegovore");

    }


}
