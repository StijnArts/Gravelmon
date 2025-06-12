package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Harmosoar extends drai.dev.data.pokemon.Pokemon {
    public Harmosoar() {
        super("Harmosoar",
                Type.NORMAL, Type.FLYING,
                new Stats(102,
                        89,
                        76,
                        54,
                        76,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                19, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.WING_ATTACK,10),
                        new MoveLearnSetEntry(Move.HELPING_HAND,13),
                        new MoveLearnSetEntry(Move.JET_STRIKE,16),
                        new MoveLearnSetEntry(Move.PSYCH_UP,20),
                        new MoveLearnSetEntry(Move.SUBMISSION,24),
                        new MoveLearnSetEntry(Move.SWAGGER,28),
                        new MoveLearnSetEntry(Move.DRILL_PECK,32),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,36),
                        new MoveLearnSetEntry(Move.STEEL_WING,40),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,44),
                        new MoveLearnSetEntry(Move.DRILL_RUN,48),
                        new MoveLearnSetEntry(Move.STANDOFF,52),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,56),
                        new MoveLearnSetEntry(Move.LAST_RESORT,60)                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(37)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS, Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Harmosoar");

    }


}
