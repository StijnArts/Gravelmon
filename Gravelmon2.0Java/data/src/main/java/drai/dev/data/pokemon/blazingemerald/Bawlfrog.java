package drai.dev.data.pokemon.blazingemerald;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Bawlfrog extends Pokemon {
    public Bawlfrog() {
        super("Bawlfrog",
                Type.WATER, Type.NORMAL,
                new Stats(190, 38, 78, 83, 88, 43),
                List.of(Ability.EMPATHY), Ability.EMPATHY,
                UnitConverter.feetToMeters(3, 6), UnitConverter.lbsToKg(500),
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                200, ExperienceGroup.MEDIUM_SLOW,
                70,
                51, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.LICK,5),
                        new MoveLearnSetEntry(Move.CURSE,7),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,11),
                        new MoveLearnSetEntry(Move.UPROAR,17),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,24),
                        new MoveLearnSetEntry(Move.FLAIL,32),
                        new MoveLearnSetEntry(Move.WEEPY_WAIL,38),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,43),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,48),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.VEILED_SKY,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD, Label.JOKE),
                0, List.of(),
                new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(10)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
