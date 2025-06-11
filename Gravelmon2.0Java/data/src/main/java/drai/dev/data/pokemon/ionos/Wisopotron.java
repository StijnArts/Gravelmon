package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wisopotron extends drai.dev.data.pokemon.Pokemon {
    public Wisopotron() {
        super("Wisopotron",
                Type.BUG, Type.FIGHTING,
                new Stats(90,
                        100,
                        111,
                        85,
                        89,
                        10),
                List.of(Ability.INNER_FOCUS,Ability.OWN_TEMPO), Ability.REGENERATOR,
                17, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Awake at night only to study the stars. Wisopotron always fall asleep twenty minutes after dawn with its face facing towards the sun. The back of this Pokémon is always hidden in the shadows and is a way of balancing its body heat. It is also covered with polypores which functions in a similar way as elytrons, offering excellent defense. The star shaped head along with its long neck works as an offensive weapon, much like a morning star."),
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
                        new MoveLearnSetEntry(Move.SUPERPOWER,57)                         ),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Wisopotron");

    }


}
