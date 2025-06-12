package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Exoscythe extends drai.dev.data.pokemon.Pokemon {
    public Exoscythe() {
        super("Exoscythe",
                Type.ICE,Type.BUG,
                new Stats(54,
                        117,
                        60,
                        86,
                        86,
                        102),
                List.of(Ability.SHARPNESS,Ability.TECHNICIAN), Ability.SLUSH_RUSH,
                17, 410,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It creates razor sharp blades of ice on its hands. In battle, it will strike a pose and stay still until its opponent makes a move, then attack by launching these blades faster than the eye can see."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                        new MoveLearnSetEntry(Move.DETECT,10),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.ICEBLADE,50),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.CROSS_POISON,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Exoscythe");

    }


}
