package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Kotsumo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kotsumo() {
        super("Kotsumo",
                Type.FAIRY,
                new Stats(55,
                        35,
                        56,
                        56,
                        55,
                        50),
                List.of(Ability.RATTLED,Ability.WONDER_SKIN), Ability.KLUTZ,
                6, 46,
                new Stats(1,0,0,0,0,0), 45,
                0.0,
                73, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of("Kotsumo resembles a doll and is popular with kids. It is terrified of getting sick, and so tends to keep to itself to prevent that from happening."),
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
           setLangFileName("Kotsumo");

    }


}
