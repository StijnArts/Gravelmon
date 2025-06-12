package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Vendrom extends Pokemon {
    public Vendrom() {
        super("Vendrom",
                Type.WATER, Type.FIRE,
                new Stats(125,
                        65,
                        145,
                        85,
                        105,
                        45),
                List.of(Ability.ANCIENT_BODY), Ability.ANCIENT_BODY,
                15, 4300,
                new Stats(0,0,2,0,0,0), 5,
                -1,
                143, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3, EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FIRE_SPIN,1),
                        new MoveLearnSetEntry(Move.STEAM_ERUPTION,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,6),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,12),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,18),
                        new MoveLearnSetEntry(Move.WATER_PULSE,24),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,30),
                        new MoveLearnSetEntry(Move.INCINERATE,36),
                        new MoveLearnSetEntry(Move.STOMP,42),
                        new MoveLearnSetEntry(Move.SCALD,48),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,54),
                        new MoveLearnSetEntry(Move.HAZE,60),
                        new MoveLearnSetEntry(Move.MIST,60),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,66),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,78),
                        new MoveLearnSetEntry(Move.OVERHEAT,84),
                        new MoveLearnSetEntry(Move.EXPLOSION,90)
                        ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(29)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_DEEP_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
    }
}
