package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Teravat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Teravat() {
        super("Teravat",
                Type.ELECTRIC,Type.FLYING,
                new Stats(59,
                        40,
                        82,
                        102,
                        89,
                        123),
                List.of(Ability.ILLUMINATE), Ability.ADAPTABILITY,
                12, 150,
                new Stats(0,0,0,0,0,2), 75,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.FIELD),
                List.of("As they fly their wings flap so fast that it generates energy. When that energy is discharged their bodies glow as bright as the sun."),
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
           setLangFileName("Teravat");

    }


}
