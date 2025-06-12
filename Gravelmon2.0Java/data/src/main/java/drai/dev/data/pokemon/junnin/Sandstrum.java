package drai.dev.data.pokemon.junnin;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sandstrum extends drai.dev.data.pokemon.Pokemon {
    public Sandstrum() {
        super("Sandstrum",
                Type.GROUND, Type.WATER,
                new Stats(55,
                        48,
                        59,
                        45,
                        59,
                        45),
                List.of(Ability.SAND_VEIL,Ability.WATER_COMPACTION,Ability.RATTLED), Ability.RATTLED,
                5, 165,
                new Stats(0,0,1,0,0,0), 220,
                0.5,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("Sandstrum hides under the sand on the beach. Trainers sometimes step on it and are surprised when the ground starts to move from under their feet."),
                List.of(new EvolutionEntry("sanderon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,1),
                        new MoveLearnSetEntry(Move.SAND_TOMB,6),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,8),
                        new MoveLearnSetEntry(Move.BIDE,12),
                        new MoveLearnSetEntry(Move.BRINE,16),
                        new MoveLearnSetEntry(Move.BULLDOZE,19),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,22),
                        new MoveLearnSetEntry(Move.PROTECT,26),
                        new MoveLearnSetEntry(Move.BEACHTIDE,30),
                        new MoveLearnSetEntry(Move.SANDSTORM,33),
                        new MoveLearnSetEntry(Move.SANDSHOT,37),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,40),
                        new MoveLearnSetEntry(Move.SANDTIDE,44),
                        new MoveLearnSetEntry(Move.FISSURE,48),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.LANDSLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SANDSHOT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tm")                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
