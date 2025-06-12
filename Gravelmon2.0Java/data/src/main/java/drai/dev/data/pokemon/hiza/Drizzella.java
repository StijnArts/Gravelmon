package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Drizzella extends drai.dev.data.pokemon.Pokemon {
    public Drizzella() {
        super("Drizzella",
                Type.WATER, Type.ELECTRIC,
                new Stats(93,
                        71,
                        57,
                        126,
                        93,
                        60),
                List.of(Ability.STATIC), Ability.DRIZZLE,
                10, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                224, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("They can be seem floating above the sea during stormy days. Their watery veil allows them to breath outside the water."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,1),
                        new MoveLearnSetEntry(Move.SAFEGUARD,1),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,1),
                        new MoveLearnSetEntry(Move.BRINE,1),
                        new MoveLearnSetEntry(Move.MEMENTO,1),
                        new MoveLearnSetEntry(Move.SCREECH,1),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,1),
                        new MoveLearnSetEntry(Move.RECOVER,1),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,1),
                        new MoveLearnSetEntry(Move.THUNDER,1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,1)),
                List.of(Label.HIZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(37)
    .setWeight(SpawnWeight.VERY_COMMON)
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
