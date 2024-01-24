package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Aviterate extends drai.dev.gravelmon.pokemon.Pokemon {
    public Aviterate() {
        super("Aviterate",
                Type.FIRE,Type.ELECTRIC,
                new Stats(80,
                        90,
                        75,
                        90,
                        75,
                        120),
                List.of(Ability.BLAZE), Ability.IGNITION,
                8, 165,
                new Stats(0,0,0,0,0,3), 45,
                0.5,
                231, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("As it dashes through the land it leaves behind a trail of flames. It casts lightning from the skies, incinerating the land bellow."),
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
           setLangFileName("Aviterate");

    }


}
