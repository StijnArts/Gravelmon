package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bountius extends drai.dev.data.pokemon.Pokemon {
    public Bountius() {
        super("Bountius",
                Type.WATER, Type.GRASS,
                new Stats(134,
                        75,
                        111,
                        92,
                        102,
                        41),
                List.of(Ability.STORM_DRAIN), Ability.RIPEN,
                30, 165,
                new Stats(3,0,0,0,0,0), 45,
                0.5,
                260, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("The large fruit on its back will never stop growing as long as they don't fall off. There are records of Bountius with sails as big as their body."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,6),
                        new MoveLearnSetEntry(Move.STOMP,9),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,14),
                        new MoveLearnSetEntry(Move.WATER_PULSE,18),
                        new MoveLearnSetEntry(Move.BULLET_SEED,23),
                        new MoveLearnSetEntry(Move.LEECH_SEED,26),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,30),
                        new MoveLearnSetEntry(Move.SOAK,36),
                        new MoveLearnSetEntry(Move.BODY_SLAM,40),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,47),
                        new MoveLearnSetEntry(Move.SYNTHESIS,52),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,58),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,66),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.BODY_PRESS,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm")                        ),
                List.of(Label.HIZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(40)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SUMMER)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Bountius");

    }


}
