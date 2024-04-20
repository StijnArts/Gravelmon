package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Terrahorn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Terrahorn() {
        super("Terrahorn",
                Type.ROCK, Type.GRASS,
                new Stats(85,
                        105,
                        121,
                        90,
                        80,
                        60),
                List.of(Ability.BATTLE_ARMOR,Ability.BERSERK,Ability.HUSTLE), Ability.HUSTLE,
                18, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The massive lungs of this relic can produce an incredible amount of air, bursting out of its hollow horn, the stumps on its back and its nostrils. The horn itself along the stumps on its back may break over time as they clash into other Terrahorn, fighting over territory."),
                List.of(),
                List.of(           new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.LEAFTURN,6),
                        new MoveLearnSetEntry(Move.ROCK_THROW,11),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,15),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,18),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,22),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,26),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,30),
                        new MoveLearnSetEntry(Move.SANDSHOT,34),
                        new MoveLearnSetEntry(Move.CRABHAMMER,38),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,42),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46)              ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 65, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_LUSH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Terrahorn");

    }


}
