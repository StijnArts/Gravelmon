package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Caulderon extends drai.dev.data.pokemon.Pokemon {
    public Caulderon() {
        super("Caulderon",
                Type.FIRE, Type.WATER,
                new Stats(95,
                        80,
                        130,
                        120,
                        80,
                        65),
                List.of(Ability.SOULABSORB), Ability.POWER_OF_ALCHEMY,
                32, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A mythical being said to reside within a dimension at the bottom of a chasm. It captures lost souls and pulls them into its pot to be purified."),
                List.of(),
                List.of(                   new MoveLearnSetEntry(Move.FIRE_SPIN,1),
                        new MoveLearnSetEntry(Move.STEAM_ERUPTION,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.LEER,6),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,12),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,18),
                        new MoveLearnSetEntry(Move.WATER_PULSE,24),
                        new MoveLearnSetEntry(Move.SCARY_FACE,30),
                        new MoveLearnSetEntry(Move.INCINERATE,36),
                        new MoveLearnSetEntry(Move.STOMP,42),
                        new MoveLearnSetEntry(Move.SCALD,48),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,54),
                        new MoveLearnSetEntry(Move.HAZE,60),
                        new MoveLearnSetEntry(Move.MIST,60),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,66),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,78),
                        new MoveLearnSetEntry(Move.OVERHEAT,84),
                        new MoveLearnSetEntry(Move.EXPLOSION,90)     ),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Caulderon");

    }


}
