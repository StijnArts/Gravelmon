package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Ampire extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ampire() {
        super("Ampire",
                Type.DARK, Type.ELECTRIC,
                new Stats(85,
                        95,
                        80,
                        95,
                        80,
                        100),
                List.of(Ability.TRIAGE), Ability.SURGE_SURFER,
                15, 850,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ampire are not welcome in major cities as they will hang from Transmission Towers at night often causing damage and large power outages."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ampire");

    }


}
