package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Medissin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Medissin() {
        super("Medissin",
                Type.GHOST,Type.POISON,
                new Stats(52,
                        40,
                        43,
                        51,
                        63,
                        76),
                List.of(Ability.PRANKSTER), Ability.POISON_TOUCH,
                8, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.AMORPHOUS),
                List.of("Medissin are always found wrapped around a bone-like rod. Should the rod be taken from it, it will fall ill and fade away. So will whoever took the rod."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Medissin");

    }


}
