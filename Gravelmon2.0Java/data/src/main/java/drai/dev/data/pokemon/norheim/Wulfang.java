package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Wulfang extends drai.dev.data.pokemon.Pokemon {
    public Wulfang() {
        super("Wulfang",
                Type.GHOST,
                new Stats(83,
                        126,
                        66,
                        96,
                        113,
                        96),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                22, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The twin of the Serpent with eyes full of primal hate, Wyrmundel. Wulfang dwells from the coast of the Ore Sea to the center of Migard only to cause terror to poor souls."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,6),
                        new MoveLearnSetEntry(Move.ROAR,12),
                        new MoveLearnSetEntry(Move.SPITE,24),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,30),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.BONE_RUSH,42),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,48),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,54),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,60),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,66),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,72),
                        new MoveLearnSetEntry(Move.PSYCHIC,78)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Wulfang");

    }


}
