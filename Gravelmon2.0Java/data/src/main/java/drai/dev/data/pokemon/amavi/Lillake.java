package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lillake extends drai.dev.data.pokemon.Pokemon {
    public Lillake() {
        super("Lillake",
                Type.WATER, Type.GRASS,
                new Stats(100,
                        50,
                        80,
                        90,
                        120,
                        45),
                List.of(Ability.WATER_ABSORB), Ability.RAIN_DISH,
                12, 0,
                new Stats(1,0,0,0,1,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.BUBBLE,3),
                        new MoveLearnSetEntry(Move.GROWTH,7),
                        new MoveLearnSetEntry(Move.SING,10),
                        new MoveLearnSetEntry(Move.WATER_GUN,12),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,15),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,25),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,30),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,36),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,42)                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE)
    .build(), List.of());
	
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
