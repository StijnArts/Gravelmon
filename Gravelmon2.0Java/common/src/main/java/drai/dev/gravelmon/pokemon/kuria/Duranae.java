package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Duranae extends drai.dev.gravelmon.pokemon.Pokemon {
    public Duranae() {
        super("Duranae",
                Type.GROUND,Type.BUG,
                new Stats(60,
                        75,
                        60,
                        40,
                        40,
                        40),
                List.of(Ability.BATTLE_ARMOR,Ability.STURDY), Ability.SHEER_FORCE,
                3, 214,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                70, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.BUG),
                List.of("Their shells are nearly indestructible, this is to protect their soft vulnerable insides from being hurt. They ram walls in caves to find rare minerals to eat."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Duranae");

    }


}
