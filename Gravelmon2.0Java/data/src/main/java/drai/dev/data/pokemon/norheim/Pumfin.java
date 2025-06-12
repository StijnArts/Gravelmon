package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Pumfin extends drai.dev.data.pokemon.Pokemon {
    public Pumfin() {
        super("Pumfin",
                Type.DARK, Type.GRASS,
                new Stats(66,
                        77,
                        76,
                        90,
                        86,
                        66),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROAR,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,6),
                        new MoveLearnSetEntry(Move.PAYBACK,16),
                        new MoveLearnSetEntry(Move.GLARE,26),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,36),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,46),
                        new MoveLearnSetEntry(Move.HORN_LEECH,56),
                        new MoveLearnSetEntry(Move.CRUNCH,66),
                        new MoveLearnSetEntry(Move.TOXIC,76),
                        new MoveLearnSetEntry(Move.BELCH,86)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Pumfin");

    }


}
