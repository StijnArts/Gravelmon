package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Jellycap extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jellycap() {
        super("Jellycap",
                Type.POISON,
                new Stats(65,
                        32,
                        60,
                        48,
                        60,
                        25),
                List.of(Ability.EFFECT_SPORE,Ability.LIQUID_OOZE), Ability.UNAWARE,
                6, 82,
                new Stats(1,0,0,0,0,0), 225,
                0.5,
                66, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("The bouncy jelly-like substance on its head is poisonous and protect its face, what looks like antennae poking out of its head are actually its eyes."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Jellycap");

    }


}
