package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Grubait extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grubait() {
        super("Grubait",
                Type.BUG,
                new Stats(60,
                        44,
                        44,
                        32,
                        32,
                        32),
                List.of(Ability.GLUTTONY,Ability.STICKY_HOLD,Ability.OBLIVIOUS), Ability.OBLIVIOUS,
                5, 165,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It falls common prey to Flying-types such as Kisadee. Fishermen are sometimes caught using Grubait as lure, claiming it brings them better fish Pokemon."),
                List.of(new EvolutionEntry("chococoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"10")))),
                List.of(
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.TACKLE,3),
                        new MoveLearnSetEntry(Move.BUG_BITE,6),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.BELCH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 1, 12, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grubait");

    }


}
