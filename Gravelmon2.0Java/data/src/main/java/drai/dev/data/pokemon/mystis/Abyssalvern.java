package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Abyssalvern extends drai.dev.data.pokemon.Pokemon {
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
                new Stats(0,0,0,0,0,0), 3,
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
                ),new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_END)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Abyssalvern");

    }


}
