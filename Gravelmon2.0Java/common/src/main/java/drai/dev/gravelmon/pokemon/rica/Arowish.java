package drai.dev.gravelmon.pokemon.rica;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Arowish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Arowish() {
        super("Arowish",
                Type.WATER, Type.PSYCHIC,
                new Stats(80,
                        57,
                        70,
                        100,
                        80,
                        93),
                List.of(Ability.SWIFT_SWIM), Ability.INNER_FOCUS,
                27, 165,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                168, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Arowish navigate the murky river waters with their psychic powers. They can sense other Pokemon coming towards them, even above the water."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AMNESIA,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,7),
                        new MoveLearnSetEntry(Move.TEAMUP,11),
                        new MoveLearnSetEntry(Move.AQUA_JET,15),
                        new MoveLearnSetEntry(Move.CAPTIVATE,19),
                        new MoveLearnSetEntry(Move.WATER_PULSE,22),
                        new MoveLearnSetEntry(Move.SOAK,26),
                        new MoveLearnSetEntry(Move.AGILITY,31),
                        new MoveLearnSetEntry(Move.AQUA_RING,37),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,43),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,49),
                        new MoveLearnSetEntry(Move.CALM_MIND,54),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,60),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tm"),
                        new MoveLearnSetEntry(Move.TELEPORT,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
