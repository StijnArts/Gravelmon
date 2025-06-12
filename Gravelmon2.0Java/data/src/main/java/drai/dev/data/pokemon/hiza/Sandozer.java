package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sandozer extends drai.dev.data.pokemon.Pokemon {
    public Sandozer() {
        super("Sandozer",
                Type.WATER, Type.GROUND,
                new Stats(76,
                        86,
                        86,
                        86,
                        76,
                        50),
                List.of(Ability.WATER_COMPACTION), Ability.STORM_DRAIN,
                16, 165,
                new Stats(0,1,1,0,0,0), 60,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("When on land it absorbs water from the ground to power up its water moves. Once the ground is dry, it will return to the water."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,3),
                        new MoveLearnSetEntry(Move.POISON_STING,5),
                        new MoveLearnSetEntry(Move.SAND_TOMB,10),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,14),
                        new MoveLearnSetEntry(Move.BULLDOZE,19),
                        new MoveLearnSetEntry(Move.SHORE_UP,25),
                        new MoveLearnSetEntry(Move.POISON_TAIL,28),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,31),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,36),
                        new MoveLearnSetEntry(Move.EARTH_POWER,40),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,47),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,56),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.CHILLING_WATER,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm")                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_COAST)
    .setAntiBiomes(Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
