package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Iridellus extends drai.dev.data.pokemon.Pokemon {
    public Iridellus() {
        super("Iridellus",
                Type.FLYING,Type.FAIRY,
                new Stats(97,
                        56,
                        70,
                        123,
                        136,
                        53),
                List.of(Ability.UNAWARE), Ability.PIXILATE,
                18, 206,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("This pokemon likes to follow storms, and fly around in the light of the rising and setting sun. The ribbons of Iridellus are able to take away bad feelings and set people at ease."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,7),
                        new MoveLearnSetEntry(Move.AIRBUBBLE,13),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,18),
                        new MoveLearnSetEntry(Move.DEFOG,22),
                        new MoveLearnSetEntry(Move.TAILWIND,26),
                        new MoveLearnSetEntry(Move.AIR_SLASH,30),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,36),
                        new MoveLearnSetEntry(Move.TORNADO,41),
                        new MoveLearnSetEntry(Move.PIXIEDUST,45),
                        new MoveLearnSetEntry(Move.HURRICANE,49),
                        new MoveLearnSetEntry(Move.MOONBLAST,53),
                        new MoveLearnSetEntry(Move.RAYOFLIGHT,57),
                        new MoveLearnSetEntry(Move.EXPLOSION,62)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Iridellus");

    }


}
