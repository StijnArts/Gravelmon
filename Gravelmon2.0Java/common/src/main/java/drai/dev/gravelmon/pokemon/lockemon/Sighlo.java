package drai.dev.gravelmon.pokemon.lockemon;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Sighlo extends Pokemon {
    public Sighlo() {
        super("Sighlo",
                Type.BUG, Type.NORMAL,
                new Stats(20,
                        15,
                        35,
                        30,
                        40,
                        40),
                List.of(Ability.SHED_SKIN, Ability.GLUTTONY), Ability.TRUANT,
                3, 25,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It does almost nothing aside from sitting and eating all day. Easily eating its body weight in a sitting. It lets out an occasional sigh from loneliness."),
                List.of(new EvolutionEntry("cooreds", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"8")))),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,9)
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.COMMON, 3, 22, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
    }
}
