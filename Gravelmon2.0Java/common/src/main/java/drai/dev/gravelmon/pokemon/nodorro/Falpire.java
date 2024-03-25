package drai.dev.gravelmon.pokemon.nodorro;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Falpire extends drai.dev.gravelmon.pokemon.Pokemon {
    public Falpire() {
        super("Falpire",
                Type.GRASS,Type.FLYING,
                new Stats(70,
                        90,
                        88,
                        87,
                        80,
                        80),
                List.of(Ability.INNER_FOCUS,Ability.SAP_SIPPER), Ability.INSOMNIA,
                12, 158,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                155, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.MONSTER),
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
           setLangFileName("Falpire");

    }


}
