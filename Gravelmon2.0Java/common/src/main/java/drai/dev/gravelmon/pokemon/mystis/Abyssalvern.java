package drai.dev.gravelmon.pokemon.mystis;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Abyssalvern extends drai.dev.gravelmon.pokemon.Pokemon {
    public Abyssalvern() {
        super("Abyssalvern",
                Type.WATER, Type.DRAGON,
                new Stats(120,
                        140,
                        140,
                        90,
                        110,
                        70),
                List.of(Ability.ABYSSALARMOR), Ability.ABYSSALARMOR,
                171, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It clashed with Prismativern and was banished to the deep abyss of the ocean, where its body became the ocean floor. In legends, it is said that when the world is about to collapse, it will bring about a maelstrom of despair, destroying it entirely. The world's fate depends on its people; could they stop its maelstrom before it swallows them whole, or would it have torn them apart?"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGUNDER,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Abyssalvern");

    }


}
