package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Hylamancer extends drai.dev.data.pokemon.Pokemon {
    public Hylamancer() {
        super("Hylamancer",
                Type.FIRE, Type.GHOST,
                new Stats(90,
                        50,
                        74,
                        128,
                        106,
                        86),
                List.of(Ability.BLAZE), Ability.MAGIC_BOUNCE,
                17, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MOONLIGHT,1),
                        new MoveLearnSetEntry(Move.EMBER,4),
                        new MoveLearnSetEntry(Move.GROWTH,6),
                        new MoveLearnSetEntry(Move.SPITE,9),
                        new MoveLearnSetEntry(Move.ASTONISH,12),
                        new MoveLearnSetEntry(Move.HELPING_HAND,14),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,18),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,21),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,23),
                        new MoveLearnSetEntry(Move.HEX,28),
                        new MoveLearnSetEntry(Move.WILLOWISP,32),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,35),
                        new MoveLearnSetEntry(Move.INFERNO,41),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,45),
                        new MoveLearnSetEntry(Move.BURN_UP,50),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,56)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Hylamancer");

    }


}
