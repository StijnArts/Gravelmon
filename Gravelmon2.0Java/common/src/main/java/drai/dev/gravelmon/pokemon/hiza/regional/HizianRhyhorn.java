package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianRhyhorn extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianRhyhorn() {
        super("Rhyhorn",
                Type.ICE,
                new Stats(80,
                        85,
                        95,
                        30,
                        30,
                        25),
                List.of(Ability.MOUNTAINEER), Ability.THICK_FAT,
                8, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                69, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("The thick fur that covers its body protects from extreme cold. The most violent blizzard would not stop it on its track."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rhyhorn");

    }


}
