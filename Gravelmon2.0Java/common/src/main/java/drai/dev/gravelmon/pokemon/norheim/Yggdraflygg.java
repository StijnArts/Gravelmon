package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Yggdraflygg extends drai.dev.gravelmon.pokemon.Pokemon {
    public Yggdraflygg() {
        super("Yggdraflygg",
                Type.BUG,Type.DARK,
                new Stats(85,
                        125,
                        70,
                        80,
                        60,
                        80),
                List.of(Ability.INTIMIDATE,Ability.SPEED_BOOST,Ability.STRONG_JAW), Ability.STRONG_JAW,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Yggdraflygg are able to drain out the life force of entire forests. On occasion they pick up cattle from the ground; only to drop them from terrifying heights."),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Yggdraflygg");

    }


}
