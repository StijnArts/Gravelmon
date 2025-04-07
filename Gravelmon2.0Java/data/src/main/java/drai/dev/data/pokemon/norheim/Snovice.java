package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Snovice extends drai.dev.data.pokemon.Pokemon {
    public Snovice() {
        super("Snovice",
                Type.ICE, Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.CLEAR_BODY,Ability.SNOW_WARNING,Ability.TELEPATHY), Ability.TELEPATHY,
                5, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("On certain days on the winter calendar, a landscape of a forgotten region will be displayed inside a Snovice’s head; a snowglobe working like a map."),
                List.of(new EvolutionEntry("aprintice", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"190")))),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 1, 22, 9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snovice");

    }


}
