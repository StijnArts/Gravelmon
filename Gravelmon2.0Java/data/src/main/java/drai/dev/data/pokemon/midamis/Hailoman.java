package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Hailoman extends drai.dev.data.pokemon.Pokemon {
    public Hailoman() {
        super("Hailoman",
                Type.FIGHTING, Type.STEEL,
                new Stats(85,
                        85,
                        100,
                        85,
                        85,
                        85),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.WORK_UP,1),
                        new MoveLearnSetEntry(Move.BIDE,5),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,8),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,13),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,17),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,20),
                        new MoveLearnSetEntry(Move.RETALIATE,22),
                        new MoveLearnSetEntry(Move.REVENGE,25),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,28),
                        new MoveLearnSetEntry(Move.COACHING,31),
                        new MoveLearnSetEntry(Move.SUBMISSION,36),
                        new MoveLearnSetEntry(Move.IRON_HEAD,40),
                        new MoveLearnSetEntry(Move.SUPERPOWER,43),
                        new MoveLearnSetEntry(Move.WARDANCE,47)                 ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Hailoman");

    }


}
