package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Torrice extends drai.dev.data.pokemon.Pokemon {
    public Torrice() {
        super("Torrice",
                Type.ICE,Type.BUG,
                new Stats(100,
                        60,
                        80,
                        125,
                        85,
                        85),
                List.of(Ability.NO_GUARD), Ability.SNOW_CLOAK,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("In groups, just a few wing flaps can bring about a terrible blizzard of snow and silk. Torrice require cold temperatures, and overheat easily."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAGE_POWDER,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.SILVER_WIND,7),
                        new MoveLearnSetEntry(Move.FROST_BREATH,15),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,19),
                        new MoveLearnSetEntry(Move.INFESTATION,22),
                        new MoveLearnSetEntry(Move.ICY_WIND,26),
                        new MoveLearnSetEntry(Move.HAZE,30),
                        new MoveLearnSetEntry(Move.PESTER,34),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,38),
                        new MoveLearnSetEntry(Move.FREEZEDRY,43),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,47),
                        new MoveLearnSetEntry(Move.BLIZZARD,56),
                        new MoveLearnSetEntry(Move.SHEER_COLD,62)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Torrice");

    }


}
