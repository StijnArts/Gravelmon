package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crustean extends drai.dev.data.pokemon.Pokemon {
    public Crustean() {
        super("DragonSnail",
                Type.POISON,Type.DRAGON,
                new Stats(70,
                        70,
                        116,
                        82,
                        116,
                        59),
                List.of(Ability.SHELL_ARMOR,Ability.STENCH), Ability.GOOEY,
                15, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.WATER_1),
                List.of("- SludgeSTAB Poison - Poison Gas Poison - Sludge BombSTAB Poison - Mud-Slap Ground - Mud Sport  Ground - Muddy Water Water - Mud Shot Ground - Fling  Dark - Mud Bomb Ground - Sludge WaveSTAB Poison - Mud Slide Ground - Filthy Terrain  Poison"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.MUDSLIDE,1),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,1),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,1),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,1),
                        new MoveLearnSetEntry(Move.FILTHYTERRAIN,1),
                        new MoveLearnSetEntry(Move.SLUDGE,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,1),
                        new MoveLearnSetEntry(Move.MUD_SHOT,1),
                        new MoveLearnSetEntry(Move.FLING,1),
                        new MoveLearnSetEntry(Move.MUD_BOMB,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,1)                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("DragonSnail");

    }


}
