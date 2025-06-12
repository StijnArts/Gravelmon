package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Khancrete extends drai.dev.data.pokemon.Pokemon {
    public Khancrete() {
        super("Khancrete",
                Type.ROCK, Type.STEEL,
                new Stats(85,
                        160,
                        95,
                        50,
                        85,
                        5),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                26, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It swings its head, recklessly throwing its wrecking ball about to destroy anything in its wake. They have a rivalry with Conkeldurr."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.BIDE,5),
                        new MoveLearnSetEntry(Move.ROCK_THROW,7),
                        new MoveLearnSetEntry(Move.PROTECT,13),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,16),
                        new MoveLearnSetEntry(Move.AMNESIA,21),
                        new MoveLearnSetEntry(Move.BARRAGE,26),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,33),
                        new MoveLearnSetEntry(Move.ENDURE,37),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,43)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.RARE)
    .setMinLevel(39)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Khancrete");

    }


}
