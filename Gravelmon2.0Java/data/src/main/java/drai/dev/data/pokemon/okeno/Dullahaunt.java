package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Dullahaunt extends drai.dev.data.pokemon.Pokemon {
    public Dullahaunt() {
        super("Dullahaunt",
                Type.GHOST,
                new Stats(65,
                        75,
                        75,
                        127,
                        112,
                        101),
                List.of(Ability.WANDERING_SPIRIT), Ability.WANDERING_SPIRIT,
                17, 165,
                new Stats(0,0,0,0,0,2), 45,
                0.25,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("A tale describes the story of a woman whose sprit was forced to roam as a ghostly beast. People all over Okeno associate that tale with Dullahaunt."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPITE,1),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,8),
                        new MoveLearnSetEntry(Move.PURSUIT,13),
                        new MoveLearnSetEntry(Move.WILLOWISP,17),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,20),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,23),
                        new MoveLearnSetEntry(Move.GRUDGE,27),
                        new MoveLearnSetEntry(Move.HEX,31),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,36),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,40),
                        new MoveLearnSetEntry(Move.SPIRITFLAME,45),
                        new MoveLearnSetEntry(Move.POWER_TRIP,50),
                        new MoveLearnSetEntry(Move.MEMENTO,56),
                        new MoveLearnSetEntry(Move.INFERNO,62),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.NIGHTMARE,"tm"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 17, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                List.of());
           setLangFileName("Dullahaunt");

    }


}
