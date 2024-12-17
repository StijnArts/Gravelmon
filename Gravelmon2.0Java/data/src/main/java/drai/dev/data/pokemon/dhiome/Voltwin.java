package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Voltwin extends drai.dev.data.pokemon.Pokemon {
    public Voltwin(Stats stats) {
        super("Voltwin",
                Type.STEEL, Type.ELECTRIC,
                stats,
                List.of(Ability.ANALYTIC), Ability.ANALYTIC,
                2, 0,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They move in complementary pairs. Their personality changes depending on their electric charge."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BARRIER,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,8),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,10),
                        new MoveLearnSetEntry(Move.SPARK,13),
                        new MoveLearnSetEntry(Move.HYPNOSIS,19),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,22),
                        new MoveLearnSetEntry(Move.SELFREPAIR,25),
                        new MoveLearnSetEntry(Move.STUNJAB,27),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,31),
                        new MoveLearnSetEntry(Move.PSYCH_UP,35),
                        new MoveLearnSetEntry(Move.DISCHARGE,38),
                        new MoveLearnSetEntry(Move.LOCKON,42),
                        new MoveLearnSetEntry(Move.METAL_BURST,46),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,52)
                ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 11, 32, 1.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Voltwin");

    }


}
