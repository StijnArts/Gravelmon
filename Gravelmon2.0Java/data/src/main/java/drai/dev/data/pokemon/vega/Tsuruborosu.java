package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Tsuruborosu extends Pokemon {
    public Tsuruborosu() {
        super( "Tsuruborosu",
                Type.GRASS, Type.DRAGON,
                new Stats(83	,107	,84	,60	,86	,66),
                List.of(Ability.SOLID_ROCK), Ability.MOLD_BREAKER,
                17, 325,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                167, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS, EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,4),
                        new MoveLearnSetEntry(Move.ACROBATICS,8),
                        new MoveLearnSetEntry(Move.LEECH_SEED,12),
                        new MoveLearnSetEntry(Move.PROTECT,16),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,20),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,24),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,28),
                        new MoveLearnSetEntry(Move.GRAV_APPLE,32),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,36),
                        new MoveLearnSetEntry(Move.FLY,40),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,44),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.CHARM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.POUNCE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.LUNGE,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.SNORE,"egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"egg")
                ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(34)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
