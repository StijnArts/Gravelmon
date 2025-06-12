package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Adeerex extends drai.dev.data.pokemon.Pokemon {
    public Adeerex() {
        super("Adeerex",
                Type.DARK, Type.ROCK,
                new Stats(105,
                        140,
                        110,
                        40,
                        50,
                        70),
                List.of(Ability.ANGER_POINT), Ability.FEROCIOUS,
                23, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Adeerex was known for devouring entire Pokemon whole in it's prime, although as Pokemon dwindled, it lost it's food source as well and eventually fell to the wayside."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROCK_BLAST,1),
                        new MoveLearnSetEntry(Move.BITE,5),
                        new MoveLearnSetEntry(Move.STOMP,10),
                        new MoveLearnSetEntry(Move.ROAR,14),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,21),
                        new MoveLearnSetEntry(Move.PAYBACK,26),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,32),
                        new MoveLearnSetEntry(Move.CRUNCH,37),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,43),
                        new MoveLearnSetEntry(Move.BULK_UP,48),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,54),
                        new MoveLearnSetEntry(Move.JAW_LOCK,59),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,64),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,72)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(28)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OLD_GROWTH_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Adeerex");

    }


}
