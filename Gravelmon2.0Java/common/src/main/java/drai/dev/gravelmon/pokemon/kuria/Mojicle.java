package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Mojicle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mojicle() {
        super("Mojicle",
                Type.WATER,Type.QUESTION_MARK,
                new Stats(55,
                        40,
                        50,
                        80,
                        86,
                        40),
                List.of(Ability.MADNESS,Ability.SWIFT_SWIM), Ability.TRACE,
                5, 85,
                new Stats(0,0,0,1,0,0), 190,
                0.25,
                77, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("Mojicle like to show off their strange abilities in front of the whole ocean. The stripe on their head changes to suite their mood."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mojicle");

    }


}
