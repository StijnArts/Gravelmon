package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Catastropod extends drai.dev.data.pokemon.Pokemon {
    public Catastropod() {
        super("Catastropod",
                Type.FIRE, Type.WATER,
                new Stats(105,
                        140,
                        105,
                        140,
                        100,
                        80),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                21, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The waters near its lair are boiling hot, whenever it comes on land it evaporates any lakes and scorches whole forests into dust."),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.FIRE_SPIN,1),
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
                        new MoveLearnSetEntry(Move.EXPLOSION,90)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SURFACE, SpawnPool.ULTRA_RARE, 65, 75, .0002, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERLAVA),
                0.28, 0.3,
                List.of());
           setLangFileName("Catastropod");

    }


}
