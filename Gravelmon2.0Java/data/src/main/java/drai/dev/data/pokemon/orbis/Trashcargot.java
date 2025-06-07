package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trashcargot extends drai.dev.data.pokemon.Pokemon {
    public Trashcargot() {
        super("Trashcargot",
                Type.POISON, Type.STEEL,
                new Stats(90,
                        60,
                        105,
                        95,
                        85,
                        20),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 410,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                142, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("- SludgeSTAB Poison - Sludge WaveSTAB Poison - Sludge BombSTAB Poison - Withdraw Water - Iron Defense Steel - Wriggle Bug - BelchSTAB Poison - Stockpile Normal - Swallow Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,1),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,1),
                        new MoveLearnSetEntry(Move.WRIGGLE,1),
                        new MoveLearnSetEntry(Move.SWALLOW,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.SLUDGE,1),
                        new MoveLearnSetEntry(Move.STOCKPILE,1),
                        new MoveLearnSetEntry(Move.BELCH,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Trashcargot");

    }


}
