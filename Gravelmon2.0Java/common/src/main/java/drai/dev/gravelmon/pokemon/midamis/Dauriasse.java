package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Dauriasse extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dauriasse() {
        super("Dauriasse",
                Type.DARK,Type.STEEL,
                new Stats(80,
                        110,
                        90,
                        80,
                        70,
                        80),
                List.of(Ability.INTIMIDATE), Ability.ANGER_POINT,
                8, 165,
                new Stats(0,2,1,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.WATER_1),
                List.of("This Pokemon aggressive Pokemon has brutal strength, but doesn't really have heavy-hitting attacks. When angry they spit balls of fire and smoke literally comes out of its ears."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.CHARM,5),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,10),
                        new MoveLearnSetEntry(Move.DISABLE,15),
                        new MoveLearnSetEntry(Move.BODY_SLAM,20),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,25),
                        new MoveLearnSetEntry(Move.IRON_TAIL,30),
                        new MoveLearnSetEntry(Move.IRON_HEAD,35),
                        new MoveLearnSetEntry(Move.WILLOWISP,40),
                        new MoveLearnSetEntry(Move.BULLDOZE,45),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,50),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,55),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.WATER_GUN,"tm"),
                        new MoveLearnSetEntry(Move.SPLASH,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm"),
                        new MoveLearnSetEntry(Move.SOAK,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dauriasse");

    }


}
