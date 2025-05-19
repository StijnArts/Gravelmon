package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Armodillo extends drai.dev.data.pokemon.Pokemon {
    public Armodillo() {
        super("Armodillo",
                Type.FIGHTING,
                new Stats(50,
                        43,
                        90,
                        27,
                        30,
                        54),
                List.of(Ability.HUSTLE), Ability.STURDY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Armodillo usually live in groups of eleven. They can roll around as fast as 100 miles per hour!"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,7),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,13),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,19),
                        new MoveLearnSetEntry(Move.PROTECT,20),
                        new MoveLearnSetEntry(Move.STEAMROLLER,23),
                        new MoveLearnSetEntry(Move.TEAMUP,27),
                        new MoveLearnSetEntry(Move.ROLLINGPRESS,32),
                        new MoveLearnSetEntry(Move.GYRO_BALL,37),
                        new MoveLearnSetEntry(Move.ENDURE,43),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,48),
                        new MoveLearnSetEntry(Move.COUNTER,53),
                        new MoveLearnSetEntry(Move.REVERSAL,57),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.REBOUNDSTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.BOLTIN,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Armodillo");

    }


}
