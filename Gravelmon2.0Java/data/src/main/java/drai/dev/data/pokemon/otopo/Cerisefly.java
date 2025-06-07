package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cerisefly extends drai.dev.data.pokemon.Pokemon {
    public Cerisefly() {
        super("Cerisefly",
                Type.BUG, Type.PSYCHIC,
                new Stats(70,
                        40,
                        50,
                        100,
                        60,
                        90),
                List.of(Ability.TINTED_LENS,Ability.SWARM), Ability.ADAPTABILITY,
                0, 0,
                new Stats(0,0,0,2,0,1), 45,
                0.5,
                185, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its wings light up in a pattern that confuses adversaries. When it is startled, its antennae quiver, causing a mental pulse that confuses enemies."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SILVER_WIND,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.CONFUSION,11),
                        new MoveLearnSetEntry(Move.POISON_POWDER,13),
                        new MoveLearnSetEntry(Move.PSYBEAM,17),
                        new MoveLearnSetEntry(Move.STUN_SPORE,23),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,25),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,29),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,37),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,41),
                        new MoveLearnSetEntry(Move.POISON_FANG,47),
                        new MoveLearnSetEntry(Move.PSYCHIC,55),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,59),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,63)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Cerisefly");

    }


}
