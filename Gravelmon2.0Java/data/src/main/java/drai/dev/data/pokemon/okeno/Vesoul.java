package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vesoul extends drai.dev.data.pokemon.Pokemon {
    public Vesoul() {
        super("Vesoul",
                Type.GROUND,Type.GHOST,
                new Stats(28,
                        28,
                        80,
                        94,
                        80,
                        22),
                List.of(Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                6, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.DRAGON),
                List.of(""),
                List.of(new EvolutionEntry("marajar", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 13, 33, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT))
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Vesoul");

    }


}
