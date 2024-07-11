package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Tottapotta extends drai.dev.data.pokemon.Pokemon {
    public Tottapotta() {
        super("Chamot",
                Type.GROUND, Type.GRASS,
                new Stats(45,
                        30,
                        95,
                        30,
                        38,
                        22),
                List.of(Ability.STORM_DRAIN), Ability.HEATPROOF,
                6, 165,
                new Stats(0,0,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Chamot find abandoned clay pots to protect themselves from the harsh environment. During ancient times, tribesmen would often adorn their Chamot's pots with gold and silver embellishments."),
                List.of(new EvolutionEntry("terradobe", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
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
                List.of(SpawnPreset.TRAIL_RUINS),
                0.28, 0.3,
                List.of());
           setLangFileName("Tottapotta");

    }


}
