package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Kragodon extends drai.dev.data.pokemon.Pokemon {
    public Kragodon(Stats stats) {
        super("Kragodon",
                Type.ROCK, Type.GROUND,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,5),
                        new MoveLearnSetEntry(Move.MUD_SPORT,10),
                        new MoveLearnSetEntry(Move.MUD_BOMB,12),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,16),
                        new MoveLearnSetEntry(Move.BLOCK,20),
                        new MoveLearnSetEntry(Move.BULLDOZE,23),
                        new MoveLearnSetEntry(Move.QUASH,27),
                        new MoveLearnSetEntry(Move.RELICPILLAR,31),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,35),
                        new MoveLearnSetEntry(Move.EARTH_POWER,40),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46)
                ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TUNDRA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Kragodon");

    }


}
