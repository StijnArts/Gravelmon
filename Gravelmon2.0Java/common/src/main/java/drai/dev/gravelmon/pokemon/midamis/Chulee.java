package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Chulee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chulee() {
        super("Chulee",
                Type.FIGHTING,Type.FLYING,
                new Stats(40,
                        50,
                        35,
                        30,
                        35,
                        50),
                List.of(Ability.EARLY_BIRD), Ability.EARLY_BIRD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("New Ability - Iron Will: status effects have a lower percentage of effect on this pokémon (confusion, paralyze infatuation etc)"),
                List.of(),
                List.of(                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chulee");

    }


}
