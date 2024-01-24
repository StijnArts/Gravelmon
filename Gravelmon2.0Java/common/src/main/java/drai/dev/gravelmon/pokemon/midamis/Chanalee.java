package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Chanalee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chanalee() {
        super("Chanalee",
                Type.FIGHTING,Type.FLYING,
                new Stats(70,
                        80,
                        55,
                        50,
                        55,
                        75),
                List.of(Ability.SCRAPPY), Ability.SCRAPPY,
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
           setLangFileName("Chanalee");

    }


}
