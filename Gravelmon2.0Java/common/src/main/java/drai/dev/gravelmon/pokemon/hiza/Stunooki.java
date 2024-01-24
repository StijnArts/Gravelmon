package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Stunooki extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stunooki() {
        super("Stunooki",
                Type.ELECTRIC,Type.DARK,
                new Stats(30,
                        60,
                        40,
                        60,
                        55,
                        65),
                List.of(Ability.STATIC), Ability.STATIC,
                8, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                65, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It uses the tip of its tail to paralyze those touched by it. If a bigger and stronger foe gets paralyzed, it won't lose the chance to taunt them before fleeing."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Stunooki");

    }


}
