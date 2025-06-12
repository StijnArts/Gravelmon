package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Psiantor extends drai.dev.data.pokemon.Pokemon {
    public Psiantor() {
        super("Psiantor",
                Type.GROUND, Type.PSYCHIC,
                new Stats(100,
                        80,
                        95,
                        100,
                        80,
                        75),
                List.of(Ability.DEFIANT), Ability.OWN_TEMPO,
                24, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,6),
                        new MoveLearnSetEntry(Move.MUD_SPORT,9),
                        new MoveLearnSetEntry(Move.CONFUSION,12),
                        new MoveLearnSetEntry(Move.IMPRISON,15),
                        new MoveLearnSetEntry(Move.MAGNITUDE,19),
                        new MoveLearnSetEntry(Move.SWALLOW,22),
                        new MoveLearnSetEntry(Move.MUD_BOMB,26),
                        new MoveLearnSetEntry(Move.RESONATE,32),
                        new MoveLearnSetEntry(Move.AMNESIA,37),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,41),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,45),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,48),
                        new MoveLearnSetEntry(Move.MUDSLIDE,52),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,58),
                        new MoveLearnSetEntry(Move.BELCH,64)                 ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(45)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Psiantor");

    }


}
