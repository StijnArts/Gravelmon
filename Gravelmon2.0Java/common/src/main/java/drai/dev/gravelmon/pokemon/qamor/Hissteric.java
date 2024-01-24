package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Hissteric extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hissteric() {
        super("Hissteric",
                Type.GROUND,Type.POISON,
                new Stats(76,
                        101,
                        84,
                        45,
                        105,
                        99),
                List.of(Ability.SHED_SKIN), Ability.MOLD_BREAKER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Hissteric no longer use their tales purely as a defense mechanism, now they use it to entertain themselves by startling others and laughing at their misfortune. Their TRUE defense mechanism is comedy."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GLARE,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hissteric");

    }


}
