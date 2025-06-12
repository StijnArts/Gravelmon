package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Swondola extends drai.dev.data.pokemon.Pokemon {
    public Swondola() {
        super("Swondola",
                Type.GRASS, Type.WATER,
                new Stats(76,
                        50,
                        75,
                        85,
                        80,
                        119),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                10, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BRANCH_POKE,5),
                        new MoveLearnSetEntry(Move.WATER_GUN,8),
                        new MoveLearnSetEntry(Move.AQUA_RING,17),
                        new MoveLearnSetEntry(Move.BRINE,21),
                        new MoveLearnSetEntry(Move.HYPER_FANG,25),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,29),
                        new MoveLearnSetEntry(Move.SUPER_FANG,33),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,37),
                        new MoveLearnSetEntry(Move.WATERFALL,41),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,45),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,49)        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(25)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE, SpawnPreset.VILLAGE)
    .build(), List.of());
	
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
