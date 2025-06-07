package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Brawlout extends drai.dev.data.pokemon.Pokemon {
    public Brawlout() {
        super("Brawlout",
                Type.FIGHTING,
                new Stats(50,
                        95,
                        75,
                        50,
                        45,
                        80),
                List.of(Ability.INNER_FOCUS), Ability.GUTS,
                17, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Training sessions with Brawlout are very intense, but they still struggle to know their own limits and must be monitored. Losing the weight bands gives the mon a boost in speed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,1),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,6),
                        new MoveLearnSetEntry(Move.REVENGE,12),
                        new MoveLearnSetEntry(Move.SUBMISSION,16),
                        new MoveLearnSetEntry(Move.BULK_UP,21),
                        new MoveLearnSetEntry(Move.BODY_SLAM,27),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,32),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,37),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,41),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,46),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,50),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,55)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Brawlout");

    }


}
