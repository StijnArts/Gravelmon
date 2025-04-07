package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Plumine extends drai.dev.data.pokemon.Pokemon {
    public Plumine() {
        super("Plumine",
                Type.GROUND,
                new Stats(80,
                        115,
                        94,
                        62,
                        85,
                        94),
                List.of(Ability.SAND_FORCE), Ability.SAND_FORCE,
                16, 600,
                new Stats(0,3,0,0,0,0), 45,
                0.75,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It digs up the burrows of other Pokémon in search of prey in a matter of seconds thanks to its sturdy wings. It is mostly terrestrial, although it can take to the skies to look for nearby water."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROTOTILLER,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.DUST_KICK,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.PECK,15),
                        new MoveLearnSetEntry(Move.SAND_TOMB,18),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,23),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,27),
                        new MoveLearnSetEntry(Move.DIG,32),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,36),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,45),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,53),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,62),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tm"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"tm"),
                        new MoveLearnSetEntry(Move.DEFOG,"tm"),
                        new MoveLearnSetEntry(Move.WING_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,"tm"),
                        new MoveLearnSetEntry(Move.SANDSHOT,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Plumine");

    }


}
