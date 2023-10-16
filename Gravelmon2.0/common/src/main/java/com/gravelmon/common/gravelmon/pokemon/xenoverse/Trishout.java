package com.gravelmon.common.gravelmon.pokemon.xenoverse;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Trishout extends Pokemon {
    public Trishout() {
        super("Trishout",
                Type.FIRE, Type.SOUND,
                new Stats(58, 75, 50, 65, 44, 58),
                List.of(Ability.KEEN_EYE), Ability.VOICE_TUNING,
                5, 65,
                new Stats(0,2,0,0,0,0), 45,
                -1,
                90, ExperienceGroup.SLOW,
                70,
                41, List.of(EggGroup.UNDISCOVERED),
                List.of("Despite its size, it can already shout very loudly. If it cries too much, it becomes voiceless and coughs smoke."),
                List.of(new EvolutionEntry("trishoutterrestrial", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"minecraft:deepslate\""))),
                        new EvolutionEntry("trishoutxenoversal", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"minecraft:end_stone\""))),
                        new EvolutionEntry("trishoutastral", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"minecraft:diamond\""),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50")))),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BABBLE,6),
                        new MoveLearnSetEntry(Move.HOWL,9),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,13),
                        new MoveLearnSetEntry(Move.FIRE_FANG,18),
                        new MoveLearnSetEntry(Move.UPROAR,23),
                        new MoveLearnSetEntry(Move.SCREECH,28),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,32),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,36),
                        new MoveLearnSetEntry(Move.SWAGGER,40),
                        new MoveLearnSetEntry(Move.BOOMBURST,45),
                        new MoveLearnSetEntry(Move.INFERNO,51),
                        new MoveLearnSetEntry(Move.CRUNCH,56),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,61),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SUBWOOFER,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.BLAST_BURN,"tutor"),
                        new MoveLearnSetEntry(Move.CHEERING,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.SCORCHED_ASHES,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SOUND_BARRIER,"tutor"),
                        new MoveLearnSetEntry(Move.SOUND_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.STAR_BURST,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.9, 1,
                List.of());
        this.setShoulderMountable(true);
        this.setWillSleepOnBed(true);
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setModeled(true);
        this.setBaseScale(0.9);
    }
}
