package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Aprintice extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aprintice() {
        super("Aprintice",
                Type.ICE, Type.PSYCHIC,
                new Stats(47,
                        20,
                        30,
                        78,
                        60,
                        40),
                List.of(Ability.SECRETINSIGHT,Ability.SNOW_WARNING,Ability.TELEPATHY), Ability.TELEPATHY,
                9, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("adepthawl", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.DETECT,5),
                        new MoveLearnSetEntry(Move.CONFUSION,11),
                        new MoveLearnSetEntry(Move.REFLECT,14),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,20),
                        new MoveLearnSetEntry(Move.FROST_BREATH,24),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,29),
                        new MoveLearnSetEntry(Move.PSYBEAM,33),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,37),
                        new MoveLearnSetEntry(Move.PSYCHIC,42),
                        new MoveLearnSetEntry(Move.HEALING_WISH,47),
                        new MoveLearnSetEntry(Move.WISH,52)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 27, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Aprintice");

    }


}
