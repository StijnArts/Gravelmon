package drai.dev.gravelmon.pokemon.orbis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Trashcargot extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trashcargot() {
        super("Trashcargot",
                Type.POISON,Type.STEEL,
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
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Trashcargot");

    }


}
