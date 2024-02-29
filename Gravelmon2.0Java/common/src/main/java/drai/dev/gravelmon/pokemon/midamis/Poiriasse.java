package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Poiriasse extends drai.dev.gravelmon.pokemon.Pokemon {
    public Poiriasse() {
        super("Poiriasse",
                Type.ICE,Type.POISON,
                new Stats(80,
                        90,
                        70,
                        110,
                        80,
                        80),
                List.of(Ability.SHIELD_DUST), Ability.SNOW_WARNING,
                15, 165,
                new Stats(0,1,0,2,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.WATER_1),
                List.of("Poiriasse are always surrounded by a layer of dust, which is a mix of poison and ice. Any Pokemon or person who comes into physical contact with the layer is most likely to become poisoned and frozen."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.CHARM,5),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,10),
                        new MoveLearnSetEntry(Move.DISABLE,15),
                        new MoveLearnSetEntry(Move.BODY_SLAM,20),
                        new MoveLearnSetEntry(Move.SLUDGE,25),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,30),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,35),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,40),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,45),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,50),
                        new MoveLearnSetEntry(Move.FREEZEDRY,55),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.WATER_GUN,"tm"),
                        new MoveLearnSetEntry(Move.SPLASH,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 31, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY))
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Poiriasse");

    }


}
