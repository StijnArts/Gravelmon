package drai.dev.gravelmon.pokemon.orbis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Sylveon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sylveon() {
        super("Sylveon",
                Type.FAIRY,
                new Stats(95,
                        65,
                        65,
                        110,
                        130,
                        60),
                List.of(Ability.CUTE_CHARM), Ability.PIXILATE,
                10, 235,
                new Stats(0,0,0,0,2,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It sends a soothing aura from its ribbonlike feelers to calm fights. When this Pokémon sights prey, the feelers swirl as a distraction before it pounces."),
                List.of(),
                List.of(                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sylveon");

    }


}
