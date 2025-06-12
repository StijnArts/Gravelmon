package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Plakidd extends drai.dev.data.pokemon.Pokemon {
    public Plakidd() {
        super("Plakidd",
                Type.WATER, Type.NORMAL,
                new Stats(82,
                        103,
                        80,
                        103,
                        80,
                        82),
                List.of(Ability.SWIFT_SWIM,Ability.HYDRATION), Ability.RAPIDSTREAM,
                9, 142,
                new Stats(0,1,0,1,0,0), 45,
                -1,
                201, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,5),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,8),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,14),
                        new MoveLearnSetEntry(Move.COVET,17),
                        new MoveLearnSetEntry(Move.SNORE,20),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,24),
                        new MoveLearnSetEntry(Move.ENCORE,28),
                        new MoveLearnSetEntry(Move.BRINE,31),
                        new MoveLearnSetEntry(Move.BODY_SLAM,35),
                        new MoveLearnSetEntry(Move.ROAR,39),
                        new MoveLearnSetEntry(Move.CRUNCH,45),
                        new MoveLearnSetEntry(Move.LIQUIDATION,52),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,60),
                        new MoveLearnSetEntry(Move.SUPERPOWER,65)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(46)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Plakidd");

    }


}
