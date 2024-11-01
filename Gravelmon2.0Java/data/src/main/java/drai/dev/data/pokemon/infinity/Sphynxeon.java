package drai.dev.data.pokemon.infinity;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Sphynxeon extends Pokemon {
    public Sphynxeon() {
        super("Sphynxeon",
                Type.GROUND,
                new Stats(120, 88, 106, 70, 80, 61),
                List.of(Ability.SYNCHRONIZE), Ability.TECHNICIAN,
                9, 240,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                35, List.of(EggGroup.FIELD),
                List.of("In ancient times, Sphynxeon were treated as a divine beings sent from the heavens. Many of the designs from the royal wardrobes were inspired by Sphynxeon."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BONEMERANG,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.SIMPLE_BEAM,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.SAND_TOMB,9),
                        new MoveLearnSetEntry(Move.COVET,12),
                        new MoveLearnSetEntry(Move.PSYCHO_SHIFT,14),
                        new MoveLearnSetEntry(Move.PSYBEAM,14),
                        new MoveLearnSetEntry(Move.BONE_RUSH,20),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,24),
                        new MoveLearnSetEntry(Move.TRICK,27),
                        new MoveLearnSetEntry(Move.DIG,32),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,37),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,37),
                        new MoveLearnSetEntry(Move.BULLDOZE,40),
                        new MoveLearnSetEntry(Move.EARTH_POWER,46),
                        new MoveLearnSetEntry(Move.SANDSTORM,51),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,58),
                        new MoveLearnSetEntry(Move.FISSURE,63),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,68),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,68),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tutor"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.COVET,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DETECT,"egg"),
                        new MoveLearnSetEntry(Move.ENDURE,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,"egg"),
                        new MoveLearnSetEntry(Move.STORED_POWER,"egg"),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg"),
                        new MoveLearnSetEntry(Move.WISH,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")
                        ),
                List.of(Label.INFINITY),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 44, 56, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.24, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setModeled(true);
        this.setBaseScale(0.8);
        this.setPreEvolution("eevee");
        addAdditionalEvolution("eevee", new EvolutionEntry("sphynxeon", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.SAND_TOMB, "")),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"\"cobblemon:soft_sand\""),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME,"\"day\""))));
    }
}
