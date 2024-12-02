package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ruthedral extends drai.dev.data.pokemon.Pokemon {
    public Ruthedral() {
        super("Ruthedral",
                Type.ROCK, Type.FLYING,
                new Stats(90,
                        75,
                        110,
                        65,
                        75,
                        75),
                List.of(Ability.UNBURDEN), Ability.HOLY_GUARD,
                16, 165,
                new Stats(0,0,2,0,0,0), 60,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.MONSTER),
                List.of("They like to pretend to be statues to hide in plain sight. They can comfortably stand still for hours without moving a single muscle."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,6),
                        new MoveLearnSetEntry(Move.WING_ATTACK,10),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,17),
                        new MoveLearnSetEntry(Move.BLOCK,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,33),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,39),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,46),
                        new MoveLearnSetEntry(Move.SKY_DROP,52),
                        new MoveLearnSetEntry(Move.STONE_EDGE,61)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
        setCanFly(true);
    }


}
