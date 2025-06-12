package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Javernaut extends drai.dev.data.pokemon.Pokemon {
    public Javernaut() {
        super("Javernaut",
                Type.GROUND, Type.FIGHTING,
                new Stats(110,
                        125,
                        80,
                        60,
                        66,
                        54),
                List.of(Ability.SUNSCREEN,Ability.THICK_FAT,Ability.SCRAPPY), Ability.SCRAPPY,
                21, 165,
                new Stats(1,2,0,0,0,0), 45,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Javernaut are employed in farms and, more rarely, in construction sites, to help with the heavy work. A hit from its club-like tail can knock down trees."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.ROLLINGPRESS,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setAntiBiomes(Biome.IS_COLD)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NEAR_MUD)
    .build(), List.of());
	
           setLangFileName("Javernaut");

    }


}
