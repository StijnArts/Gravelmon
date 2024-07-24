package drai.dev.data.pokemon.flux.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class AlteranOwten extends Pokemon {
    public AlteranOwten(String name, Aspect aspect) {
        super(name, aspect,"AlteranOwten",
                Type.FAIRY, Type.FLYING,
                new Stats(50,40,30,60,35,75),
                List.of(Ability.SERENE_VEIL, Ability.CUTE_CHARM), Ability.AERILATE,
                3, 23,
                new Stats(0,0,0,0,0,1), 200,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.FLYING, EggGroup.FIELD),
                List.of("Alteran OWTEN is beloved by many due to its cute appearance and lovely singing voice. It knows this, and is not above using cuteness to get what it wants"),
                List.of(new EvolutionEntry("alteraneshouten", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"220")))),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.DEFOG,4),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,7),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,10),
                        new MoveLearnSetEntry(Move.SING,13),
                        new MoveLearnSetEntry(Move.ROUND,16),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,19),
                        new MoveLearnSetEntry(Move.AIR_SLASH,22),
                        new MoveLearnSetEntry(Move.HAZE,25),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,28),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,31),
                        new MoveLearnSetEntry(Move.PERISH_SONG,34),
                        new MoveLearnSetEntry(Move.HURRICANE,37),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.TAILWIND,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"egg"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"egg"),
                        new MoveLearnSetEntry(Move.LAST_RESORT,"egg")
                        ),
                List.of(Label.URANIUM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 5, 21, 1.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        setCanFly(true);
    }
}
