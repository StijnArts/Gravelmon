package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Wilspri extends drai.dev.data.pokemon.Pokemon {
    public Wilspri() {
        super("Wilspri",
                Type.GRASS, Type.GHOST,
                new Stats(50,
                        78,
                        56,
                        80,
                        68,
                        68),
                List.of(Ability.UNBURDEN), Ability.INSOMNIA,
                8, 165,
                new Stats(0,1,0,1,0,0), 45,
                0.5,
                151, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("It is said to be the spirit of a young child who wandered (or was lured) into the forest at night and never returned. Rumor has it that Wilspri was a child who got trapped in deep in the forest and passed. You can occasionally hear a child's weeping, which is said to be the sound of an angered Wilspri."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wilspri");

    }


}
