package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Watchtowl extends drai.dev.gravelmon.pokemon.Pokemon {
    public Watchtowl() {
        super("Watchtowl",
                Type.ROCK, Type.FLYING,
                new Stats(68,
                        98,
                        78,
                        98,
                        43,
                        76),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 165,
                new Stats(0,0,0,0,0,0), 65,
                0.5,
                175, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FLYING),
                List.of("One of the landmarks of northern Enriko is the highest point in Plumvale, where you can see the heads of hunting Watchtowl over the forest canopy."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,6),
                        new MoveLearnSetEntry(Move.WING_ATTACK,10),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,17),
                        new MoveLearnSetEntry(Move.BLOCK,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,31),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,36),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,40),
                        new MoveLearnSetEntry(Move.SKY_DROP,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,53)
                ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 42, 54, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Watchtowl");

    }


}
