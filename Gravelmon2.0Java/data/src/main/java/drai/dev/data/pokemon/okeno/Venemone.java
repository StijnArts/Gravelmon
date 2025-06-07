package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Venemone extends drai.dev.data.pokemon.Pokemon {
    public Venemone() {
        super("Venemone",
                Type.POISON, Type.WATER,
                new Stats(83,
                        70,
                        83,
                        40,
                        83,
                        21),
                List.of(Ability.SUCTION_CUPS,Ability.TIGHTGRIP,Ability.STORM_DRAIN), Ability.STORM_DRAIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Hypnosis Psychic Water PulseSTAB Water Aqua Ring Water VenoshockSTAB Poison Clear SmogSTAB Poison Vortex DrainSTAB Water"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"tm"),
                        new MoveLearnSetEntry(Move.VORTEXDRAIN,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Venemone");

    }


}
