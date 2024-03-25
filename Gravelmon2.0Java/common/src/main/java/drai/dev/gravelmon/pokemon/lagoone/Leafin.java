package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Leafin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Leafin() {
        super("Leafin",
                Type.GRASS,
                new Stats(50,
                        66,
                        51,
                        41,
                        53,
                        53),
                List.of(Ability.OVERGROW), Ability.SHARPNESS,
                6, 91,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("The sharp leaf on its head is used to cut through tall grass and vegetation, so it can move more swiftly. Leafin pack a powerful bite despite being usually docile."),
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
           setLangFileName("Leafin");

    }


}
