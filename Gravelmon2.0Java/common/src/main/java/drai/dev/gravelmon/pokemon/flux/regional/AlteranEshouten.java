package drai.dev.gravelmon.pokemon.flux.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class AlteranEshouten extends Pokemon {
    public AlteranEshouten(int dexNo) {
        super(dexNo,"AlteranEshouten",
                Type.FAIRY, Type.FLYING,
                new Stats(75,65,55,85,60,110),
                List.of(Ability.SERENE_VEIL, Ability.CUTE_CHARM), Ability.AERILATE,
                9, 122,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                158, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.FLYING, EggGroup.FIELD),
                List.of("People and Mon of all sorts follow it around to hear it sing. Analyzing its songs has determined that it views these hangers-on with disdain."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WHIRLWIND,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.DEFOG,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,10),
                        new MoveLearnSetEntry(Move.SING,13),
                        new MoveLearnSetEntry(Move.ROUND,16),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,19),
                        new MoveLearnSetEntry(Move.AIR_SLASH,24),
                        new MoveLearnSetEntry(Move.HAZE,29),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,34),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,39),
                        new MoveLearnSetEntry(Move.PERISH_SONG,44),
                        new MoveLearnSetEntry(Move.HURRICANE,49),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.TAILWIND,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_EDGE,"egg"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"egg"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"egg")
                        ),
                List.of(Label.URANIUM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 20, 49, 0.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        setCanFly(true);
    }
}
