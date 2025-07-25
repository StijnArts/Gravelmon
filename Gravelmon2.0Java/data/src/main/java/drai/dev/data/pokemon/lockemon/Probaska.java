package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Probaska extends Pokemon {
    public Probaska() {
        super("Probaska",
                Type.BUG, Type.NORMAL,
                new Stats(80,
                        35,
                        80,
                        80,
                        71,
                        100),
                List.of(Ability.TRUMPET_WEEVIL, Ability.NESTING), Ability.SOUNDPROOF,
                11, 223,
                new Stats(2,0,0,0,0,1), 45,
                0.5,
                234, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("After evolution, Probaska becomes upbeat and energetic. They are known to have large parties in some forests at night."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,5),
                        new MoveLearnSetEntry(Move.ASSURANCE,8),
                        new MoveLearnSetEntry(Move.FEINT,11),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,14),
                        new MoveLearnSetEntry(Move.BLOCK,19),
                        new MoveLearnSetEntry(Move.COUNTER,24),
                        new MoveLearnSetEntry(Move.HEADBUTT,28),
                        new MoveLearnSetEntry(Move.STICKY_WEB,33),
                        new MoveLearnSetEntry(Move.SING,37),
                        new MoveLearnSetEntry(Move.VICTORY_DANCE,41),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,45),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,49)
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(18)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FOLIAGE)
    .build(), List.of());
	
    }
}
