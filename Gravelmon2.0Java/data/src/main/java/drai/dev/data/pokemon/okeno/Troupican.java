package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Troupican extends drai.dev.data.pokemon.Pokemon {
    public Troupican() {
        super("Troupican",
                Type.NORMAL, Type.FLYING,
                new Stats(80,
                        70,
                        72,
                        102,
                        85,
                        71),
                List.of(Ability.BIG_PECKS,Ability.COMPETITIVE,Ability.OWN_TEMPO), Ability.OWN_TEMPO,
                13, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.75,
                163, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHIRP,1),
                        new MoveLearnSetEntry(Move.ENCORE,6),
                        new MoveLearnSetEntry(Move.SING,10),
                        new MoveLearnSetEntry(Move.ROUND,15),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,19),
                        new MoveLearnSetEntry(Move.SWAGGER,23),
                        new MoveLearnSetEntry(Move.UPROAR,27),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,30),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,34),
                        new MoveLearnSetEntry(Move.DRILL_PECK,39),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,43),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,46),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,50),
                        new MoveLearnSetEntry(Move.PARADISEDISPLAY,55),
                        new MoveLearnSetEntry(Move.PERISH_SONG,59),
                        new MoveLearnSetEntry(Move.MYSTICSONG,"tm"),
                        new MoveLearnSetEntry(Move.WINDBLAST,"tm"),
                        new MoveLearnSetEntry(Move.WING_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.BOOMBURST,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(11)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
