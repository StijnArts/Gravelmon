package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Felifluff extends drai.dev.data.pokemon.Pokemon {
    public Felifluff() {
        super("Felifluff",
                Type.GRASS,
                new Stats(60,
                        60,
                        58,
                        67,
                        58,
                        80),
                List.of(Ability.CHLOROPHYLL,Ability.OVERCOAT,Ability.COTTON_DOWN), Ability.COTTON_DOWN,
                6, 165,
                new Stats(0,0,0,0,0,2), 120,
                0.5,
                119, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Their playful but elegant behavior makes them the most popular Pokemon among high-society. Brushing its fur improves not only its looks, but also its battling capabilities."),
                List.of(new EvolutionEntry("empurroar", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.GROWTH,6),
                        new MoveLearnSetEntry(Move.STUN_SPORE,10),
                        new MoveLearnSetEntry(Move.ALLERGYPOLLEN,13),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,17),
                        new MoveLearnSetEntry(Move.CHARM,21),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,25),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,29),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,33),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,37),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,41),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,45),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,50),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.POISON_POWDER,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 16, 33, .8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Felifluff");

    }


}
