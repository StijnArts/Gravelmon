package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Terrapotta extends drai.dev.gravelmon.pokemon.Pokemon {
    public Terrapotta() {
        super("Terrapotta",
                Type.GROUND,
                new Stats(45,
                        33,
                        76,
                        44,
                        87,
                        22),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Created by combining pottery fragments excavated from Lonava's many pastoral fields, Snagment are surprisingly tough. Some Snagment pieces have been dated back centuries, from a time now lost to history."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.CONFUSION,5),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,9),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,14),
                        new MoveLearnSetEntry(Move.MUD_SHOT,18),
                        new MoveLearnSetEntry(Move.SPIKES,22),
                        new MoveLearnSetEntry(Move.PALEOBREATH,27),
                        new MoveLearnSetEntry(Move.SANDBLAST,31),
                        new MoveLearnSetEntry(Move.IMPRISON,35),
                        new MoveLearnSetEntry(Move.SONIC_SAND,40),
                        new MoveLearnSetEntry(Move.TRICK,44),
                        new MoveLearnSetEntry(Move.STONE_EDGE,48)
                ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 25, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.TRAIL_RUINS),
                0.28, 0.3,
                List.of());
           setLangFileName("Terrapotta");

    }


}
