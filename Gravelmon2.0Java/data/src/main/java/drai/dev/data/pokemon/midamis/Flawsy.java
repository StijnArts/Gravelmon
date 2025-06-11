package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Flawsy extends drai.dev.data.pokemon.Pokemon {
    public Flawsy() {
        super("Flawsy",
                Type.GROUND, Type.PSYCHIC,
                new Stats(30,
                        30,
                        40,
                        40,
                        35,
                        35),
                List.of(Ability.SYNCHRONIZE), Ability.OWN_TEMPO,
                7, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("flawepsi", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
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
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Flawsy");

    }


}
