package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crusadyon extends drai.dev.data.pokemon.Pokemon {
    public Crusadyon() {
        super("Crusadyon",
                Type.NORMAL,Type.FIGHTING,
                new Stats(60,
                        90,
                        80,
                        60,
                        60,
                        100),
                List.of(Ability.JUSTIFIED), Ability.JUSTIFIED,
                12, 388,
                new Stats(0,0,0,0,0,0), 75,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of("This pokemon is compelled by justice, drawn to large cities because of their higher rate of crime. There's a popular children's show that features a lone Crusadyon who fights many villainous characters."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,25),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,30),
                        new MoveLearnSetEntry(Move.BULK_UP,36),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,41),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,47),
                        new MoveLearnSetEntry(Move.RETALIATE,52),
                        new MoveLearnSetEntry(Move.ASSIST,57),
                        new MoveLearnSetEntry(Move.BATON_PASS,63)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Crusadyon");

    }


}
