package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Catertuff extends drai.dev.data.pokemon.Pokemon {
    public Catertuff() {
        super("Catertuff",
                Type.BUG,Type.ELECTRIC,
                new Stats(73,
                        50,
                        85,
                        85,
                        106,
                        86),
                List.of(Ability.STATIC,Ability.CLOUD_NINE), Ability.MINUS,
                13, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Pollen Puff STAB Bug - Allergy Pollen Grass - Sleep Powder Grass - Rage Powder  Bug - Helping Hand  Normal - Encore  Normal - Flatter Dark - NuzzleSTAB Electric - Cotton Spore Grass - Cotton Guard Grass - Electric Cheer Electric"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ALLERGYPOLLEN,1),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,1),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,1),
                        new MoveLearnSetEntry(Move.FLATTER,1),
                        new MoveLearnSetEntry(Move.NUZZLE,1),
                        new MoveLearnSetEntry(Move.ENCORE,1),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.ELECTRICCHEER,1),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,1),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,1),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 26, 43, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Catertuff");

    }


}
