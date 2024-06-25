package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Ursaring extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ursaring(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Ursaring",
                Type.NORMAL, Type.FIGHTING,
                new Stats(100,
                        135,
                        81,
                        59,
                        70,
                        55),
                List.of(Ability.GUTS,Ability.TOUGH_CLAWS), Ability.ADAPTABILITY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ursaring");

    }


}
