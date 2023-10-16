package com.gravelmon.common.gravelmon.pokemon.xenoverse;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Reginalous extends Pokemon {
    public Reginalous() {
        super("Reginalous",
                Type.PSYCHIC,
                new Stats(50, 150,75,150,75,80),
                List.of(Ability.MYSTIC_WIND), Ability.MYSTIC_WIND,
                1, 3,
                new Stats(0,1,0,2,0,0), 3,
                -1,
                290, ExperienceGroup.SLOW,
                70,
                41, List.of(EggGroup.UNDISCOVERED),
                List.of("Its body is formed by Anomalous energy from various dimensions. It creates strong winds of bright pink color that changes the alterations of each dimension."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.AMNESIA,1),
                        new MoveLearnSetEntry(Move.REFLECT,6),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,12),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,18),
                        new MoveLearnSetEntry(Move.PSYBEAM,24),
                        new MoveLearnSetEntry(Move.TRICK,24),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,30),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,36),
                        new MoveLearnSetEntry(Move.STORED_POWER,42),
                        new MoveLearnSetEntry(Move.CALM_MIND,48),
                        new MoveLearnSetEntry(Move.GEOMANCY,54),
                        new MoveLearnSetEntry(Move.POWER_GEM,60),
                        new MoveLearnSetEntry(Move.PSYCHIC,66),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,72),
                        new MoveLearnSetEntry(Move.ICE_BEAM,78),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.GRAVITY,"tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.TRICK,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                6, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 75, 85, 0.0001, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                1, 0.7,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
    }
}
