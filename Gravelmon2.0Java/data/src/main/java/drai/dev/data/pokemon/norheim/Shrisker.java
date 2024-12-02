package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Shrisker extends drai.dev.data.pokemon.Pokemon {
    public Shrisker() {
        super("Shrisker",
                Type.GRASS, Type.ELECTRIC,
                new Stats(80,
                        58,
                        50,
                        80,
                        78,
                        82),
                List.of(Ability.STATIC,Ability.CHLOROPHYLL,Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                4, 165,
                new Stats(0,0,0,0,0,0), 130,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,5),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,8),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,11),
                        new MoveLearnSetEntry(Move.GROWTH,15),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,18),
                        new MoveLearnSetEntry(Move.NUZZLE,23),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,31),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,35),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,40),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,45),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,52),
                        new MoveLearnSetEntry(Move.VOLT_TACKLE,60),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"tm"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 9, 27, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE, Biome.IS_TAIGA))),
                List.of(SpawnPreset.FOLIAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Shrisker");

    }


}
