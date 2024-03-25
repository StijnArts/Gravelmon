package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Eyenoes extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eyenoes() {
        super("Eyenoes",
                Type.GHOST,Type.PSYCHIC,
                new Stats(100,
                        45,
                        70,
                        105,
                        100,
                        80),
                List.of(Ability.KEEN_EYE,Ability.FOREWARN), Ability.SHADOW_TAG,
                0, 0,
                new Stats(0,0,0,3,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Eyenoes have incredible vision, allowing them to partially see through walls. They are also able to sense the passing of those around and will shriek whenever someones time is up."),
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
           setLangFileName("Eyenoes");

    }


}
