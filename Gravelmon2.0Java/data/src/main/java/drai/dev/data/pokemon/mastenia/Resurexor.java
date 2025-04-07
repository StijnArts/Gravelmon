package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Resurexor extends drai.dev.data.pokemon.Pokemon {
    public Resurexor() {
        super("Resurexor",
                Type.DRAGON, Type.GROUND,
                new Stats(96,
                        126,
                        96,
                        146,
                        116,
                        86),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                32, 0,
                new Stats(0,1,0,2,0,0), 6,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Resurexor is believed to come from a different solar system. Legends says that it has the power to resurrect other Pokémon from the ground, usually from an ancient time period. Its intentions are unclear."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,1),
                        new MoveLearnSetEntry(Move.SHADOW_BONE,1),
                        new MoveLearnSetEntry(Move.METEOR_MASH,1),
                        new MoveLearnSetEntry(Move.BONE_RUSH,1),
                        new MoveLearnSetEntry(Move.REVIVAL_BLESSING,1),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,1),
                        new MoveLearnSetEntry(Move.PSYSHOCK,1),
                        new MoveLearnSetEntry(Move.CRAFTY_SHIELD,1),
                        new MoveLearnSetEntry(Move.PSYCH_UP,1),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,1),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,1),
                        new MoveLearnSetEntry(Move.SAND_TOMB,1),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,1),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,1),
                        new MoveLearnSetEntry(Move.EARTH_POWER,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,1),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,1),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,1),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,1),
                        new MoveLearnSetEntry(Move.GRAVITY,1)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DEEP_DARK)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Resurexor");

    }


}
