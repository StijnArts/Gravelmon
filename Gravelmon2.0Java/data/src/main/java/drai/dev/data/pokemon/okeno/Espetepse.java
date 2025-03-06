package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Espetepse extends drai.dev.data.pokemon.Pokemon {
    public Espetepse() {
        super("Espetepse",
                Type.ROCK, Type.BUG,
                new Stats(111,
                        92,
                        90,
                        61,
                        90,
                        51),
                List.of(Ability.POISON_POINT), Ability.LIGHTNING_ROD,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.BUG),
                List.of("Confusion Psychic Hypnosis Psychic Confuse Ray Ghost Brine Water Gastro Acid Poison Toxic Spikes Poison Spiky Shield Grass Sticky Web Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Espetepse");

    }


}
