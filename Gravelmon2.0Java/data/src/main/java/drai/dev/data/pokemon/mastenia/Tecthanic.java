package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tecthanic extends drai.dev.data.pokemon.Pokemon {
    public Tecthanic() {
        super("Tecthanic",
                Type.POISON, Type.GROUND,
                new Stats(130,
                        80,
                        115,
                        135,
                        125,
                        15),
                List.of(Ability.CONTAMINATE), Ability.ARENA_TRAP,
                21, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- MagnitudeSTAB Ground - BulldozeSTAB Ground - Corrosive Gas Poison - Poison Gas Poison - Smokescreen Normal - Eruption Fire - Steam Eruption Water - Scorching SandsSTAB Ground - Scald Water - Boomburst Normal - Scary Face Normal - Stomping TantrumSTAB Ground - Hyper Voice Normal - FissureSTAB Ground - Earth PowerSTAB Ground - Psychic Noise Psychic - Uproar Normal - Smokescreen Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.UPROAR,1),
                        new MoveLearnSetEntry(Move.ERUPTION,1),
                        new MoveLearnSetEntry(Move.BOOMBURST,1),
                        new MoveLearnSetEntry(Move.PSYCHICNOISE,1),
                        new MoveLearnSetEntry(Move.SCALD,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,1),
                        new MoveLearnSetEntry(Move.MAGNITUDE,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.FISSURE,1),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,1),
                        new MoveLearnSetEntry(Move.EARTH_POWER,1),
                        new MoveLearnSetEntry(Move.CORROSIVE_GAS,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,1),
                        new MoveLearnSetEntry(Move.STEAM_ERUPTION,1),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,1)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SEAFLOOR)
                        .setBiomes(Biome.IS_OCEAN)
                        .setSpawnPreset(SpawnPreset.NEAR_MAGMA).build(),
                List.of());
        setCanBreathUnderwater(true);
           setLangFileName("Tecthanic");

    }


}
