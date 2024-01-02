package drai.dev.gravelmon.pokemon.lockemon.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class KaskadianPhantump extends Pokemon {
    public KaskadianPhantump(int dexNo) {
        super(dexNo,"KaskadianPhantump",
                Type.GHOST, Type.POISON,
                new Stats(43, 70,48,50,60,38),
                List.of(Ability.SOUL_DRAIN, Ability.POISON_TOUCH), Ability.EFFECT_SPORE,
                4, 70,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                62, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS, EggGroup.GRASS),
                List.of("Unlike its Kalosian counter parts, Kaskadian Phantump's leaves when brewed, can create a very harmful poison. Scientists have used it to create modern day antidotes."),
                List.of(new EvolutionEntry("kaskadiantrevenant", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME, "\"#cobblemon:is_spooky\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ACID,4),
                        new MoveLearnSetEntry(Move.LEECH_SEED,8),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,12),
                        new MoveLearnSetEntry(Move.WILLOWISP,16),
                        new MoveLearnSetEntry(Move.HEX,20),
                        new MoveLearnSetEntry(Move.SLUDGE,24),
                        new MoveLearnSetEntry(Move.HORN_LEECH,28),
                        new MoveLearnSetEntry(Move.CURSE,32),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,36),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,40),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,44),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,48),
                        new MoveLearnSetEntry(Move.FORESTS_CURSE,52),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"egg"),
                        new MoveLearnSetEntry(Move.DISABLE,"egg"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.IMPRISON,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.TRICK,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SMOG,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"tm"),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SPITE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.POLTERGEIST,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm")
                        ),
                List.of(Label.GEN6,Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_FUNGUS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setLangFileName("Phantump");
        this.setPortraitXYZ(0,1.8,0);
    }
}
