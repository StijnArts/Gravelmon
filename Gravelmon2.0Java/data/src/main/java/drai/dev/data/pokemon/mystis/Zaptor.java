package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Zaptor extends drai.dev.data.pokemon.Pokemon {
    public Zaptor() {
        super("Zaptor",
                Type.ELECTRIC, Type.DRAGON,
                new Stats(65,
                        65,
                        55,
                        95,
                        55,
                        85),
                List.of(Ability.RELENTLESS,Ability.LIGHTNING_ROD), Ability.TANTRUM,
                0, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                147, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Zaptor like to hunt in groups, often delegating different roles to other members of the group. Their usual hunting strategy is to chase down prey to the point of exhaustion, shocking them with jolts of electricity to wear them down or paralyse them."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Zaptor");

    }


}
