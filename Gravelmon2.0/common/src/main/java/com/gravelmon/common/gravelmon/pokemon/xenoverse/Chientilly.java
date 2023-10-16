package com.gravelmon.common.gravelmon.pokemon.xenoverse;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Chientilly extends Pokemon {
    public Chientilly() {
        super("Chientilly",
                Type.FAIRY, Type.ICE,
                new Stats(78, 115, 71, 52, 91, 33),
                List.of(Ability.IMMUNITY, Ability.SWEET_VEIL), Ability.CREAM_SHIELD,
                17, 942,
                new Stats(0,1,0,0,1,0), 45,
                0.5,
                88, ExperienceGroup.FAST,
                40,
                26, List.of(EggGroup.XENO),
                List.of("It secretes ice-fresh cream from its tail. If the quality doesn't match its high requirements, it throws that away."),
                //TODO replace with Xenolith once item is implemented
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,1),
                        new MoveLearnSetEntry(Move.SWEET_KISS,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,1),
                        new MoveLearnSetEntry(Move.REFRESH,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.WRING_OUT,1),
                        new MoveLearnSetEntry(Move.MILK_DRINK,1),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,1),
                        new MoveLearnSetEntry(Move.FLAIL,1),
                        new MoveLearnSetEntry(Move.CREAM_WHIP,44),
                        new MoveLearnSetEntry(Move.PRESENT,50),
                        new MoveLearnSetEntry(Move.SUGAR_RUSH,58),
                        new MoveLearnSetEntry(Move.FLAVOR_TEST,62),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.BENEVOLENCE,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_WALL,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 30, 43, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
