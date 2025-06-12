package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Guardiant extends drai.dev.data.pokemon.Pokemon {
    public Guardiant() {
        super("Guardiant",
                Type.BUG, Type.FIGHTING,
                new Stats(65,
                        134,
                        126,
                        43,
                        55,
                        78),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,7),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.PESTER,14),
                        new MoveLearnSetEntry(Move.COUNTER,18),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,21),
                        new MoveLearnSetEntry(Move.STEAMROLLER,24),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,29),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,37),
                        new MoveLearnSetEntry(Move.GYRO_BALL,44),
                        new MoveLearnSetEntry(Move.DETECT,53),
                        new MoveLearnSetEntry(Move.SUPERPOWER,57)              ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Guardiant");

    }


}
