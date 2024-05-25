package drai.dev.gravelmon.pokemon.olysos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Monokron extends drai.dev.gravelmon.pokemon.Pokemon {
    public Monokron() {
        super("Monokron",
                Type.STEEL, Type.PSYCHIC,
                new Stats(85,
                        200,
                        120,
                        115,
                        100,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                93, 10160,
                new Stats(0,2,1,0,0,0), 3,
                1.0,
                340, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It's energy source streams from it's back. The environment around itself disorts into very simplified geometric shapes. The colours evaporate and everything becomes one."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Monokron");

    }


}
