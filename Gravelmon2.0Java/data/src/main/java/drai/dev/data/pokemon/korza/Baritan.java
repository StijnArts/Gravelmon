package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Baritan extends drai.dev.data.pokemon.Pokemon {
    public Baritan() {
        super("Baritan",
                Type.ROCK,
                new Stats(80,
                        100,
                        150,
                        65,
                        65,
                        35),
                List.of(Ability.STURDY), Ability.STRONG_JAW,
                14, 709,
                new Stats(0,0,3,0,0,0), 45,
                0.5,
                223, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("In the distant past, Baritans were so numerable that their colonies were able to carve the large and numerous caves that are now present in the region. Lack of space and food led to their current declining numbers."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.ROCK_THROW,7),
                        new MoveLearnSetEntry(Move.SCREECH,11),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,15),
                        new MoveLearnSetEntry(Move.ROAR,20),
                        new MoveLearnSetEntry(Move.STOMP,24),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,29),
                        new MoveLearnSetEntry(Move.CRYSTALCRUNCH,33),
                        new MoveLearnSetEntry(Move.MAGNITUDE,37),
                        new MoveLearnSetEntry(Move.BEAT_UP,41),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,46),
                        new MoveLearnSetEntry(Move.STONE_EDGE,50),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,54)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Baritan");

    }


}
