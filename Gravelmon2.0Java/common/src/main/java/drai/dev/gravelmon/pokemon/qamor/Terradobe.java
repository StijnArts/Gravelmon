package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Terradobe extends drai.dev.gravelmon.pokemon.Pokemon {
    public Terradobe() {
        super("Terradobe",
                Type.GROUND,Type.GRASS,
                new Stats(88,
                        68,
                        120,
                        76,
                        88,
                        75),
                List.of(Ability.STORM_DRAIN), Ability.HEATPROOF,
                30, 165,
                new Stats(0,0,0,0,0,0), 40,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Terradobe carry complete ecosystems on their back, many different types poke Pokemon will often use it as shelter. Terradobe are considered protective spirits of Qamoran ruins."),
                List.of(),
                List.of(                   new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.ABSORB,5),
                        new MoveLearnSetEntry(Move.LEECH_SEED,9),
                        new MoveLearnSetEntry(Move.MUD_SHOT,14),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,18),
                        new MoveLearnSetEntry(Move.SWALLOW,23),
                        new MoveLearnSetEntry(Move.INGRAIN,27),
                        new MoveLearnSetEntry(Move.MUD_BOMB,32),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,36),
                        new MoveLearnSetEntry(Move.AQUA_RING,41),
                        new MoveLearnSetEntry(Move.EARTH_POWER,45),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,50)     ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 28, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SANDY))
                ), List.of(),
                List.of(SpawnPreset.TRAIL_RUINS, SpawnPreset.DESERT_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Terradobe");

    }


}
