package drai.dev.data.pokemon.uranium;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Baitatao extends Pokemon {
    public Baitatao() {
        super("Baitatao",
                Type.WATER, Type.FIRE,
                new Stats(90,
                        70,
                        110,
                        135,
                        100,
                        105),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                33, 2550,
                new Stats(0,0,0,1,2,0), 3,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("Called the “Boiling Wrath”. Heat from it’s scales cause the water around it to boil. It attacks ships, melting the hull on contact."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.EMBER,8),
                        new MoveLearnSetEntry(Move.ROAR,15),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,22),
                        new MoveLearnSetEntry(Move.STOMP,29),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,36),
                        new MoveLearnSetEntry(Move.SWAGGER,43),
                        new MoveLearnSetEntry(Move.FIRE_FANG,50),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,57),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,64),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,71),
                        new MoveLearnSetEntry(Move.CALM_MIND,78),
                        new MoveLearnSetEntry(Move.ERUPTION,85),
                        new MoveLearnSetEntry(Move.OCEANS_WRATH,90),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.CORAL_BREAK,"tm")
                        ),
                List.of(Label.URANIUM, Label.LEGENDARY),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 65, 70, 0.000005, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.MAXY, "40")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);
        this.setPortraitXYZ(0,1.8,0);
    }
}
