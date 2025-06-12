package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Oceadon extends drai.dev.data.pokemon.Pokemon {
    public Oceadon() {
        super("Oceadon",
                Type.WATER, Type.GHOST,
                new Stats(109,
                        117,
                        93,
                        66,
                        104,
                        41),
                List.of(Ability.WINDUP), Ability.WINDUP,
                25, 2909,
                new Stats(2,0,0,0,1,0), 45,
                0.875,
                208, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.PURSUIT,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.THIEF,1),
                        new MoveLearnSetEntry(Move.FLAIL,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,6),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,11),
                        new MoveLearnSetEntry(Move.MIST,15),
                        new MoveLearnSetEntry(Move.POISON_FANG,19),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,25),
                        new MoveLearnSetEntry(Move.AGILITY,31),
                        new MoveLearnSetEntry(Move.ICE_SHARD,33),
                        new MoveLearnSetEntry(Move.CRUNCH,38),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,42),
                        new MoveLearnSetEntry(Move.FLING,49),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,57),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,66)                  ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Oceadon");

    }


}
