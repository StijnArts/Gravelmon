package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Kodachiuo extends Pokemon {
    public Kodachiuo() {
        super( "Kodachiuo",
                Type.WATER,
                new Stats(49	,56	,52	,48,	45,	58),
                List.of(Ability.SHARPNESS), Ability.SWIFT_SWIM,
                4, 276,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                68, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1, EggGroup.WATER_2),
                List.of(""),
                List.of(new EvolutionEntry("surudoika", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,5),
                        new MoveLearnSetEntry(Move.WATER_PULSE,10),
                        new MoveLearnSetEntry(Move.ROCK_THROW,15),
                        new MoveLearnSetEntry(Move.AGILITY,20),
                        new MoveLearnSetEntry(Move.AQUA_RING,25),
                        new MoveLearnSetEntry(Move.FLAIL,30),
                        new MoveLearnSetEntry(Move.STONE_EDGE,35),
                        new MoveLearnSetEntry(Move.SOAK,40),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"egg"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"egg")
                ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(14)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN, Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);
    }
}
