package drai.dev.gravelmon.pokemon.urzavos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Constellapin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Constellapin() {
        super("Constellapin",
                Type.FAIRY,Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 113,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.FIELD),
                List.of("Curious 'Mons that enjoy chasing games. They are often out at night during full moons, in which their ears glow and the starry pattern on their tails seem to swirl with color."),
                List.of(),
                List.of(                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Constellapin");

    }


}
