package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Typheon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Typheon() {
        super("Typheon",
                Type.FLYING,
                new Stats(65,
                        60,
                        95,
                        130,
                        65,
                        110),
                List.of(Ability.AERILATE,Ability.CLOUD_NINE), Ability.WEATHERBENEFIT,
                10, 106,
                new Stats(0,0,0,2,0,0), 45,
                0.125,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("An often calm Pokémon that spends most of its days watching clouds. When it finds a specific cloud it likes, it chases it non-stop."),
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
           setLangFileName("Typheon");

    }


}
