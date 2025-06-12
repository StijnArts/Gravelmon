package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Parabella extends drai.dev.data.pokemon.Pokemon {
    public Parabella() {
        super("Parabella",
                Type.WATER,
                new Stats(73,
                        31,
                        37,
                        100,
                        74,
                        50),
                List.of(Ability.STATIC), Ability.WATER_VEIL,
                8, 165,
                new Stats(0,0,0,2,0,0), 90,
                0.2,
                130, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("During their mating season, people are advised to stay out of the water. Their tentacles can deliver a powerful sting that instantly paralyzes."),
                List.of(new EvolutionEntry("drizzella", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,3),
                        new MoveLearnSetEntry(Move.FLASH,7),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,16),
                        new MoveLearnSetEntry(Move.SAFEGUARD,20),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,24),
                        new MoveLearnSetEntry(Move.BRINE,28),
                        new MoveLearnSetEntry(Move.MEMENTO,33),
                        new MoveLearnSetEntry(Move.SCREECH,38),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,43),
                        new MoveLearnSetEntry(Move.RECOVER,49),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,55)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(22)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .canSeeSky()
    .belowY(30)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
