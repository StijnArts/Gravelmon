package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Siberizen extends drai.dev.gravelmon.pokemon.Pokemon {
    public Siberizen() {
        super("Siberizen",
                Type.ICE,Type.DARK,
                new Stats(80,
                        135,
                        70,
                        90,
                        70,
                        110),
                List.of(Ability.SNOW_CLOAK,Ability.ICE_BODY,Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                8, 165,
                new Stats(0,2,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Known as the judge of the north, Siberizen is a powerful yet wise Pokémon. It chooses the fate of those found within its territory by its underlings."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Siberizen");

    }


}
