package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mahoyon extends drai.dev.data.pokemon.Pokemon {
    public Mahoyon() {
        super("Mahoyon",
                Type.NORMAL,Type.FIGHTING,
                new Stats(60,
                        60,
                        60,
                        90,
                        80,
                        100),
                List.of(Ability.JUSTIFIED), Ability.JUSTIFIED,
                12, 388,
                new Stats(0,0,0,0,0,0), 75,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.HUMAN_LIKE),
                List.of("This pokemon is compelled by justice, often teaming up with others in order to fight ne'er-do-wells. There's a popular children's show that features a band of Mahoyon who work together to keep the world safe from evil."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MEGA_KICK,25),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,30),
                        new MoveLearnSetEntry(Move.CALM_MIND,36),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,41),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,47),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,52),
                        new MoveLearnSetEntry(Move.ASSIST,57),
                        new MoveLearnSetEntry(Move.BATON_PASS,63)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mahoyon");

    }


}
