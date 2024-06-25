package drai.dev.gravelmon.pokemon.nodorro.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Roselia extends drai.dev.gravelmon.pokemon.Pokemon {
    public Roselia(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "Roselia",
                Type.GRASS, Type.POISON,
                new Stats(60,
                        60,
                        45,
                        100,
                        80,
                        65),
                List.of(Ability.NATURAL_CURE,Ability.POISON_POINT), Ability.LEAF_GUARD,
                9, 100,
                new Stats(0,0,0,2,0,0), 30,
                0.5,
                143, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FAIRY),
                List.of("Roselia are commonly seen when it is spring in Nodorro. this is due to most budew evolving in the spring where their magnificent flowers can start to grow."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ABSORB,3),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,8),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,13),
                        new MoveLearnSetEntry(Move.POISON_POWDER,15),
                        new MoveLearnSetEntry(Move.NATURE_POWER,16),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,20),
                        new MoveLearnSetEntry(Move.WORRY_SEED,24),
                        new MoveLearnSetEntry(Move.SYNTHESIS,29),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,35),
                        new MoveLearnSetEntry(Move.LEAF_STORM,48),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.MIND_READER,"tm"),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"tm"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm")                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Roselia");

    }


}
