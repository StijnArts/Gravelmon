package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Jellohat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jellohat() {
        super("Jellohat",
                Type.POISON,
                new Stats(120,
                        50,
                        90,
                        75,
                        90,
                        35),
                List.of(Ability.EFFECT_SPORE,Ability.LIQUID_OOZE), Ability.UNAWARE,
                13, 400,
                new Stats(2,0,0,0,0,0), 75,
                0.5,
                163, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It is oblivious to danger as its poisonous jelly hat protects it from anything, but if it happens to lose its hat it will go scurry and hide inside deep caves till another grows."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Jellohat");

    }


}
