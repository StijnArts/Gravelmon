package drai.dev.gravelmon.pokemon.terranov;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Rajang extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rajang() {
        super("Rajang",
                Type.ELECTRIC,Type.FIGHTING,
                new Stats(70,
                        140,
                        89,
                        130,
                        78,
                        83),
                List.of(Ability.GUTS), Ability.GORILLA_TACTICS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Despite being small, it is astoundingly strong. Rajang will feed on Kirin horns to get its electric powers, when powered up its dark fur turns into a shiny golden mane."),
                List.of(),
                List.of(                        ),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rajang");

    }


}
