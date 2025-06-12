package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Petricus extends drai.dev.data.pokemon.Pokemon {
    public Petricus() {
        super("Petricus",
                Type.GRASS, Type.PSYCHIC,
                new Stats(65,
                        50,
                        75,
                        120,
                        95,
                        85),
                List.of(Ability.DAZZLING), Ability.INTIMIDATE,
                15, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Petricus's beautiful tail feathers dazzle many of it's onlookers. It's also known to use them offensively, to make it's prey to feel cornered."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.CONFUSION,5),
                        new MoveLearnSetEntry(Move.AMNESIA,9),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,12),
                        new MoveLearnSetEntry(Move.PSYBEAM,15),
                        new MoveLearnSetEntry(Move.CALM_MIND,19),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,23),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,26),
                        new MoveLearnSetEntry(Move.PSYCHIC,29),
                        new MoveLearnSetEntry(Move.SYNTHESIS,35),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,39),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,45),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,"tm"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .setAntiBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Petricus");

    }


}
