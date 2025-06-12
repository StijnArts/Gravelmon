package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Glittle extends drai.dev.data.pokemon.Pokemon {
    public Glittle() {
        super("Glittle",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 0,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("During the darkest nights with little moonlight, Glittle will crawl out and glow with the faintest light to guide trainers along who might be lost. Glittle love the company of it's own kind, making bright lights when happy."),
                List.of(new EvolutionEntry("lupupa", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"7")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,15),
                        new MoveLearnSetEntry(Move.FLAIL,20),
                        new MoveLearnSetEntry(Move.PSYBEAM,25)
                ),
                List.of(Label.CYARE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Glittle");

    }


}
