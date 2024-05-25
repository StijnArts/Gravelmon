package drai.dev.gravelmon.pokemon.rica;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Tadport extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tadport() {
        super("Tadport",
                Type.PSYCHIC,
                new Stats(35,
                        40,
                        30,
                        65,
                        30,
                        65),
                List.of(Ability.RUN_AWAY), Ability.RATTLED,
                3, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                53, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("It stays out of sight whenever possible, but cannot resist a tasty snack. If spotted, Tadport will try to Teleport away to safety."),
                List.of(new EvolutionEntry("psionewt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.ASTONISH,7),
                        new MoveLearnSetEntry(Move.WATER_SPORT,12),
                        new MoveLearnSetEntry(Move.CONFUSION,16),
                        new MoveLearnSetEntry(Move.HYPNOSIS,19),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,22),
                        new MoveLearnSetEntry(Move.PSYBEAM,25),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,29),
                        new MoveLearnSetEntry(Move.RECOVER,33),
                        new MoveLearnSetEntry(Move.AMNESIA,37),
                        new MoveLearnSetEntry(Move.PSYCHIC,40),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,44),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,48),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.TELEPORT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.PSYWAVE,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tm"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 5, 23, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST, Biome.IS_GRASSLAND, Biome.IS_RIVER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.FRESHWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
