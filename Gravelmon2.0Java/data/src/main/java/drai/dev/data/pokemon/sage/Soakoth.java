package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Soakoth extends Pokemon {
    public Soakoth() {
        super("Soakoth",
                Type.WATER,
                new Stats(100, 70, 80, 80, 95, 60),
                List.of(Ability.SWIFT_SWIM, Ability.CONTENT), Ability.REGENERATOR,
                16, 921,
                new Stats(1,0,0,0,1,0), 90,
                0.5,
                170, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Soakoth drifts nonchalantly along river rapids as if they were a gentle stream. Pokemon that can't swim sometimes climb on its belly to cross bodies of water."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.RECYCLE,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.YAWN,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,4),
                        new MoveLearnSetEntry(Move.ENCORE,7),
                        new MoveLearnSetEntry(Move.SLACK_OFF,10),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,14),
                        new MoveLearnSetEntry(Move.AQUA_RING,17),
                        new MoveLearnSetEntry(Move.WATER_PULSE,20),
                        new MoveLearnSetEntry(Move.SLASH,24),
                        new MoveLearnSetEntry(Move.CURSE,27),
                        new MoveLearnSetEntry(Move.REST,30),
                        new MoveLearnSetEntry(Move.SNORE,30),
                        new MoveLearnSetEntry(Move.BODY_SLAM,35),
                        new MoveLearnSetEntry(Move.SURF,39),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,43),
                        new MoveLearnSetEntry(Move.FLAIL,48),
                        new MoveLearnSetEntry(Move.AMNESIA,52),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,56),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,61),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DEPTH_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.PINCER_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:leather",90, 1,2)
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(30)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NEAR_WATER)
    .build(), List.of());
	

    }
}
