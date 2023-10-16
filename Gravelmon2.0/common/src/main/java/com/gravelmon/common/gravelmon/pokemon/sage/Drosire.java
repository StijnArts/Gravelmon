package com.gravelmon.common.gravelmon.pokemon.sage;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Drosire extends Pokemon {
    public Drosire() {
        super("Drosire",
                Type.GRASS,
                new Stats(48, 54, 68, 63, 55, 29),
                List.of(Ability.SUN_BATHE, Ability.CHLOROPHYLL), Ability.SWEET_VEIL,
                6, 81,
                new Stats(0,0,1,0,0,0), 120,
                0.5,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                39, List.of(EggGroup.GRASS),
                List.of("Drosire cannot draw nutrients from the soil, so it uses its vines to hang from trees and catch bugs. Unaware humans may accidentally walk into it face first."),
                List.of(new EvolutionEntry("sunduke", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:sun_stone")),
                List.of(
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.ABSORB,4),
                        new MoveLearnSetEntry(Move.STUN_SPORE,7),
                        new MoveLearnSetEntry(Move.VINE_WHIP,10),
                        new MoveLearnSetEntry(Move.ACID,14),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,17),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,20),
                        new MoveLearnSetEntry(Move.GROWTH,24),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,27),
                        new MoveLearnSetEntry(Move.LEAF_SHIELD,30),
                        new MoveLearnSetEntry(Move.POISON_JAB,34),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,37),
                        new MoveLearnSetEntry(Move.TICKLE,40),
                        new MoveLearnSetEntry(Move.WRING_OUT,44),
                        new MoveLearnSetEntry(Move.LEECH_SEED,47),
                        new MoveLearnSetEntry(Move.SYNTHESIS,50),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,54),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,57),
                        new MoveLearnSetEntry(Move.POWER_WHIP,60),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,64),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,"tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tutor")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:cactus",90, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 5, 28, 3.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DESERT,Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.27, 0.5,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
