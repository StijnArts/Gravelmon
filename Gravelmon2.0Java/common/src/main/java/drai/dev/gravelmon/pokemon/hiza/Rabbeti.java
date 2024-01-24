package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Rabbeti extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rabbeti() {
        super("Rabbeti",
                Type.ICE,
                new Stats(51,
                        66,
                        40,
                        30,
                        24,
                        74),
                List.of(Ability.SLUSH_RUSH,Ability.SOUNDPROOF,Ability.SNOW_WARNING), Ability.SNOW_WARNING,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                50, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("During the warmer season, its fur turns into a darker color, allowing to blend in netter with the vegetation."),
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
           setLangFileName("Rabbeti");

    }


}
