package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Zhimm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Zhimm() {
        super("Zhimm",
                Type.PSYCHIC,
                new Stats(95,
                        100,
                        88,
                        70,
                        72,
                        55),
                List.of(Ability.MAGICIAN), Ability.SUPER_LUCK,
                8, 165,
                new Stats(0,2,0,0,0,0), 185,
                0.5,
                125, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It has the ability to transfer magic between it's two bodies, which both have minds of their own. Zhimms love to do tricks on both young and old, but their blades have proven to be a bit dangerous."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"tm"),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Zhimm");

    }


}
