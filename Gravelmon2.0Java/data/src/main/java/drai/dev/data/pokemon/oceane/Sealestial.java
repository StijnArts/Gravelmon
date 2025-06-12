package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sealestial extends drai.dev.data.pokemon.Pokemon {
    public Sealestial() {
        super("Sealestial",
                Type.BUG, Type.POISON,
                new Stats(73,
                        50,
                        105,
                        95,
                        55,
                        72),
                List.of(Ability.SHELL_ARMOR), Ability.POISON_POINT,
                13, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                203, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of("It moves gracefully like a dancer but also has a dark side. After stinging its prey and paralyzing it, it proceeds to slowly swallow it alive."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,1),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm")                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 20, 43, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
