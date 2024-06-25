package drai.dev.gravelmon.pokemon.flux.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class DeepWishiwashi extends Pokemon {
    public DeepWishiwashi(String originalMon, Aspect aspect) {
        super(originalMon, aspect, "DeepWishiwashi",
                Type.WATER, Type.DARK,
                new Stats(45, 20, 20, 25, 25, 40),
                List.of(Ability.SCHOOLING), Ability.SCHOOLING,
                2, 3,
                new Stats(1, 0, 0, 0, 0, 0), 61,
                0.5,
                61, ExperienceGroup.FAST,
                70,
                51, List.of(EggGroup.WATER_2),
                List.of("A variant Wishiwashi that dwells in dark caves and deep oceans. It uses the lights from its scales to communicate with others in its school."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,4),
                        new MoveLearnSetEntry(Move.BEAT_UP,8),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,12),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,16),
                        new MoveLearnSetEntry(Move.PAYBACK,20),
                        new MoveLearnSetEntry(Move.SCARY_FACE,24),
                        new MoveLearnSetEntry(Move.DARK_PULSE,28),
                        new MoveLearnSetEntry(Move.LIQUIDATION,32),
                        new MoveLearnSetEntry(Move.AQUA_RING,36),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,40),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,44),
                        new MoveLearnSetEntry(Move.TOPSYTURVY,48),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"egg"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"egg"),
                        new MoveLearnSetEntry(Move.BRINE,"egg"),
                        new MoveLearnSetEntry(Move.SOAK,"egg"),
                        new MoveLearnSetEntry(Move.DIVE,"egg")
                        ),
                List.of(Label.RADICAL_RED, Label.GEN7),
                0, List.of(),
                SpawnContext.SUBMERGED, SpawnPool.COMMON, 12, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.MAXY, "30")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of(new PokemonForm("School", true,
                        Type.GHOST, Type.DRAGON,
                        new Stats(45, 130, 140, 135, 140, 30),
                        List.of(Ability.SCHOOLING), Ability.SCHOOLING,
                        102, 213,
                        new Stats(1, 0, 0, 0, 0, 0), 61,
                        0.5,
                        61, ExperienceGroup.FAST,
                        70,
                        51, List.of(EggGroup.WATER_2),
                        List.of(Aspect.SCHOOL),
                        List.of(),
                        List.of(),
                        List.of(
                        ),
                        List.of(Label.RADICAL_RED, Label.GEN1),
                        0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 12, 34, 0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.MAXY, "30")
                ), List.of(),
                        List.of(SpawnPreset.NATURAL),
                        1.4, 0.3)));
        this.setLangFileName("Wishiwashi");
        this.setPortraitXYZ(0.1, 2.0, 0.0);
        this.setCanSwim(true);
        this.setAvoidsLand(true);
        this.setCanBreathUnderwater(true);
    }
}
