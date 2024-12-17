package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Efflutal extends drai.dev.data.pokemon.Pokemon {
    public Efflutal(Stats stats) {
        super("Efflutal",
                Type.PSYCHIC, Type.FIRE,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 99,
                new Stats(0,0,0,0,0,0), 40,
                0.5,
                120, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Concept, Name, Type by Arnik Sprites by Anarlaurendil These designs/sprites are originally created for an abandoned french GBA ROM-hack called 'Pokémon Cristal de Jade', and now features in Pokémon Sacred Phoenix"),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Efflutal");

    }


}
