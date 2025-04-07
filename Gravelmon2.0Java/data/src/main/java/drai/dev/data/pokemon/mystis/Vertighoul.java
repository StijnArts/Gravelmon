package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vertighoul extends drai.dev.data.pokemon.Pokemon {
    public Vertighoul() {
        super("Vertighoul",
                Type.DARK, Type.GHOST,
                new Stats(60,
                        130,
                        90,
                        50,
                        70,
                        120),
                List.of(Ability.INTIMIDATE,Ability.UNNERVE), Ability.STAKEOUT,
                34, 454,
                new Stats(0,2,0,0,0,0), 3,
                0.5,
                182, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Vertighoul's main source of food is fear, so it gets its meals by terrorising humans and Pokémon. Its preferred strategy is to scare people off steep cliffs and catching them right before they fall."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DARK_VOID,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.DARKEST_LARIAT,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DEEP_DARK).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Vertighoul");

    }


}
