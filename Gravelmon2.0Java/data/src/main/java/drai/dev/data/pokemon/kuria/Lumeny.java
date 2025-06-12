package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lumeny extends drai.dev.data.pokemon.Pokemon {
    public Lumeny() {
        super("Lumeny",
                Type.LIGHT, Type.FAIRY,
                new Stats(100,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.SOOTHINGSHINE), Ability.SOOTHINGSHINE,
                4, 14,
                new Stats(1,1,1,1,1,1), 3,
                0.0,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Lumeny is a very gentle Pokémon and prefers not to fight, but instead to help. The soothing light coming from its antenna and tails gives a warm feeling that can make other Pokémon and even people feel a lot better."),
                List.of(),
                List.of(            new MoveLearnSetEntry(Move.ATTRACT,1),
                        new MoveLearnSetEntry(Move.CAPTIVATE,5),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,10),
                        new MoveLearnSetEntry(Move.HELPING_HAND,13),
                        new MoveLearnSetEntry(Move.CHARM,17),
                        new MoveLearnSetEntry(Move.SING,21),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,26),
                        new MoveLearnSetEntry(Move.SWEET_KISS,30),
                        new MoveLearnSetEntry(Move.LOVE_LARIAT,34),
                        new MoveLearnSetEntry(Move.AQUA_RING,38),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,42),
                        new MoveLearnSetEntry(Move.WISH,47),
                        new MoveLearnSetEntry(Move.DECORATE,53)            ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lumeny");

    }


}
