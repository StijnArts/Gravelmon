package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Somberscribe extends drai.dev.gravelmon.pokemon.Pokemon {
    public Somberscribe() {
        super("Somberscribe",
                Type.POISON,Type.DARK,
                new Stats(95,
                        125,
                        70,
                        105,
                        95,
                        40),
                List.of(Ability.DARKHOLD), Ability.DARKHOLD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("Somberscribe secrete a thick, ink-like substance from their bodies that are said to have sinister properties. Scriptures and tomes written with a Sombercribe’s ink are said to be cursed, and will bring misfortune to those who wrote and read it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAR_SHOT,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Somberscribe");

    }


}
