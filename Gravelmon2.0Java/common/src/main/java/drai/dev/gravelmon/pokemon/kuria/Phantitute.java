package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Phantitute extends drai.dev.gravelmon.pokemon.Pokemon {
    public Phantitute() {
        super("Phantitute",
                Type.NORMAL,Type.GHOST,
                new Stats(80,
                        90,
                        100,
                        90,
                        100,
                        55),
                List.of(Ability.PROXY), Ability.PROXY,
                8, 127,
                new Stats(0,0,1,0,1,0), 45,
                0.0,
                167, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Phantitute searches for the damaged dolls of children in poverty. It'll act like a friend towards the child, but will become extremely protective, to the point where some people say that the kid is being held hostage."),
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
           setLangFileName("Phantitute");

    }


}
