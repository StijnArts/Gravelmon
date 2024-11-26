package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bludgen extends Pokemon {
    public Bludgen() {
        super("Bludgen",
                Type.FIGHTING,
                new Stats(110,
                        115,
                        90,
                        65,
                        70,
                        75),
                List.of(Ability.GUTS, Ability.SHEER_FORCE), Ability.STAND_OFF,
                15, 365,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("Even when confronted by a large number of opponents, Bludgen attacks with all of its body parts at the same time, a breathtakingly terrifying display of brute strength and technique."),
                List.of(),
                List.of(
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 33, 54, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_HIGHLANDS))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
