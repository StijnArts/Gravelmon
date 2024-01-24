package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Shimm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shimm() {
        super("Shimm",
                Type.PSYCHIC,
                new Stats(70,
                        73,
                        55,
                        47,
                        41,
                        40),
                List.of(Ability.MAGICIAN), Ability.SUPER_LUCK,
                8, 165,
                new Stats(0,1,0,0,0,0), 220,
                0.5,
                88, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Believed to be a magic box that was brought to life by a magician, pulling out the dagger from it will kill it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JAB,1),
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
           setLangFileName("Shimm");

    }


}
