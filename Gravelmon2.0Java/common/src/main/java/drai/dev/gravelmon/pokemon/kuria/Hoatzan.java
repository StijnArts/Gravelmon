package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Hoatzan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hoatzan() {
        super("Hoatzan",
                Type.POISON,Type.FLYING,
                new Stats(65,
                        65,
                        65,
                        65,
                        65,
                        65),
                List.of(Ability.POISON_POINT,Ability.STENCH), Ability.CLOUD_NINE,
                5, 166,
                new Stats(1,0,0,0,0,0), 45,
                0.875,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
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
           setLangFileName("Hoatzan");

    }


}
