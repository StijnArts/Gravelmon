package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Florange extends drai.dev.gravelmon.pokemon.Pokemon {
    public Florange() {
        super("Florange",
                Type.BUG, Type.PSYCHIC,
                new Stats(130,
                        20,
                        66,
                        82,
                        79,
                        112),
                List.of(Ability.HARVEST), Ability.HARVEST,
                7, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.PSYWAVE,1),
                        new MoveLearnSetEntry(Move.POWDER,8),
                        new MoveLearnSetEntry(Move.ENDURE,15),
                        new MoveLearnSetEntry(Move.HYPNOSIS,22),
                        new MoveLearnSetEntry(Move.PSYBEAM,25),
                        new MoveLearnSetEntry(Move.INFESTATION,29),
                        new MoveLearnSetEntry(Move.STICKY_WEB,31),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,36),
                        new MoveLearnSetEntry(Move.PSYCHIC,43),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,47)                  ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 15, 28, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL))
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Florange");

    }


}
