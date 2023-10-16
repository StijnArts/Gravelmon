package com.gravelmon.common.gravelmon.pokemon.infinity;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Psycholyte extends Pokemon {
    public Psycholyte() {
        super("Psycholyte",
                Type.GRASS, Type.PSYCHIC,
                new Stats(55, 50, 60, 85, 70, 58),
                List.of(Ability.MAGIC_GUARD), Ability.POISON_HEAL,
                9, 140,
                new Stats(0,0,0,2,0,0), 255,
                0.5,
                100, ExperienceGroup.MEDIUM_SLOW,
                70,
                62, List.of(EggGroup.GRASS),
                List.of("Upon evolution, this Pokémon goes hunting for a suitable stick. They form a strong bond with the chosen stick and use it to channel its psychic powers."),
                List.of(new EvolutionEntry("shroomage", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.ENERGY_BALL, "")),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(
                        new MoveLearnSetEntry(Move.PSYWAVE,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.CONFUSION,4),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.POISON_POWDER,11),
                        new MoveLearnSetEntry(Move.SLUDGE,14),
                        new MoveLearnSetEntry(Move.GROWTH,18),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,20),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,24),
                        new MoveLearnSetEntry(Move.PSYBEAM,28),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,31),
                        new MoveLearnSetEntry(Move.LEECH_SEED,34),
                        new MoveLearnSetEntry(Move.VENOSHOCK,35),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,37),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,40),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"egg"),
                        new MoveLearnSetEntry(Move.CHARM,"egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"egg"),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,"egg"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"egg"),
                        new MoveLearnSetEntry(Move.RECYCLE,"egg"),
                        new MoveLearnSetEntry(Move.SPORE,"egg")
                        ),
                List.of(Label.SAGE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 16, 28, 0.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SNOWY))),
                List.of(SpawnPreset.NATURAL),
                0.29, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
