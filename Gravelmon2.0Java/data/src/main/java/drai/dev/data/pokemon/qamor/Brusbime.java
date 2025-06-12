package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Brusbime extends drai.dev.data.pokemon.Pokemon {
    public Brusbime() {
        super("Brusbime",
                Type.NORMAL, Type.STEEL,
                new Stats(120,
                        99,
                        80,
                        20,
                        45,
                        90),
                List.of(Ability.ROCK_HEAD), Ability.BODYGUARD,
                16, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.25,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Busbime are extremely competitive and coordinated Pokemon that have been known to master Human sports for as long people have developed and played them. They are favored in the sporting community and have made it as mascots for various football teams and sports beverages."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COURT_CHANGE,1),
                        new MoveLearnSetEntry(Move.HOWL,4),
                        new MoveLearnSetEntry(Move.BITE,8),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,12),
                        new MoveLearnSetEntry(Move.UPROAR,16),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,19),
                        new MoveLearnSetEntry(Move.GYRO_BALL,25),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,29),
                        new MoveLearnSetEntry(Move.BLOCK,34),
                        new MoveLearnSetEntry(Move.SUBMISSION,37),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,43),
                        new MoveLearnSetEntry(Move.IRON_HEAD,46),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,50),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,58),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.JAW_LOCK,"tm"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.THRASH,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.COUNTER,"tm"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Brusbime");

    }


}
