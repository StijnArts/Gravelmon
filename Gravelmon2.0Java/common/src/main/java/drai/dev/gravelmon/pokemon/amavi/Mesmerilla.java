package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Mesmerilla extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mesmerilla() {
        super("Mesmerilla",
                Type.PSYCHIC, Type.GRASS,
                new Stats(77,
                        33,
                        77,
                        111,
                        166,
                        66),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.FORESIGHT,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,5),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,8),
                        new MoveLearnSetEntry(Move.MIND_READER,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,18),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,22),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,25),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,29),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,31),
                        new MoveLearnSetEntry(Move.WORRY_SEED,36),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,40),
                        new MoveLearnSetEntry(Move.MEMENTO,47),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,52)                   ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 47, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_PLAINS))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mesmerilla");

    }


}
